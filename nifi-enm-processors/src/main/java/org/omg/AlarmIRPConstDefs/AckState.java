package org.omg.AlarmIRPConstDefs;


/**
* org.omg.AlarmIRPConstDefs/AckState.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:42 AM CDT
*/


/*
   This block identifies the acknowledgement state of a reported alarm.
   */
public interface AckState extends AckStateOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
  public static final short ACKNOWLEDGED = (short)(1);
  public static final short UNACKNOWLEDGED = (short)(2);
} // interface AckState
