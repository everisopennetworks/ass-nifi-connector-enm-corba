package org.omg.GenericIRPManagementSystem;

/**
* org.omg.GenericIRPManagementSystem/InvalidParameterHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementSystem.idl
* jueves 5 de septiembre de 2019 02:18:50 AM CDT
*/

public final class InvalidParameterHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidParameter value = null;

  public InvalidParameterHolder ()
  {
  }

  public InvalidParameterHolder (InvalidParameter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidParameterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidParameterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidParameterHelper.type ();
  }

}
