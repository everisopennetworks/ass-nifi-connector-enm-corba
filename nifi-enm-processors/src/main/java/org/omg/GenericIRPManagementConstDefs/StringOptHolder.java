package org.omg.GenericIRPManagementConstDefs;

/**
* org.omg.GenericIRPManagementConstDefs/StringOptHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementConstDefs.idl
* jueves 5 de septiembre de 2019 02:18:41 AM CDT
*/

public final class StringOptHolder implements org.omg.CORBA.portable.Streamable
{
  public StringOpt value = null;

  public StringOptHolder ()
  {
  }

  public StringOptHolder (StringOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StringOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StringOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StringOptHelper.type ();
  }

}
