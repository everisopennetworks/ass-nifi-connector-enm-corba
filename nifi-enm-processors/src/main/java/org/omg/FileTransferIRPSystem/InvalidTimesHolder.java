package org.omg.FileTransferIRPSystem;

/**
* org.omg.FileTransferIRPSystem/InvalidTimesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPSystem.idl
* jueves 5 de septiembre de 2019 02:18:30 AM CDT
*/

public final class InvalidTimesHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidTimes value = null;

  public InvalidTimesHolder ()
  {
  }

  public InvalidTimesHolder (InvalidTimes initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidTimesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidTimesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidTimesHelper.type ();
  }

}