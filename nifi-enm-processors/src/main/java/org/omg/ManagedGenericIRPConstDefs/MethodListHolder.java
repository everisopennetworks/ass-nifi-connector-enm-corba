package org.omg.ManagedGenericIRPConstDefs;


/**
* org.omg.ManagedGenericIRPConstDefs/MethodListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.ManagedGenericIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:00:52 AM CDT
*/


/*
   List of all methods and their associated parameters.
   */
public final class MethodListHolder implements org.omg.CORBA.portable.Streamable
{
  public Method value[] = null;

  public MethodListHolder ()
  {
  }

  public MethodListHolder (Method[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MethodListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MethodListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MethodListHelper.type ();
  }

}
