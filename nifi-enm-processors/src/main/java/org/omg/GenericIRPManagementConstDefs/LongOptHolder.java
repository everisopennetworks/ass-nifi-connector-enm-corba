package org.omg.GenericIRPManagementConstDefs;

/**
* org.omg.GenericIRPManagementConstDefs/LongOptHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementConstDefs.idl
* jueves 5 de septiembre de 2019 02:18:41 AM CDT
*/

public final class LongOptHolder implements org.omg.CORBA.portable.Streamable
{
  public LongOpt value = null;

  public LongOptHolder ()
  {
  }

  public LongOptHolder (LongOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LongOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LongOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LongOptHelper.type ();
  }

}
