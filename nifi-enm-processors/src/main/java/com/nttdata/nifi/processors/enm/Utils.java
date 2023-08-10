package com.nttdata.nifi.processors.enm;

import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.IOException;

public class Utils {

    public static OptionSet parseArgs(String[] args, String helpText) throws IOException {
        OptionSet options = null;
        OptionParser parser = new OptionParser() {
        };

        try {
            options = parser.parse(args);
        } catch (Exception e) {
            parser.printHelpOn(System.out);
            System.exit(0);
        }

        if (options.has("?")) {
            System.out.println(helpText);
            parser.printHelpOn(System.out);
            System.exit(0);
        }
        return options;
    }
}
