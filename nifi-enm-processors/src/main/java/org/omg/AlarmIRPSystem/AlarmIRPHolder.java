package org.omg.AlarmIRPSystem;

/**
* org.omg.AlarmIRPSystem/AlarmIRPHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPSystem.idl
* jueves 5 de septiembre de 2019 01:52:14 AM CDT
*/

public final class AlarmIRPHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRP value = null;

  public AlarmIRPHolder ()
  {
  }

  public AlarmIRPHolder (AlarmIRP initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPHelper.type ();
  }

}
