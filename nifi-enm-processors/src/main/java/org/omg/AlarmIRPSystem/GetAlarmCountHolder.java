package org.omg.AlarmIRPSystem;

/**
* org.omg.AlarmIRPSystem/GetAlarmCountHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPSystem.idl
* jueves 5 de septiembre de 2019 01:52:14 AM CDT
*/

public final class GetAlarmCountHolder implements org.omg.CORBA.portable.Streamable
{
  public GetAlarmCount value = null;

  public GetAlarmCountHolder ()
  {
  }

  public GetAlarmCountHolder (GetAlarmCount initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = GetAlarmCountHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    GetAlarmCountHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return GetAlarmCountHelper.type ();
  }

}
