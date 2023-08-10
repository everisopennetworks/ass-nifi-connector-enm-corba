package com.nttdata.nifi.processors.enm;

import java.util.HashMap;
import java.util.HashSet;

public class ConstDef {
    public static final String OPT_PERIOD = "period";
    public static final String OPT_FILE = "file";
    public static final String OPT_ALARM_TYPE = "alarmtype";
    public static final String OPT_COUNT = "number";
    public static final String OPT_CHANNEL = "channelname";
    public static final String OPT_THREAD_NUM = "threadNum";
    public static final String SERVER_NUM = "servernumber";
    public static final String SPLIT_FLAG = "@";
    public static final String OPT_ATTACH = "attach";
    public static final String OPT_C = "c";
    public static final String OPT_Q = "q";
    public static final String OPT_PET = "pet";
    public static final String OPT_PRINT = "print";
    public static final String OPT_PRINT_ALL = "all";
    public static final String OPT_PRINT_SIMPLE = "simple";
    public static final String OPT_PORT = "port";
    public static final String OPT_SSL_PORT = "ssl-port";
    public static final String OPT_P = "p";
    public static final String OPT_FORMAT = "f";
    public static final String OPT_EVENTS_ATTRIBUTES = "attributes";
    public static final String OPT_A = "a";
    public static final String OPT_SLEEP = "sleep";
    public static final String OPT_DELAY = "d";
    public static final String OPT_QUEUE_SIZE = "queueSize";
    public static final String OPT_LOG_FULL_FILE_PATH = "logpath";
    public static final String ALARM_ALL = "ALARM_ALL";
    public static final String MO_ADD = "MO_ADD";
    public static HashMap<String, String> alarmTypeMaps = new HashMap();
    public static String IS_WRITE_IOR = "iswriteior";
    public static String WRITE_IOR_PATH = "writeIorPath";

    public static HashSet<String> eventsAttributesMaps;

    static {
        alarmTypeMaps.put("ALARM_NEW", "x1");
        alarmTypeMaps.put("ALARM_STATE_CHG", "x2");
        alarmTypeMaps.put("ACK_STATE_CHG", "x3");
        alarmTypeMaps.put("ALARM_CLEAR", "x5");
        alarmTypeMaps.put("ALARM_LIST_REBUILT", "x6");
        alarmTypeMaps.put("ALARM_ALL", "ALARM_ALL");
        alarmTypeMaps.put("MO_ADD", "x6");


        eventsAttributesMaps = new HashSet();

        eventsAttributesMaps.add("event_name");
        eventsAttributesMaps.add("domain_name");
        eventsAttributesMaps.add("type_name");
        eventsAttributesMaps.add("e");
        eventsAttributesMaps.add("d");
        eventsAttributesMaps.add("a");
        eventsAttributesMaps.add("b");
        eventsAttributesMaps.add("c");
        eventsAttributesMaps.add("g");
        eventsAttributesMaps.add("h");
        eventsAttributesMaps.add("i");
        eventsAttributesMaps.add("j");
        eventsAttributesMaps.add("additionalInformation");
        eventsAttributesMaps.add("userAdditionalInformation");
        eventsAttributesMaps.add("diagnosticInformation");
        eventsAttributesMaps.add("f");
    }


}

