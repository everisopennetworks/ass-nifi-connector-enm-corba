package org.omg.AlarmIRPNotifications;

/**
* org.omg.AlarmIRPNotifications/NotifyChangedAlarmHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPNotifications.idl
* jueves 5 de septiembre de 2019 01:10:29 AM CDT
*/

public final class NotifyChangedAlarmHolder implements org.omg.CORBA.portable.Streamable
{
  public NotifyChangedAlarm value = null;

  public NotifyChangedAlarmHolder ()
  {
  }

  public NotifyChangedAlarmHolder (NotifyChangedAlarm initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotifyChangedAlarmHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotifyChangedAlarmHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotifyChangedAlarmHelper.type ();
  }

}
