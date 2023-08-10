package org.omg.CosNotification;


/**
* org.omg.CosNotification/UnsupportedAdmin.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotification.idl
* jueves 5 de septiembre de 2019 01:57:52 AM CDT
*/

public final class UnsupportedAdmin extends org.omg.CORBA.UserException
{
  public PropertyError admin_err[] = null;

  public UnsupportedAdmin ()
  {
    super(UnsupportedAdminHelper.id());
  } // ctor

  public UnsupportedAdmin (PropertyError[] _admin_err)
  {
    super(UnsupportedAdminHelper.id());
    admin_err = _admin_err;
  } // ctor


  public UnsupportedAdmin (String $reason, PropertyError[] _admin_err)
  {
    super(UnsupportedAdminHelper.id() + "  " + $reason);
    admin_err = _admin_err;
  } // ctor

} // class UnsupportedAdmin
