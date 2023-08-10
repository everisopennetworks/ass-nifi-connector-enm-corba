package org.omg.CSIRPNotifications;


/**
* org.omg.CSIRPNotifications/notifyHeartbeat.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CSIRPNotifications.idl
* jueves 5 de septiembre de 2019 02:16:55 AM CDT
*/


/**
   *  Constant definitions for the FileReady notification
   */
public interface notifyHeartbeat extends notifyHeartbeatOperations, org.omg.NotificationIRPNotifications.Notify, org.omg.CORBA.portable.IDLEntity
{
  public static final String EVENT_TYPE = "notifyHeartbeat";

  /**
     * This constant defines the name of the  period property, 
     * which is transported in the filterable_body fields.
     * The data type for the value of this property
     * is org.omg.CSIRPConstDefs::HeartbeatPeriodType.
     */
  public static final String HEARTBEAT_PERIOD = org.omg.CSIRPConstDefs.AttributeNameValue.HEARTBEAT_PERIOD;

  /*
     * This constant defines the name of the 
     * channelId property, 
     * which is transported in the filterable_body
     * fields.
     * The data type for the value of this property
     * is org.omg.CSIRPConstDefs::ChannelIdType.
     */
  public static final String CHANNEL_ID = org.omg.CSIRPConstDefs.AttributeNameValue.CHANNEL_ID;

  /*
     * This constant defines the name of the 
     * triggerFlag property, 
     * which is transported in the filterable_body
     * fields.
     * The data type for the value of this property
     * is org.omg.CSIRPConstDefs::TriggerFlagType.
     */
  public static final String TRIGGER_FLAG = org.omg.CSIRPConstDefs.AttributeNameValue.TRIGGER_FLAG;

  /*
     * This constant defines the name of the 
     * managerIdentifier property, 
     * which is transported in the filterable_body
     * fields.
     * The data type for the value of this property
     * is org.omg.CSIRPConstDefs::ManagerIdentifierType.
     */
  public static final String MANAGER_IDENTIFIER = org.omg.CSIRPConstDefs.AttributeNameValue.MANAGER_IDENTIFIER;
} // interface notifyHeartbeat