package org.omg.GenericIRPManagementSystem;


/**
* org.omg.GenericIRPManagementSystem/GetInterfaceIRPNotificationProfile.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementSystem.idl
* jueves 5 de septiembre de 2019 02:18:50 AM CDT
*/

public final class GetInterfaceIRPNotificationProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetInterfaceIRPNotificationProfile ()
  {
    super(GetInterfaceIRPNotificationProfileHelper.id());
  } // ctor

  public GetInterfaceIRPNotificationProfile (String _reason)
  {
    super(GetInterfaceIRPNotificationProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetInterfaceIRPNotificationProfile (String $reason, String _reason)
  {
    super(GetInterfaceIRPNotificationProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetInterfaceIRPNotificationProfile
