package org.omg.CosNotifyChannelAdmin;

/**
* org.omg.CosNotifyChannelAdmin/AdminLimitHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:17 AM CDT
*/

public final class AdminLimitHolder implements org.omg.CORBA.portable.Streamable
{
  public AdminLimit value = null;

  public AdminLimitHolder ()
  {
  }

  public AdminLimitHolder (AdminLimit initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AdminLimitHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AdminLimitHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AdminLimitHelper.type ();
  }

}
