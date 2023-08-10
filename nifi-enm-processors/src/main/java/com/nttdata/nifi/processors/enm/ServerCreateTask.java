package com.nttdata.nifi.processors.enm;

import joptsimple.OptionSet;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;


public class ServerCreateTask implements Callable<String> {
    private static final Logger LOGGER = Logger.getLogger(ServerCreateTask.class);

    private final ExecutorService executorService;
    private static PushConsumerServer ps;
    private AttachTask attachTask;

    public ServerCreateTask(Parameter4PushConsumer parameter, ExecutorService executorService, String vendor, String network_type) throws Exception {
        this.ps = new PushConsumerServer(parameter, vendor, network_type);
        this.executorService = executorService;
        LOGGER.info("creating  one consumer");
        this.ps.start();
        if (parameter.isAutoAttach()) {
            this.attachTask = new AttachTask(this.ps.getIorStr());
        }
    }

    public String getIOR() throws Exception {
        return this.ps.getIorStr();
    }

    public static void shutdown() {
        try {
            ps.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String call() throws Exception {
        if (this.attachTask != null) {
            this.executorService.execute(this.attachTask);
        }
        this.ps.blockingRun();
        return "done";
    }


    public static Parameter4PushConsumer initParas(OptionSet options, String[] jacorbArgs, String vendor, String network_type) throws IOException {
        Parameter4PushConsumer parameter = new Parameter4PushConsumer();
        parameter.setArgs(jacorbArgs);

        if (options.has("servernumber")) {
            int serverNumber = (int) options.valueOf("servernumber");
            parameter.setServerNumber(serverNumber);
        }
        if (options.has("p")) {
            parameter.setPersistent(true);
            LOGGER.debug("persistent: " + parameter.isPersistent());
        }

        if (options.has("port")) {
            int port = (Integer) options.valueOf("port");
            parameter.setPort(port);
            LOGGER.debug("port: " + parameter.getPort());
        }

        if (options.has("ssl-port")) {
            int sslPort = (Integer) options.valueOf("ssl-port");
            parameter.setSslPort(sslPort);
            LOGGER.debug("SSL port: " + parameter.getSslPort());
        }

        if (options.has("attach")) {
            parameter.setAutoAttach((Boolean) options.valueOf("attach"));
        }

        if (options.has("d")) {
            long delay = (Long) options.valueOf("d");
            parameter.setDelay(delay);
            LOGGER.debug("delay: " + parameter.getDelay());
        }

        if (options.has(ConstDef.IS_WRITE_IOR)) {
            parameter.setWriteIOR((Boolean) options.valueOf(ConstDef.IS_WRITE_IOR));
        }
        if (options.has(ConstDef.WRITE_IOR_PATH)) {
            parameter.setTheIORFilePath((String) options.valueOf(ConstDef.WRITE_IOR_PATH));
        }
        if (options.has("channelname") && options.has("c")) {
            String channel = (String) options.valueOf("channelname");
            Boolean createIfNotExist = (Boolean) options.valueOf("c");

            parameter.setChannelName(channel);
            parameter.setCreateIfNotExist(createIfNotExist);
        } else if (options.has("pet")) {
            parameter.setPET(true);
            if (options.has("logpath")) {
                String logFullPath = (String) options.valueOf("logpath");
                parameter.setLogFullPath(logFullPath);
            }

            if (options.has("print")) {
                String printMode = (String) options.valueOf("print");
                parameter.setPrintMode(printMode);
            }

            if (options.has("a")) {
                Boolean statistic = (Boolean) options.valueOf("a");
                parameter.setStatistic(statistic);

                if (!options.has("logpath")) {
                    System.out.println("must set a new log file for statistic");
                    System.exit(0);
                }
                if (options.has("file")) {
                    String simpleOutPath = (String) options.valueOf("file");
                    parameter.setSimpleOutPath(simpleOutPath);
                }
                EventsHandler eventHandler = new EventsHandler(parameter, vendor, network_type);
                eventHandler.stop();
                System.exit(0);
            }

            if (options.has("attributes")) {
                HashSet<String> eventsAttributes = new HashSet<String>();
                String[] atts = ((String) options.valueOf("attributes")).split(",");
                for (String att : atts) {
                    if (!att.isEmpty()) {
                        eventsAttributes.add(att.trim());
                    }
                }
                parameter.setEventsAttributes(eventsAttributes);
            }

            if (options.has("queueSize")) {
                int queueSize = (Integer) options.valueOf("queueSize");
                parameter.setQueueSize(queueSize);
                LOGGER.debug("queue size: " + parameter.getQueueSize());
            }
            if (options.has("period")) {
                int period = (Integer) options.valueOf("period");
                parameter.setPeriod(period);
                LOGGER.debug("period: " + parameter.getPeriod());
            }
            if (options.has("number")) {
                int number = (Integer) options.valueOf("number");
                parameter.setNumber(number);
                LOGGER.debug("number: " + parameter.getNumber());
            }
            if (options.has("sleep")) {
                long sleep = (Long) options.valueOf("sleep");
                parameter.setSleep(sleep);
                LOGGER.debug("sleep: " + parameter.getSleep());
            }
        }

        return parameter;
    }
}

