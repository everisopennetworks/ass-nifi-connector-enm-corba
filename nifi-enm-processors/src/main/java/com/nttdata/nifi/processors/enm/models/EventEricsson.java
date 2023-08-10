package com.nttdata.nifi.processors.enm.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EventEricsson extends Event {

    public EventEricsson() {
        setVendorName("Ericsson");
        setSourceSystem("ENM");
    }

    /*
    @Override
    public String getAlarmedObjectName() { }
    @Override
    public String getAlarmDetail() { }
    @Override
    public String getLeannoc_id() {
        this.get;
    }*/

    @Override
    public void setValue(String variable, String value) {
        switch (variable) {
            case "a":
                //setExternalAlarmId(value);
                break;
            case "k":
                setAlarmTypeId(Long.parseLong(value));
                break;
            case "f":
                String patron;
                if (value.contains("EUtranCellFDD")) {
                    patron = ".*EUtranCellFDD=(\\S+).*";
                } else if (value.contains("GsmSector")) {
                    patron = ".*GsmSector=(\\S+).*";
                } else if (value.contains("RadioEquipmentClockReference")) {
                    patron = ".*ManagedElement=(\\S+),Transport.*";
                } else {
                    patron = "MeContext=(\\S+),.*";
                }
                Pattern p = Pattern.compile(patron);
                Matcher m = p.matcher(value);
                if (m.find()) {
                    String context = m.group(1);
                    //context=context.replace("MeContext=","");
                    setLeannoc_id(context);
                    setAlarmedObjectName(context);
                } else {
                    String context = value.replace("MeContext=", "");
                    setLeannoc_id(context);
                    setAlarmedObjectName(context);
                }
                setAlarmedObjectId(value);
                break;
            case "e":
                setAlarmedObjectType(value);
                break;
            case "h":
                if (value.toUpperCase().contains("CRITICAL") || value.toUpperCase().contains("2")) {
                    setPerceivedSeverity("2");
                    setEventType("x1");
                } else if (value.toUpperCase().contains("MAJOR") || value.toUpperCase().contains("3")) {
                    setPerceivedSeverity("3");
                    setEventType("x1");
                } else if (value.toUpperCase().contains("MINOR") || value.toUpperCase().contains("4")) {
                    setPerceivedSeverity("4");
                    setEventType("x1");
                } else if (value.toUpperCase().contains("WARNING") || value.toUpperCase().contains("5")) {
                    setPerceivedSeverity("5");
                    setEventType("x1");
                } else if (value.toUpperCase().contains("CLEAR") || value.toUpperCase().contains("6")) {
                    setPerceivedSeverity("1");
                    setEventType("x5");
                } else {
                    setPerceivedSeverity("1");
                    setEventType("x1");
                }
                break;
            case "g":
                setProbableCause(value);
                break;
            case "i":
                setSpecificProblem(value);
                break;
            case "j":
                setAlarmDetail(value);
                break;
            case "c":
                //System.out.println("el valor es: "+value);
                Pattern ts = Pattern.compile("\\{(\\d+)\\s+,.*");
                Matcher m2 = ts.matcher(value);
                if (m2.find()) {
                    String partialdate = m2.group(1);
                    //System.out.println("Entro a match la fecha es "+partialdate);
                    long sdf = (((Long.parseLong(partialdate) / Long.parseLong("10000000")) - Long.parseLong("12219292800")) * 1000L);
                    //System.out.println("Debera setear "+sdf);
                    setAlarmRaisedTime(sdf);
                }
                break;
            default:
                super.setValue(variable, value);
                break;
        }
        //putProperty(variable,value);
    }

    protected void setValue(String variable, long value) {
        switch (variable) {
            case "c":
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                try {
                    Date date = sdf.parse(Long.toString(value));
                    setAlarmRaisedTime(date.getTime());
                } catch (java.text.ParseException e) {
                    e.printStackTrace();
                }

                break;
            case "remainder_of_body_i":
                setAlarmTypeId(value);
                break;
        }
    }

    @Override
    public void setAlarmRaisedTime(String alarmRaisedTime) {
    }

}