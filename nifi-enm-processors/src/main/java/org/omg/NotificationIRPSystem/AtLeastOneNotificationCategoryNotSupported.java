package org.omg.NotificationIRPSystem;


/**
* org.omg.NotificationIRPSystem/AtLeastOneNotificationCategoryNotSupported.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.NotificationIRPSystem.idl
* jueves 5 de septiembre de 2019 01:39:37 AM CDT
*/

public final class AtLeastOneNotificationCategoryNotSupported extends org.omg.CORBA.UserException
{

  public AtLeastOneNotificationCategoryNotSupported ()
  {
    super(AtLeastOneNotificationCategoryNotSupportedHelper.id());
  } // ctor


  public AtLeastOneNotificationCategoryNotSupported (String $reason)
  {
    super(AtLeastOneNotificationCategoryNotSupportedHelper.id() + "  " + $reason);
  } // ctor

} // class AtLeastOneNotificationCategoryNotSupported