package org.omg.CSIRPConstDefs;


/**
* org.omg.CSIRPConstDefs/AttributeNameValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CSIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:16:49 AM CDT
*/


/**
   * This block identifies attributes which are included as part of the
   * CommunicationSurveillanceIRP. These attribute values should not 
   * clash with those defined for the attributes of notification 
   * header (see IDL of Notification IRP).
   */
public interface AttributeNameValue extends AttributeNameValueOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
  public static final String HEARTBEAT_PERIOD = "HEARTBEAT_PERIOD";
  public static final String CHANNEL_ID = "CHANNEL_ID";
  public static final String TRIGGER_FLAG = "TRIGGER_FLAG";
  public static final String MANAGER_IDENTIFIER = "MANAGER_IDENTIFIER";
} // interface AttributeNameValue
