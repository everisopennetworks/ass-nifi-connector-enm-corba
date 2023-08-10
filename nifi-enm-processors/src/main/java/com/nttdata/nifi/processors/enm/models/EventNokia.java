package com.nttdata.nifi.processors.enm.models;

import java.util.regex.PatternSyntaxException;

public class EventNokia extends Event {

    public EventNokia() {
        setVendorName("Nokia");
        setSourceSystem("NetAct");
    }

    //@Override
    //public void setAlarmRaisedTime(String alarmRaisedTime) {
    //}

    private boolean EU = false;
    private boolean C7 = false;
    private String IDA1;
    private String N8O;
    private String TE;
    private String EME;

    @Override
    public String getLeannoc_id() {
        if (IDA1 != null && EU) {
            String[] a1pts = IDA1.split("-");
            if (a1pts.length >= 2) {
                String a1pt2 = a1pts[1];
                return a1pt2;
            }
        } else if (IDA1 != null && C7) {
            int c7Position = IDA1.indexOf("C");
            return IDA1.substring(c7Position + 3, c7Position + 9);
        } else if (IDA1 != null) {
            String[] a1pts = IDA1.split("-");
            if (a1pts.length >= 1) {
                String a1pt1 = a1pts[0];
                return a1pt1;
            }
        } else if (N8O != null && (N8O.length() >= 6)) {
            String[] n8pts = N8O.split("-");
            String n8pt1 = n8pts[0];
            return n8pt1;
        }
        return "";
    }

    @Override
    public String getAlarmedObjectId() {
        // TODO Auto-generated method stub
        if (TE != null) {
            return TE;
        } else if (EME != null) {
            return EME;
        } else if (N8O != null) {
            return N8O;
        }
        return "";
    }

    @Override
    public String getAlarmedObjectName() {
        // TODO Auto-generated method stub
        if (IDA1 != null) {
            return IDA1;
        } else if (N8O != null && !"".equals(N8O.trim())) {
            return N8O;
        } else if (EME != null) {
            return EME;
        }
        return "";
    }

    @Override
    public void setValue(String variable, String value) {
        switch (variable) {
            case "n":
                setAckState(value);
                break;
            case "l":
                setAckUser(value);
                break;
            // Cambio Para el campo specificProblem
            case "j":
                boolean ispa = false;
                String input = value;
                ispa = input.indexOf("|") != -1 ? true : false; //true
                if (ispa) {
                    String[] pts = value.split("\\|");
                    String pt1 = pts[0];
                    setSpecificProblem(pt1);
                } else {
                    setSpecificProblem(value);
                }
                // Cambio Para el campo specificProblem
                break;
            case "d":
                if ("EUtranCellFDD".contentEquals(value)) {
                    EU = true;
                } else {
                    EU = false;
                }
                setAlarmedObjectType(value);
                break;
            case "t":
                TE = value;
                break;
            case "w":
                IDA1 = value;
                String input2 = value;
                C7 = input2.indexOf("C7") != -1 ? true : false; //true
                break;
            case "y":
                setClearUser(value);
                if (this.getProperties().containsKey("event_name")) {
                    String event_name = (String) this.getProperties().get("event_name");
                    if ("x5".equals(event_name)) {
                        setClearUser(value);
                    }
                }
                break;
            case "e":
                try {
                    String[] splitVariables = value.split(",");
                    for (String tokens : splitVariables) {
                        String[] tuple = tokens.split("=");
                        if (tuple.length > 1) {
                            getProperties().put("e_" + tuple[0], tuple[1]);
                        }
                    }
                } catch (PatternSyntaxException pse) {
                }
                break;
            case "N8objectName":
                N8O = value;
                break;
            case "e_ManagedElement":
                EME = value;
                break;
            case "additionalInformation":
                setAlarmDetail(value);
                break;
            case "additionalFaultID":
                setSupplementaryFaultID(value);
                break;
            case "additionalFaultId":
                setSupplementaryFaultID(value);
                break;
            case "diagnosticInformation":
                String[] splitVariables = value.split(" ");
                for (String tokens : splitVariables) {
                    String s = tokens.replace(":", "=");
                    s = s.replace(";", "");
                    String[] tuple = s.split("=");
                    if (tuple.length > 1) {
                        setValue(tuple[0], tuple[1]);
                    }
                }
                break;
            default:
                super.setValue(variable, value);
                break;
        }
    }

    protected void setValue(String variable, long value) {
        switch (variable) {
            case "b":
                setAlarmRaisedTime(value);
                break;
            case "i":
                setAlarmTypeId(value);
                break;
        }
    }

    @Override
    public void setAlarmRaisedTime(String alarmRaisedTime) {
        // TODO Auto-generated method stub

    }


}

