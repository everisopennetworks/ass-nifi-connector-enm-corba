package org.omg.StateManagementIRPConstDefs;

/**
* org.omg.StateManagementIRPConstDefs/UnknownStatusHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:20 AM CDT
*/

public final class UnknownStatusHolder implements org.omg.CORBA.portable.Streamable
{
  public UnknownStatus value = null;

  public UnknownStatusHolder ()
  {
  }

  public UnknownStatusHolder (UnknownStatus initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = UnknownStatusHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    UnknownStatusHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return UnknownStatusHelper.type ();
  }

}
