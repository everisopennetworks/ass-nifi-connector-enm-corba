package org.omg.GenericIRPManagementConstDefs;


/**
* org.omg.GenericIRPManagementConstDefs/ParameterListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementConstDefs.idl
* jueves 5 de septiembre de 2019 02:18:40 AM CDT
*/

public final class ParameterListHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public ParameterListHolder ()
  {
  }

  public ParameterListHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ParameterListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ParameterListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ParameterListHelper.type ();
  }

}
