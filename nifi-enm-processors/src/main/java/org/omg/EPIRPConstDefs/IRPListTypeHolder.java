package org.omg.EPIRPConstDefs;


/**
* org.omg.EPIRPConstDefs/IRPListTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.EPIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:17:10 AM CDT
*/


/*
   List of all IRPElement and their associated parameters.
  */
public final class IRPListTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public IRPElement value[] = null;

  public IRPListTypeHolder ()
  {
  }

  public IRPListTypeHolder (IRPElement[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IRPListTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IRPListTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IRPListTypeHelper.type ();
  }

}