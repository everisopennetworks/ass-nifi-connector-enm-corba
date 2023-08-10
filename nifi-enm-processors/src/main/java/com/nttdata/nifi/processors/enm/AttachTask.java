package com.nttdata.nifi.processors.enm;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class AttachTask implements Runnable {
    private String iorStr;
    private static final Logger LOGGER = Logger.getLogger(AttachTask.class);


    public AttachTask(String iorStr) {
        this.iorStr = iorStr;
    }


    public void run() {
        IORFileWriter.writeIOR(this.iorStr);

        String attachOpt = "java -jar NotificationIRPSim.jar -o=attach_push -mr=" + this.iorStr;

        try {
            Thread.sleep(5000L);
            LOGGER.info("try to attach");
            try {
                Process process = Runtime.getRuntime().exec(attachOpt);
                InputStream fis = process.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));

                StringBuilder cmdout = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    cmdout.append(line).append(System.getProperty("line.separator"));
                }
                LOGGER.info(cmdout.toString());
            } catch (IOException e) {
                LOGGER.error(e.getMessage());
                e.printStackTrace();
            }

        } catch (InterruptedException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        }
    }
}

