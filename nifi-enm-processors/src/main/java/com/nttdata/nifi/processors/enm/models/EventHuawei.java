package com.nttdata.nifi.processors.enm.models;

import org.apache.commons.lang3.StringUtils;

import java.util.TimeZone;

public class EventHuawei extends Event {

    public EventHuawei() {
        setVendorName("Huawei");
        setSourceSystem("U2000");
    }

    private boolean isC7 = false;
    //@Override
    // public void setAlarmRaisedTime(String alarmRaisedTime) {
    //}
    private String RFUN;
    private String CN;
    private String NN;
    private String AI;
    private String AL;

    @Override
    public String getAlarmedObjectName() {
        // TODO Auto-generated method stub
        if (RFUN != null && isC7) {
            return RFUN;
        } else if (CN != null) {
            return CN;
        } else if (NN != null) {
            return NN;
        }
        return "";
    }

    @Override
    public String getAlarmDetail() {
        return ("alarmLocation:" + AL + " appendInfo:" + AI);
    }


    @Override
    public String getLeannoc_id() {
        if (RFUN != null && isC7) {
            String[] rpts = RFUN.split("-");
            if (rpts.length >= 1) {
                String rpt1 = rpts[0];
                return rpt1;
            }
        } else if (CN != null) {
            String[] cpts = CN.split("-");
            if (cpts.length >= 1) {
                String cpt1 = cpts[0];
                return cpt1;
            }
        } else {
            if (NN != null) {
                String[] npts = NN.split("-");
                if (npts.length >= 1) {
                    String npt1 = npts[0];
                    return npt1;
                }
            }
        }
        return "";
    }

    @Override
    public void setValue(String variable, String value) {
        switch (variable) {
            case "remainder_of_body_n":
                setAckState(value);
                break;
            case "remainder_of_body_l":
                setAckUser(value);
                break;
            case "d":
                //setAlarmedObjectType(value);
                break;
            case "w":
                //setAlarmedObjectId(value);
                break;
            case "remainder_of_body_y":
                setClearUser(value);
                break;
            case "RF Unit Name":
                RFUN = value;
                break;
            case "Cell Name":
                CN = value;
                break;
            case "neName":
                String input = value;
                isC7 = input.indexOf("C7") != -1 ? true : false; //true
                setAlarmedObjectId(value);
                NN = value;
                break;
            case "NeType":
                setAlarmedObjectType(value);
                break;
            case "alarmName":
                setSpecificProblem(value);
                break;
            case "remainder_of_body_j":
                String[] stringMap = StringUtils.split(value, "\\|");
                for (String s : stringMap) {
                    try {
                        String[] key_value = StringUtils.split(s, ":");
                        if (key_value.length == 2)
                            setValue(key_value[0].trim(), key_value[1].trim());
                        else {
                            if (key_value.length > 2) {
                                StringBuilder value2 = new StringBuilder();
                                for (int i = 1; i <= key_value.length - 1; i++) {
                                    if (!value2.toString().equals("")) {
                                        value2.append(":").append(key_value[i]);
                                    }
                                    value2.append(key_value[i]);
                                }
                                setValue(key_value[0].trim(), value2.toString());
                            }

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
            case "alarmLocation":
                AL = value;
                String[] alarmLocationStringMap = StringUtils.split(value, ",");
                for (String s : alarmLocationStringMap) {
                    try {
                        String[] key_value = StringUtils.split(s, "=");
                        if (key_value.length == 2)
                            setValue(key_value[0].trim(), key_value[1].trim());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
            case "appendInfo":
                AI = value;
                String[] appendInfoStringMap = StringUtils.split(value, ",");
                for (String s : appendInfoStringMap) {
                    try {
                        String[] key_value = StringUtils.split(s, "=");
                        if (key_value.length == 2)
                            setValue(key_value[0].trim(), key_value[1].trim());
                        else {
                            if (key_value.length == 1) {
                                setValue(key_value[0].trim(), "");
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
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
            case "b":
                try {
                    long result = 0;
                    TimeZone zone = TimeZone.getTimeZone("America/Mexico_City");
                    result = (value + (zone.getRawOffset()));
                    setAlarmRaisedTime(result);
                } catch (NumberFormatException ne) {
                    setAlarmRaisedTime(value);
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
