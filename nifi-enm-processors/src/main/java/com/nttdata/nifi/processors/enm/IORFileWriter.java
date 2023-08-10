package com.nttdata.nifi.processors.enm;

import org.apache.log4j.Logger;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

public class IORFileWriter {
    private static Logger LOGGER = Logger.getLogger(IORFileWriter.class);

    private static PrintWriter writer = null;

    private static AtomicInteger iorNumber;

    private static boolean isWriteIOR;

    public static void init(int number, boolean writeIOR, String iorFilePath) {
        isWriteIOR = writeIOR;
        if (isWriteIOR) {
            try {
                iorNumber = new AtomicInteger(number);
                writer = new PrintWriter(new OutputStreamWriter(
                        new FileOutputStream("ior_servers.list"), StandardCharsets.UTF_8)
                );
            } catch (IOException ex) {
                LOGGER.error(ex);
            }
        }
    }

    public static void writeIOR(String ior) {
        if (isWriteIOR) {
            writer.println(ior);

            if (iorNumber.decrementAndGet() == 0)
                try {
                    writer.close();
                    LOGGER.debug("closed file");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        }
    }
}

