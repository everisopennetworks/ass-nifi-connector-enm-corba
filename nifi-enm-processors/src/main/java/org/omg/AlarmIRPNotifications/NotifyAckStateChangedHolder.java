package org.omg.AlarmIRPNotifications;

/**
* org.omg.AlarmIRPNotifications/NotifyAckStateChangedHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPNotifications.idl
* jueves 5 de septiembre de 2019 01:10:29 AM CDT
*/

public final class NotifyAckStateChangedHolder implements org.omg.CORBA.portable.Streamable
{
  public NotifyAckStateChanged value = null;

  public NotifyAckStateChangedHolder ()
  {
  }

  public NotifyAckStateChangedHolder (NotifyAckStateChanged initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotifyAckStateChangedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotifyAckStateChangedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotifyAckStateChangedHelper.type ();
  }

}