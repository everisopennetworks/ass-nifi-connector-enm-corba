package org.omg.NotificationIRPSystem;


/**
* org.omg.NotificationIRPSystem/GetSubscriptionIds.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.NotificationIRPSystem.idl
* jueves 5 de septiembre de 2019 01:39:37 AM CDT
*/

public final class GetSubscriptionIds extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetSubscriptionIds ()
  {
    super(GetSubscriptionIdsHelper.id());
  } // ctor

  public GetSubscriptionIds (String _reason)
  {
    super(GetSubscriptionIdsHelper.id());
    reason = _reason;
  } // ctor


  public GetSubscriptionIds (String $reason, String _reason)
  {
    super(GetSubscriptionIdsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetSubscriptionIds
