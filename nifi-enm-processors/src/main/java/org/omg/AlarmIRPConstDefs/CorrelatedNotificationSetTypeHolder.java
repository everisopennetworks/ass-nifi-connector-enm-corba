package org.omg.AlarmIRPConstDefs;


/**
* org.omg.AlarmIRPConstDefs/CorrelatedNotificationSetTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:43 AM CDT
*/


/*
   Correlated Notification sets are sets of Correlated Notification
   structures.
   */
public final class CorrelatedNotificationSetTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public CorelatedNotification value[] = null;

  public CorrelatedNotificationSetTypeHolder ()
  {
  }

  public CorrelatedNotificationSetTypeHolder (CorelatedNotification[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CorrelatedNotificationSetTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CorrelatedNotificationSetTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CorrelatedNotificationSetTypeHelper.type ();
  }

}
