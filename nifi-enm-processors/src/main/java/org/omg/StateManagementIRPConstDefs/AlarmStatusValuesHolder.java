package org.omg.StateManagementIRPConstDefs;

/**
* org.omg.StateManagementIRPConstDefs/AlarmStatusValuesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:19 AM CDT
*/


/*
   Definition of Alarm Status based on M.3100 [4], if mandatory.
   */
public final class AlarmStatusValuesHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmStatusValues value = null;

  public AlarmStatusValuesHolder ()
  {
  }

  public AlarmStatusValuesHolder (AlarmStatusValues initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmStatusValuesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmStatusValuesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmStatusValuesHelper.type ();
  }

}