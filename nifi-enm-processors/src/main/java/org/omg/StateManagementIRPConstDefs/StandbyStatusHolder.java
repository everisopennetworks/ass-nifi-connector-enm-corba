package org.omg.StateManagementIRPConstDefs;

/**
* org.omg.StateManagementIRPConstDefs/StandbyStatusHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:20 AM CDT
*/


/*
   Definition of Standby Status based on X.721 [3], if mandatory.
   */
public final class StandbyStatusHolder implements org.omg.CORBA.portable.Streamable
{
  public StandbyStatus value = null;

  public StandbyStatusHolder ()
  {
  }

  public StandbyStatusHolder (StandbyStatus initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StandbyStatusHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StandbyStatusHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StandbyStatusHelper.type ();
  }

}
