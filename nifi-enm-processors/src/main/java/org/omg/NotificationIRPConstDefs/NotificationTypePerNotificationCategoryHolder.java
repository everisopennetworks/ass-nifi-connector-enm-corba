package org.omg.NotificationIRPConstDefs;


/**
* org.omg.NotificationIRPConstDefs/NotificationTypePerNotificationCategoryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.NotificationIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:10:23 AM CDT
*/


/*
   It defines the notification types of a particular notification category.
   */
public final class NotificationTypePerNotificationCategoryHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public NotificationTypePerNotificationCategoryHolder ()
  {
  }

  public NotificationTypePerNotificationCategoryHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationTypePerNotificationCategoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationTypePerNotificationCategoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationTypePerNotificationCategoryHelper.type ();
  }

}
