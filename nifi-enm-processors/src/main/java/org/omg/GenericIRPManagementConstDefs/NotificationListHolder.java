package org.omg.GenericIRPManagementConstDefs;


/**
* org.omg.GenericIRPManagementConstDefs/NotificationListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementConstDefs.idl
* jueves 5 de septiembre de 2019 02:18:40 AM CDT
*/

public final class NotificationListHolder implements org.omg.CORBA.portable.Streamable
{
  public Notification value[] = null;

  public NotificationListHolder ()
  {
  }

  public NotificationListHolder (Notification[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationListHelper.type ();
  }

}
