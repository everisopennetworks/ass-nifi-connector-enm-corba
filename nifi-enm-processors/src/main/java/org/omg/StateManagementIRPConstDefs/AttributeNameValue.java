package org.omg.StateManagementIRPConstDefs;


/**
* org.omg.StateManagementIRPConstDefs/AttributeNameValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:19 AM CDT
*/


/*
  Constant definitions for state management notifications uses when populating the
  Cos::Structured event.
  The "name" party of the structured event carries the following constant definitions
  appropriate to the state being notified.
  Refer to TS 32.663 regarding how to populate the structured event
*/
public interface AttributeNameValue extends AttributeNameValueOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
  public static final String OPERATIONAL_STATE = "operationalState";
  public static final String USAGE_STATE = "usageState";
  public static final String ADMINISTRATIVE_STATE = "administrativeState";
  public static final String ALARM_STATUS = "alarmStatus";
  public static final String PROCEDURAL_STATUS = "proceduralStatus";
  public static final String AVAILABILITY_STATUS = "availabilityStatus";
  public static final String CONTROL_STATUS = "controlStatus";
  public static final String STANDBY_STATUS = "standbyStatus";
  public static final String UNKNOWN_STATUS = "unknownStatus";
} // interface AttributeNameValue