package org.omg.StateManagementIRPConstDefs;

/**
* org.omg.StateManagementIRPConstDefs/ControlStatusOldNewValueHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPOptConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:33 AM CDT
*/

public final class ControlStatusOldNewValueHolder implements org.omg.CORBA.portable.Streamable
{
  public ControlStatusOldNewValue value = null;

  public ControlStatusOldNewValueHolder ()
  {
  }

  public ControlStatusOldNewValueHolder (ControlStatusOldNewValue initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ControlStatusOldNewValueHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ControlStatusOldNewValueHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ControlStatusOldNewValueHelper.type ();
  }

}
