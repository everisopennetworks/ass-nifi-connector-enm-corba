package org.omg.CSIRPSystem;


/**
* org.omg.CSIRPSystem/GetCSIRPNotificationProfile.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CSIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:03 AM CDT
*/

public final class GetCSIRPNotificationProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetCSIRPNotificationProfile ()
  {
    super(GetCSIRPNotificationProfileHelper.id());
  } // ctor

  public GetCSIRPNotificationProfile (String _reason)
  {
    super(GetCSIRPNotificationProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetCSIRPNotificationProfile (String $reason, String _reason)
  {
    super(GetCSIRPNotificationProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetCSIRPNotificationProfile
