package org.omg.StateManagementIRPConstDefs;


/**
* org.omg.StateManagementIRPConstDefs/ControlStatusHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:20 AM CDT
*/

public final class ControlStatusHolder implements org.omg.CORBA.portable.Streamable
{
  public ControlStatusValues value[] = null;

  public ControlStatusHolder ()
  {
  }

  public ControlStatusHolder (ControlStatusValues[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ControlStatusHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ControlStatusHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ControlStatusHelper.type ();
  }

}