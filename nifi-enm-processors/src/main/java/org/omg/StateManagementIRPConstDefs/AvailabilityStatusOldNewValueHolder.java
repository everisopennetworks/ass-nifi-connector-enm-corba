package org.omg.StateManagementIRPConstDefs;

/**
* org.omg.StateManagementIRPConstDefs/AvailabilityStatusOldNewValueHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPOptConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:33 AM CDT
*/

public final class AvailabilityStatusOldNewValueHolder implements org.omg.CORBA.portable.Streamable
{
  public AvailabilityStatusOldNewValue value = null;

  public AvailabilityStatusOldNewValueHolder ()
  {
  }

  public AvailabilityStatusOldNewValueHolder (AvailabilityStatusOldNewValue initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AvailabilityStatusOldNewValueHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AvailabilityStatusOldNewValueHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AvailabilityStatusOldNewValueHelper.type ();
  }

}
