package org.omg.ManagedGenericIRPConstDefs;

/**
* org.omg.ManagedGenericIRPConstDefs/UnsignedLongTypeOptHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.ManagedGenericIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:00:53 AM CDT
*/

public final class UnsignedLongTypeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public UnsignedLongTypeOpt value = null;

  public UnsignedLongTypeOptHolder ()
  {
  }

  public UnsignedLongTypeOptHolder (UnsignedLongTypeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = UnsignedLongTypeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    UnsignedLongTypeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return UnsignedLongTypeOptHelper.type ();
  }

}
