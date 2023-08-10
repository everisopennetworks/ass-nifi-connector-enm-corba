package org.omg.AlarmIRPSystem;


/**
* org.omg.AlarmIRPSystem/AcknowledgeAlarms.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPSystem.idl
* jueves 5 de septiembre de 2019 01:52:14 AM CDT
*/

public final class AcknowledgeAlarms extends org.omg.CORBA.UserException
{
  public String reason = null;

  public AcknowledgeAlarms ()
  {
    super(AcknowledgeAlarmsHelper.id());
  } // ctor

  public AcknowledgeAlarms (String _reason)
  {
    super(AcknowledgeAlarmsHelper.id());
    reason = _reason;
  } // ctor


  public AcknowledgeAlarms (String $reason, String _reason)
  {
    super(AcknowledgeAlarmsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class AcknowledgeAlarms
