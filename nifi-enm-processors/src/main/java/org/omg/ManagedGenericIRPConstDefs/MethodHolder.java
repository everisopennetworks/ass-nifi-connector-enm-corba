package org.omg.ManagedGenericIRPConstDefs;

/**
* org.omg.ManagedGenericIRPConstDefs/MethodHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.ManagedGenericIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:00:52 AM CDT
*/

public final class MethodHolder implements org.omg.CORBA.portable.Streamable
{
  public Method value = null;

  public MethodHolder ()
  {
  }

  public MethodHolder (Method initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MethodHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MethodHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MethodHelper.type ();
  }

}
