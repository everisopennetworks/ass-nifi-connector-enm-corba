package org.omg.CosNotifyChannelAdmin;


/**
* org.omg.CosNotifyChannelAdmin/AdminNotFound.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:17 AM CDT
*/

public final class AdminNotFound extends org.omg.CORBA.UserException
{

  public AdminNotFound ()
  {
    super(AdminNotFoundHelper.id());
  } // ctor


  public AdminNotFound (String $reason)
  {
    super(AdminNotFoundHelper.id() + "  " + $reason);
  } // ctor

} // class AdminNotFound