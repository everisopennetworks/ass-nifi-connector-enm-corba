package org.omg.CosNotifyChannelAdmin;


/**
* org.omg.CosNotifyChannelAdmin/AdminLimitExceeded.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:17 AM CDT
*/

public final class AdminLimitExceeded extends org.omg.CORBA.UserException
{
  public AdminLimit admin_property_err = null;

  public AdminLimitExceeded ()
  {
    super(AdminLimitExceededHelper.id());
  } // ctor

  public AdminLimitExceeded (AdminLimit _admin_property_err)
  {
    super(AdminLimitExceededHelper.id());
    admin_property_err = _admin_property_err;
  } // ctor


  public AdminLimitExceeded (String $reason, AdminLimit _admin_property_err)
  {
    super(AdminLimitExceededHelper.id() + "  " + $reason);
    admin_property_err = _admin_property_err;
  } // ctor

} // class AdminLimitExceeded
