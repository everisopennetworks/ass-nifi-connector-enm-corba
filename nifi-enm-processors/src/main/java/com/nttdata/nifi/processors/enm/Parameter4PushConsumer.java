package com.nttdata.nifi.processors.enm;

import java.util.HashSet;

public class Parameter4PushConsumer {
    private int number = 0;
    private int threadNum = 3;
    private int period = 0;
    private String alarmType = null;
    private String channelName = null;
    private boolean createIfNotExist = false;
    private boolean quietMode = false;
    private boolean silent = false;
    private boolean isPersistent = false;
    private int serverNumber = 1;

    private String theIORFilePath = "ior_servers.list";


    public boolean isWriteIOR() {
        return this.isWriteIOR;
    }


    public void setWriteIOR(boolean writeIOR) {
        this.isWriteIOR = writeIOR;
    }


    private boolean isWriteIOR = false;


    public boolean isAutoAttach() {
        return this.isAutoAttach;
    }


    public void setAutoAttach(boolean autoAttach) {
        this.isAutoAttach = autoAttach;
    }


    private boolean isAutoAttach = false;

    private String[] args;
    private long sleep = 5000L;
    private long delay = 0L;
    private int queueSize = 5000;
    private int port = 0;
    private int sslPort = 0;
    private String simpleOutPath = null;
    private boolean oldFormat = false;
    private String logFullPath = null;
    private boolean statistic = false;
    private String printMode = "all";
    private String maxFileSize = "30MB";
    private int maxBackupIndex = 100;
    private HashSet<String> eventsAttributes;

    public String getMaxFileSize() {
        return this.maxFileSize;
    }

    private boolean isPET;

    public void setMaxFileSize(String maxFileSize) {
        this.maxFileSize = maxFileSize;
    }


    public int getMaxBackupIndex() {
        return this.maxBackupIndex;
    }


    public void setMaxBackupIndex(int maxBackupIndex) {
        this.maxBackupIndex = maxBackupIndex;
    }


    public String getPrintMode() {
        return this.printMode;
    }


    public void setPrintMode(String printMode) {
        this.printMode = printMode;
    }


    public boolean isStatistic() {
        return this.statistic;
    }


    public void setStatistic(boolean statistic) {
        this.statistic = statistic;
    }


    public String getSimpleOutPath() {
        return this.simpleOutPath;
    }


    public void setSimpleOutPath(String simpleOutPath) {
        this.simpleOutPath = simpleOutPath;
    }


    public String getLogFullPath() {
        return this.logFullPath;
    }


    public void setLogFullPath(String fullLogPath) {
        this.logFullPath = fullLogPath;
    }


    public boolean isOldFormat() {
        return this.oldFormat;
    }


    public void setOldFormat(boolean oldFormat) {
        this.oldFormat = oldFormat;
    }


    public HashSet<String> getEventsAttributes() {
        return this.eventsAttributes;
    }


    public void setEventsAttributes(HashSet<String> eventsAttributes) {
        this.eventsAttributes = eventsAttributes;
    }


    public int getQueueSize() {
        return this.queueSize;
    }


    public void setQueueSize(int queueSize) {
        this.queueSize = queueSize;
    }


    public long getSleep() {
        return this.sleep;
    }


    public void setSleep(long sleep) {
        this.sleep = sleep;
    }


    public long getDelay() {
        return this.delay;
    }


    public void setDelay(long delay) {
        this.delay = delay;
    }


    public int getPort() {
        return this.port;
    }


    public void setPort(int port) {
        this.port = port;
    }


    public int getSslPort() {
        return this.sslPort;
    }


    public void setSslPort(int sslPort) {
        this.sslPort = sslPort;
    }


    public boolean isPET() {
        return this.isPET;
    }


    public void setPET(boolean isPET) {
        this.isPET = isPET;
    }


    public String[] getArgs() {
        return this.args;
    }


    public void setArgs(String[] args) {
        this.args = args;
    }


    public int getNumber() {
        return this.number;
    }


    public void setNumber(int number) {
        this.number = number;
    }


    public int getThreadNum() {
        return this.threadNum;
    }


    public void setThreadNum(int threadNum) {
        this.threadNum = threadNum;
    }


    public int getPeriod() {
        return this.period;
    }


    public void setPeriod(int period) {
        this.period = period;
    }


    public String getAlarmType() {
        return this.alarmType;
    }


    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }


    public String getChannelName() {
        return this.channelName;
    }


    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }


    public boolean isCreateIfNotExist() {
        return this.createIfNotExist;
    }


    public void setCreateIfNotExist(boolean createIfNotExist) {
        this.createIfNotExist = createIfNotExist;
    }


    public boolean isQuietMode() {
        return this.quietMode;
    }


    public void setQuietMode(boolean quietMode) {
        this.quietMode = quietMode;
    }


    public void setSilent(boolean silent) {
        this.silent = silent;
    }


    public boolean isSilent() {
        return this.silent;
    }


    public boolean isPersistent() {
        return this.isPersistent;
    }


    public void setPersistent(boolean isPersistent) {
        this.isPersistent = isPersistent;
    }


    public int getServerNumber() {
        return this.serverNumber;
    }


    public void setServerNumber(int serverNumber) {
        this.serverNumber = serverNumber;
    }


    public String getIORFilePath() {
        return this.theIORFilePath;
    }


    public void setTheIORFilePath(String theIORFilePath) {
        this.theIORFilePath = theIORFilePath;
    }
}

