package org.omg.AlarmIRPNotifications;

/**
* org.omg.AlarmIRPNotifications/NotifyCommentsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPNotifications.idl
* jueves 5 de septiembre de 2019 01:10:29 AM CDT
*/

public final class NotifyCommentsHolder implements org.omg.CORBA.portable.Streamable
{
  public NotifyComments value = null;

  public NotifyCommentsHolder ()
  {
  }

  public NotifyCommentsHolder (NotifyComments initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotifyCommentsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotifyCommentsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotifyCommentsHelper.type ();
  }

}