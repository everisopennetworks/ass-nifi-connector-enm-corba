package org.omg.NotificationIRPSystem;


/**
* org.omg.NotificationIRPSystem/GetSubscriptionStatus.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.NotificationIRPSystem.idl
* jueves 5 de septiembre de 2019 01:39:37 AM CDT
*/

public final class GetSubscriptionStatus extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetSubscriptionStatus ()
  {
    super(GetSubscriptionStatusHelper.id());
  } // ctor

  public GetSubscriptionStatus (String _reason)
  {
    super(GetSubscriptionStatusHelper.id());
    reason = _reason;
  } // ctor


  public GetSubscriptionStatus (String $reason, String _reason)
  {
    super(GetSubscriptionStatusHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetSubscriptionStatus
