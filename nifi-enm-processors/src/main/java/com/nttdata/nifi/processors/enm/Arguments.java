package com.nttdata.nifi.processors.enm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arguments {
    protected static Arguments inst = new Arguments();

    private List<String> params = new ArrayList();
    private Map<String, String> options = new HashMap();
    private int paramIndex = 0;

    public static Arguments I() {
        return inst;
    }

    public void parse(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];


            if (arg.startsWith("-") || arg.startsWith("/")) {
                int loc = args[i].indexOf("=");
                String key = (loc > 0) ? arg.substring(1, loc) : arg.substring(1);
                String value = (loc > 0) ? arg.substring(loc + 1) : "";
                this.options.put(key.toLowerCase(), value);

                System.out.println("key: " + key + " value: " + value);
            } else {
                this.params.add(arg);
            }
        }
        if (!this.options.containsKey("piid")) {
            this.options.put("piid", "1");
        }
    }


    public boolean hasOption(String opt) {
        return this.options.containsKey(opt.toLowerCase());
    }


    public String getOption(String opt) {
        return (String) this.options.get(opt.toLowerCase());
    }

    public void putOption(String opt, String value) {
        this.options.put(opt.toLowerCase(), value);
    }


    public int size() {
        return this.params.size() + this.options.size();
    }
}
