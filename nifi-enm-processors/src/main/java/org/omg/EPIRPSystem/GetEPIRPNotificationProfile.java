package org.omg.EPIRPSystem;


/**
* org.omg.EPIRPSystem/GetEPIRPNotificationProfile.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.EPIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:21 AM CDT
*/

public final class GetEPIRPNotificationProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetEPIRPNotificationProfile ()
  {
    super(GetEPIRPNotificationProfileHelper.id());
  } // ctor

  public GetEPIRPNotificationProfile (String _reason)
  {
    super(GetEPIRPNotificationProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetEPIRPNotificationProfile (String $reason, String _reason)
  {
    super(GetEPIRPNotificationProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetEPIRPNotificationProfile
