package org.omg.AlarmIRPSystem;


/**
* org.omg.AlarmIRPSystem/GetAlarmIRPOperationsProfile.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPSystem.idl
* jueves 5 de septiembre de 2019 01:52:14 AM CDT
*/

public final class GetAlarmIRPOperationsProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetAlarmIRPOperationsProfile ()
  {
    super(GetAlarmIRPOperationsProfileHelper.id());
  } // ctor

  public GetAlarmIRPOperationsProfile (String _reason)
  {
    super(GetAlarmIRPOperationsProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetAlarmIRPOperationsProfile (String $reason, String _reason)
  {
    super(GetAlarmIRPOperationsProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetAlarmIRPOperationsProfile
