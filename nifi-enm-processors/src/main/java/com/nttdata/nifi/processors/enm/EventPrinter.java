package com.nttdata.nifi.processors.enm;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nttdata.nifi.processors.enm.models.Event;
import com.nttdata.nifi.processors.enm.models.EventEricsson;
import com.nttdata.nifi.processors.enm.models.EventNokia;
import com.nttdata.nifi.processors.enm.FlowWriter;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.omg.CORBA.Any;
import org.omg.CosNotification.Property;
import org.omg.CosNotification.StructuredEvent;
import org.omg.Security.UtcTHelper;

import java.text.SimpleDateFormat;
import java.util.*;

public class EventPrinter {
    public static ObjectMapper objectMapper = new ObjectMapper();

    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    public static void printEvents(List<StructuredEvent> events, String vendor, String netWorkType) {
        System.out.println(toString(events, vendor, netWorkType));
        String alarmEvent = toString(events, vendor, netWorkType);
        FlowWriter.writeFlowFile(alarmEvent);
    }

    public static String toString(List<StructuredEvent> events, String vendor, String netWorkType) {
        return toString(vendor, netWorkType, events.toArray(new StructuredEvent[0]));
    }

    public static String toString(String vendor, String netWorkType, StructuredEvent... events) {
        StringBuilder sb = new StringBuilder();

        for (StructuredEvent se : events) {

            Event event = "Nokia".equals(vendor) ? new EventNokia() : new EventEricsson();
            event.setNetworkType(netWorkType);

            HashMap<String, Object> properties = new HashMap<>();
            properties.put("event_name", se.header.fixed_header.event_name);
            //properties.put("event_type",se.header.fixed_header.event_type.type_name);
            assignProperties(se, event);
            properties.put("remainder_of_body", replaceSpecialCharacters(CorbaFacility.toString(se.remainder_of_body, false)));
            event.setProperties(properties);

            if ("Ericsson".equals(vendor)) {

                assignProperties(se, event);
                String[] remainder_of_body_parts = StringUtils.substringsBetween(replaceSpecialCharacters(CorbaFacility.toString(se.remainder_of_body, false)), "{", "}");

                for (String propertyPart : remainder_of_body_parts) {

                    String[] propertiesInfo = propertyPart.split(" , ");

                    if (propertiesInfo[0].trim().equals("i")) {
                        event.setAlarmTypeId(Long.parseLong(propertiesInfo[1]));
                    } else if (propertiesInfo[0].trim().equals("f")) {
                        event.setExternalAlarmId(propertiesInfo[1]);
                    }

                    if (propertiesInfo.length == 2) {
                        properties.put("remainder_of_body_" + propertiesInfo[0].trim(), propertiesInfo[1]);
                    } else if (propertiesInfo.length == 1) {
                        properties.put("remainder_of_body_" + propertiesInfo[0].trim(), "");
                    }
                }
                event.setProperties(properties);
            }
            sb.append(event.toString());
        }

        return sb.toString();
    }

    private static String replaceSpecialCharacters(String input) {
        return input.replace("\\", "\\\\")
                .replace("\n", "\\n")
                .replace("\b", "")
                .replace("\f", "")
                .replace("\r", "")
                .replace("\t", "")
                .replace("\"", "\\\"");
    }

    static void printEventsWithAttr(List<StructuredEvent> events, HashSet<String> attributes, Logger logger, String vendor, String network_type) {
        logger.info(toAlarmInfo(events, attributes, vendor, network_type));
    }

    private static void assignProperties(Property[] props, Event event) {
        HashMap<String, Object> properties = new HashMap<>();
        for (Property p : props) {
            properties.put(p.name, CorbaFacility.toString(p.value, false));
        }
        event.setProperties(properties);
    }

    private static void assignProperties(StructuredEvent se, Event event) {
        Property[] fb = se.filterable_data;
        assignProperties(fb, event);
        Property[] headProperties = se.header.variable_header;
        assignProperties(headProperties, event);
    }

    private static String toAlarmInfo(List<StructuredEvent> events, HashSet<String> attributes, String vendor, String network_type) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, Object> properties = new HashMap<>();
        for (StructuredEvent se : events) {
            Event event = "Nokia".equals(vendor) ? new EventNokia() : new EventEricsson();
            event.setNetworkType(network_type);
            properties.put("event_name", se.header.fixed_header.event_name);
            assignProperties(se, event);
            System.out.println("Remainder of body class: " + se.remainder_of_body.getClass());
            properties.put("remainder_of_body", replaceSpecialCharacters(CorbaFacility.toString(se.remainder_of_body, false)));
            Any any = se.remainder_of_body;
            System.out.println("Remainder of body");
            System.out.println(any.getClass());
            event.setProperties(properties);
            sb.append(event.toString());
        }

        return sb.toString();
    }

    static void printMsg(String msg, boolean isPete, Level logLevel, Logger logger) {
        if (isPete) {
            if (logLevel != null) {
                if (logLevel.equals(Level.INFO)) {
                    logger.info(msg);
                } else if (logLevel.equals(Level.DEBUG)) {
                    logger.debug(msg);
                } else if (logLevel.equals(Level.WARN)) {
                    logger.warn(msg);
                } else if (logLevel.equals(Level.ERROR)) {
                    logger.error(msg);
                }
            } else {
                logger.debug(msg);
            }
        } else {
            System.out.println(msg);
        }
    }

    static void printSimplePETData(List<StructuredEvent> events, HashSet<String> attributes, Logger logger) {
        StringBuilder sb = new StringBuilder();
        NotificationInfo nto = new NotificationInfo();
        for (StructuredEvent se : events) {

            try {
                nto.alarmType = se.header.fixed_header.event_type.type_name;
                Property[] fb = se.filterable_data;
                nto.irpVer = se.header.fixed_header.event_type.domain_name;
                for (Property p : fb) {

                    if ("a".equals(p.name)) {
                        nto.alarmID = p.value.toString().trim();
                    }

                    if ("b".equals(p.name)) {
                        Calendar now = new GregorianCalendar();
                        long milliseconds = CorbaFacility.unixTime(UtcTHelper.extract(p.value));
                        now.setTimeInMillis(milliseconds);
                        nto.delayTime = (System.currentTimeMillis() - milliseconds) / 1000L;
                        nto.generateTime = DATE_FORMAT.format(now.getTime());
                        nto.receiveTime = DATE_FORMAT.format(Calendar.getInstance().getTime());
                    }
                }
            } catch (Exception e) {
            }
            sb.append("@").append(nto.alarmID).append("|").append(nto.alarmType).append("|").append(nto.irpVer)
                    .append("|").append(nto.delayTime).append("|").append(nto.generateTime).append("|")
                    .append(nto.receiveTime);

            logger.info(sb.toString());
            sb.setLength(0);
        }
    }

    private static class NotificationInfo {
        private NotificationInfo() {
        }

        public String irpVer = "";
        public String alarmID = "0";
        public String alarmType = "";
        public String receiveTime = null;
        public String generateTime = null;
        public long delayTime = 0L;
    }

}
