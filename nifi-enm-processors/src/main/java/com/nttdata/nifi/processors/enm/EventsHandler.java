package com.nttdata.nifi.processors.enm;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.omg.CosNotification.StructuredEvent;

import java.io.*;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class EventsHandler {
    private BlockingQueue<StructuredEvent> queue;
    private static final Logger LOGGER = Logger.getLogger(EventsHandler.class);
    private Parameter4PushConsumer parameters;
    private long startTime;
    private String startTimeStr;
    private boolean stop;

    private String vendor, network_type;

    public EventsHandler(Parameter4PushConsumer parameters, String vendor, String network_type) {
        this.stop = false;

        this.logsMap = new HashMap();

        this.parameters = parameters;
        this.queue = new LinkedBlockingQueue(parameters.getQueueSize());

        this.vendor = vendor;
        this.network_type = network_type;
    }

    private Map<Long, File> logsMap;

    class ReceiveNotificationThread implements Runnable {

        public void run() {
            while (!EventsHandler.this.stop) {
                try {
                    EventsHandler.this.print();
                } catch (InterruptedException e) {
                    LOGGER.error(e);
                    break;
                }
            }
        }
    }

    public void start() {
        this.stop = false;
        (new Thread(new ReceiveNotificationThread(), "ReceiveNotification")).start();
    }

    public void stop() {
        LOGGER.debug("stop EventsHandler");
        this.stop = true;
        analysePetData(this.parameters.getSimpleOutPath());
    }

    public void insert(StructuredEvent se) {
        LOGGER.debug("Received one event");
        this.startTime = System.currentTimeMillis();
        this.startTimeStr = EventPrinter.DATE_FORMAT.format(Calendar.getInstance().getTime());
        try {
            while (!this.queue.offer(se, this.parameters.getSleep(), TimeUnit.MILLISECONDS)) {
                LOGGER.error("cannot insert to event to queue,sleep " + this.parameters.getSleep());
            }
        } catch (InterruptedException e) {
            LOGGER.error("Sleep error!", e);
            Thread.currentThread().interrupt();
        }
    }

    public List<StructuredEvent> getEvents() throws InterruptedException {
        List<StructuredEvent> ses = new ArrayList<StructuredEvent>();
        StructuredEvent event = (StructuredEvent) this.queue.take();
        ses.add(event);
        return ses;
    }

    private void print() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        boolean isPete = this.parameters.isPET();
        boolean printTimeFlag = false;
        int printCount = 0;


        List<StructuredEvent> notifications = getEvents();
        int notificationSize = notifications.size();
        if (notificationSize > 0) {
            printCount += notificationSize;
            if (this.parameters.isPET()) {
                if (this.parameters.getPrintMode().equals("all")) {
                    if (this.parameters.getEventsAttributes() != null &&
                            !this.parameters.getEventsAttributes().isEmpty()) {
                        EventPrinter.printMsg("Print events size:" + notificationSize, isPete, Level.DEBUG, LOGGER);
                        EventPrinter.printEventsWithAttr(notifications, this.parameters.getEventsAttributes(), LOGGER, vendor, network_type);
                    } else {

                        EventPrinter.printEventsWithAttr(notifications, ConstDef.eventsAttributesMaps, LOGGER, vendor, network_type);
                    }
                } else {
                    EventPrinter.printSimplePETData(notifications, null, LOGGER);
                }
            } else {
                EventPrinter.printEvents(notifications, vendor, network_type);
            }
        }
        if (printTimeFlag && isPete) {
            long endTime = System.currentTimeMillis();
            EventPrinter.printMsg("print() end: " + new Date(endTime) + ", event count: " + printCount + ", cost: " + (endTime - startTime) + "ms", isPete, Level.DEBUG, LOGGER);
        }
    }


    private List<Long> getLogsFile(String filePath) {
        final File file = new File(filePath);
        File[] logFiles = null;
        if (file.exists()) {
            logFiles = file.getParentFile().listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.startsWith(file.getName());
                }
            });
        }
        List<Long> newFiles = new ArrayList<Long>();
        if (logFiles != null) {
            for (File log : logFiles) {
                this.logsMap.put(Long.valueOf(log.lastModified()), log);
                newFiles.add(Long.valueOf(log.lastModified()));
            }
        }
        Collections.sort(newFiles);
        return newFiles;
    }


    private void analysePetData(String filePath) {
        String endTimeStr = EventPrinter.DATE_FORMAT.format(Calendar.getInstance().getTime());
        double delayAlarmTimeTotal = 0.0D;
        long maxDelayAlarmTime = 0L;
        int[] counter = new int[3];
        int totalAlarmCount = 0;
        FileReader fr = null;

        List<Long> logFiles = getLogsFile(filePath);
        for (Long logTime : logFiles) {
            try {
                Long lineNum = 0L;
                File logFile = (File) this.logsMap.get(logTime);
                fr = new FileReader(logFile);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    lineNum++;
                    try {
                        if (!line.contains("@")) {
                            continue;
                        }
                        String alarms = line.split("@")[1];

                        if (alarms.isEmpty()) {
                            continue;
                        }

                        String[] strs = alarms.split("\\|");
                        if (endTimeStr.length() < 7 || !strs[2].contains("32.111 V6.2")) {
                            continue;
                        }

                        long delayTime = Long.valueOf(strs[3].trim()).longValue();
                        endTimeStr = strs[5].trim();


                        if (this.startTimeStr == null) {
                            this.startTimeStr = strs[5].trim();
                        }


                        EventPrinter.printMsg("File:" + logFile
                                .getName() + "(" + lineNum + "),delayTime:" + delayTime, false, Level.INFO, LOGGER);

                        if (delayTime > maxDelayAlarmTime) {
                            maxDelayAlarmTime = delayTime;
                        }
                        if (delayTime > 10L) {
                            counter[0] = counter[0] + 1;
                        }
                        if (delayTime > 40L) {
                            counter[1] = counter[1] + 1;
                        }
                        if (delayTime > 300L) {
                            counter[2] = counter[2] + 1;
                        }
                        delayAlarmTimeTotal += delayTime;
                        totalAlarmCount++;
                    } catch (Exception ee) {
                        EventPrinter.printMsg("failed in " + logFile
                                .getName() + ":" + lineNum + "[" + line + "]", false, Level.INFO, LOGGER);
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error(e);
            } finally {
                if (fr != null) {
                    try {
                        fr.close();
                    } catch (IOException iOException) {
                    }
                }
            }
        }


        double averageDelayTime = delayAlarmTimeTotal / totalAlarmCount;
        String result = "=====================================================\nStart at:" + this.startTimeStr + "\nEnd   at:" + endTimeStr + "\n=====================================================\nReceive Total      = " + totalAlarmCount + "\nAverage Delay Time = " + String.format("%.2f", new Object[]{Double.valueOf(averageDelayTime)}) + " s\nMax Delay Time     = " + maxDelayAlarmTime + " s\n=====================================================\ndelayTime(s)          delayCount             percent(%)\n=====================================================\n>10                   " + String.format("%-15d", new Object[]{Integer.valueOf(counter[0])}) + "        " + String.format("%.2f", new Object[]{Double.valueOf(counter[0] / totalAlarmCount * 100.0D)}) + "\n>40                   " + String.format("%-15d", new Object[]{Integer.valueOf(counter[1])}) + "        " + String.format("%.2f", new Object[]{Double.valueOf(counter[1] / totalAlarmCount * 100.0D)}) + "\n>300                  " + String.format("%-15d", new Object[]{Integer.valueOf(counter[2])}) + "        " + String.format("%.2f", new Object[]{Double.valueOf(counter[2] / totalAlarmCount * 100.0D)}) + "\n=====================================================\n";

        EventPrinter.printMsg(result, true, Level.INFO, LOGGER);
        EventPrinter.printMsg(result, false, Level.INFO, LOGGER);
    }
}

