package org.omg.AlarmIRPSystem;

/**
* org.omg.AlarmIRPSystem/CommentAlarmsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPSystem.idl
* jueves 5 de septiembre de 2019 01:52:14 AM CDT
*/

public final class CommentAlarmsHolder implements org.omg.CORBA.portable.Streamable
{
  public CommentAlarms value = null;

  public CommentAlarmsHolder ()
  {
  }

  public CommentAlarmsHolder (CommentAlarms initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CommentAlarmsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CommentAlarmsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CommentAlarmsHelper.type ();
  }

}
