package org.omg.AlarmIRPConstDefs;

/**
* org.omg.AlarmIRPConstDefs/NotificationTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:42 AM CDT
*/


/*
   This block identifies the notification types defined by this
   Alarm IRP version.
   */
public final class NotificationTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationType value = null;

  public NotificationTypeHolder ()
  {
  }

  public NotificationTypeHolder (NotificationType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationTypeHelper.type ();
  }

}
