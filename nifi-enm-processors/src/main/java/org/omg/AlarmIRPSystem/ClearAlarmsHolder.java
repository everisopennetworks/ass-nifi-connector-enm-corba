package org.omg.AlarmIRPSystem;

/**
* org.omg.AlarmIRPSystem/ClearAlarmsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPSystem.idl
* jueves 5 de septiembre de 2019 01:52:14 AM CDT
*/

public final class ClearAlarmsHolder implements org.omg.CORBA.portable.Streamable
{
  public ClearAlarms value = null;

  public ClearAlarmsHolder ()
  {
  }

  public ClearAlarmsHolder (ClearAlarms initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ClearAlarmsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ClearAlarmsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ClearAlarmsHelper.type ();
  }

}
