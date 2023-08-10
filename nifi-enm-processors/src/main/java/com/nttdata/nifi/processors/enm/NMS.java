package com.nttdata.nifi.processors.enm;

import joptsimple.OptionSet;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class NMS {
    private static final Logger logger = Logger.getLogger(String.valueOf(NMS.class));

    private final int plainPort;
    private final int securePort;
    private final String vendor;
    private final String networkType;

    private String ior;

    public NMS(final int plainPort, final int securePort, final String vendor, final String networkType) {
        this.plainPort = plainPort;
        this.securePort = securePort;
        this.vendor = vendor;
        this.networkType = networkType;
    }

    public void start() throws Exception {

        if (!("Nokia".equals(vendor) || "Huawei".equals(vendor) || "Ericsson".equals(vendor))) {
            logger.warning("El vendor debe ser Ericsson, Nokia o Huawei");
            logger.warning("Vendor (" + vendor + ")");
        }

        final String[] args = {
                String.valueOf(plainPort),
                String.valueOf(securePort),
                vendor,
                networkType
        };

        OptionSet options = Utils.parseArgs(args, helpText);

        Parameter4PushConsumer firstPara = ServerCreateTask.initParas(options, args, vendor, networkType);

        firstPara.setPort(plainPort);
        firstPara.setSslPort(securePort);

        int serverNumber = firstPara.getServerNumber();

        IORFileWriter.init(serverNumber, firstPara.isWriteIOR(), firstPara.getIORFilePath());
        ExecutorService executorService = Executors.newCachedThreadPool();

        final Parameter4PushConsumer parameter = ServerCreateTask.initParas(options, args, vendor, networkType);
        parameter.setPort(plainPort);
        parameter.setSslPort(securePort);

        final ServerCreateTask task = new ServerCreateTask(parameter, executorService, vendor, networkType);
        executorService.submit(task);

        logger.info("Local IOR generated");

        ior = task.getIOR();
    }
    public String getIor() {
        return ior;
    }

    public static void shutdown() {
        try {
            ServerCreateTask.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String helpText = "************Example*************" +
            "\n\r1. Normal usage, just print the events to console" +
            "\n\r   java -jar PushConsumerServer.jar" +
            "\n\r2. Normal usage with channel name" +
            "\n\r   java -jar PushConsumerServer.jar -channelname=3GPP-Corba-NB" +
            "\n\r3. Pet usage for print events to log files" +
            "\n\r   java -jar PushConsumerServer.jar -pet -logpath=test1/test.log -print=simple" +
            "\n\r4. Pet usage for analysis events" +
            "\n\r   java -jar PushConsumerServer.jar -pet -a -file=test1/test1.log -logpath=analysis_result.log" +
            "\n\r********************************";

}

