package com.nttdata.nifi.processors.enm.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.nttdata.nifi.processors.enm.EventPrinter;

import java.util.HashMap;

public abstract class Event {

    private HashMap<String, Object> properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String leannoc_id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String alarmedObjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long alarmTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String alarmTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String specificProblem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String alarmedObjectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String alarmedObjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String vendorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String alarmDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long alarmRaisedTime;

   /* @JsonInclude(JsonInclude.Include.NON_NULL)
    private long alarmChangedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long alarmClearedTime;*/

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sourceSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String externalAlarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ackState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ackUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String perceivedSeverity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String serviceAffecting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String probableCause;

   /* @JsonInclude(JsonInclude.Include.NON_NULL)
    private long alarmOSSCreatedTime;*/

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String clearUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String affectedServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String supplementaryFaultID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String eventType;

    public String getLeannoc_id() {
        return leannoc_id;
    }

    public String getSupplementaryFaultID() {
        return supplementaryFaultID;
    }

    public void setSupplementaryFaultID(String supplementaryFaultID) {
        this.supplementaryFaultID = supplementaryFaultID;
    }

    void putProperty(String key, String value) {
        if (properties == null) {
            properties = new HashMap<>();
        }
        properties.put(key, value);
    }

    @Override
    public String toString() {
        try {
            return EventPrinter.objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public HashMap getProperties() {
        if (this.properties == null) {
            properties = new HashMap<>();
        }
        return properties;
    }

    public void setProperties(HashMap<String, Object> properties) {
        if (this.properties == null) {
            this.properties = properties;
        } else {
            this.properties.putAll(properties);
        }

        Object[] keys = this.properties.keySet().toArray();

        for (Object k : keys) {
            String key = (String) k;
            Object object = this.properties.get(key);
            if (object instanceof String) {
                setValue(key, (String) object);
            } else {
                if (object instanceof Long) {
                    Long l = (Long) object;
                    setValue(key, l);
                }
            }
        }
    }

    /*
        public long getAlarmChangedTime() {
            return alarmChangedTime;
        }

        public long getAlarmClearedTime() {
            return alarmClearedTime;
        }
    */
    public long getAlarmRaisedTime() {
        return alarmRaisedTime;
    }

    public long getAlarmTypeId() {
        return alarmTypeId;
    }

   /* public long getAlarmOSSCreatedTime() {
        return alarmOSSCreatedTime;
    }*/

    public String getAckState() {
        return ackState;
    }

    public String getAckUser() {
        return ackUser;
    }

    public String getAlarmDetail() {
        return alarmDetail;
    }

    public String getAlarmedObjectId() {
        return alarmedObjectId;
    }

    public String getAffectedServiceName() {
        return affectedServiceName;
    }

    public String getAlarmedObjectType() {
        return alarmedObjectType;
    }

    public String getAlarmTypeName() {
        return alarmTypeName;
    }

    public String getExternalAlarmId() {
        return externalAlarmId;
    }

    public String getPerceivedSeverity() {
        return perceivedSeverity;
    }

    public String getClearUser() {
        return clearUser;
    }

    public String getServiceAffecting() {
        return serviceAffecting;
    }

    public String getNetworkType() {
        return networkType;
    }

    public String getProbableCause() {
        return probableCause;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public String getSpecificProblem() {
        return specificProblem;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getAlarmedObjectName() {
        return alarmedObjectName;
    }

    public void setLeannoc_id(String leannoc_id) {
        this.leannoc_id = leannoc_id;
    }

    public void setAlarmedObjectName(String alarmedObjectName) {
        if (this.alarmedObjectName == null || "".equals(this.alarmedObjectName)) {
            this.alarmedObjectName = alarmedObjectName;
        }
    }

    public void setAckState(String ackState) {
        this.ackState = ackState;
    }

    public void setAckUser(String ackUser) {
        this.ackUser = ackUser;
    }

    public void setAffectedServiceName(String affectedServiceName) {
        this.affectedServiceName = affectedServiceName;
    }

    /*
        public void setAlarmChangedTime(long alarmChangedTime) {
            this.alarmChangedTime = alarmChangedTime;
        }

        public void setAlarmClearedTime(long alarmClearedTime) {
            this.alarmClearedTime = alarmClearedTime;
        }
    */
    public void setAlarmDetail(String alarmDetail) {
        this.alarmDetail = alarmDetail;
    }

    public void setAlarmedObjectId(String alarmedObjectId) {
        this.alarmedObjectId = alarmedObjectId;
    }

    public void setAlarmedObjectType(String alarmedObjectType) {
        this.alarmedObjectType = alarmedObjectType;
    }

 /*  public void setAlarmOSSCreatedTime(long alarmOSSCreatedTime) {
        this.alarmOSSCreatedTime = alarmOSSCreatedTime;
    }
 */

    public abstract void setAlarmRaisedTime(String alarmRaisedTime);

    public void setAlarmRaisedTime(long alarmRaisedTime) {
        this.alarmRaisedTime = alarmRaisedTime;
    }

    public void setAlarmTypeId(long alarmTypeId) {
        this.alarmTypeId = alarmTypeId;
    }

    public void setAlarmTypeName(String alarmTypeName) {
        this.alarmTypeName = alarmTypeName;
    }

    public void setClearUser(String clearUser) {
        this.clearUser = clearUser;
    }

    public void setExternalAlarmId(String externalAlarmId) {
        this.externalAlarmId = externalAlarmId;
    }

    public void setPerceivedSeverity(String perceivedSeverity) {
        this.perceivedSeverity = perceivedSeverity;
    }

    public void setProbableCause(String probableCause) {
        this.probableCause = probableCause;
    }

    public void setServiceAffecting(String serviceAffecting) {
        this.serviceAffecting = serviceAffecting;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public void setSpecificProblem(String specificProblem) {
        this.specificProblem = specificProblem;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public void setValue(String variable, String value) {
        switch (variable) {
            case "event_name":
                setAlarmTypeName(value);
                break;
            case "vendorName":
                setVendorName(value);
                break;
            case "sourceSystem":
                setSourceSystem(value);
                break;
            //case "n":
            //  setAckState(value);
            //break;
            //case "l":
            //  setAckUser(value);
            // break;
            case "h":
                setPerceivedSeverity(value);
                break;
            case "f":
                setExternalAlarmId(value);
                break;
            case "g":
                setProbableCause(value);
                break;
            case "event_type":
                setEventType(value);
                break;
            default:
                this.getProperties().put(variable, value);
                break;
        }
    }

    protected void setValue(String variable, long value) {
        switch (variable) {
            // case "i":
            //   setAlarmTypeId(value);
            // break;
            //case "b":
            //    setAlarmRaisedTime(value);
            //    break;
            /*case "mm":
                setAlarmChangedTime(value);
                break;
            case "ll":
                setAlarmClearedTime(value);
                break;*/
        }
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
