package org.omg.EPIRPSystem;

/**
* org.omg.EPIRPSystem/EPIRPHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.EPIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:21 AM CDT
*/


/*
  */
public final class EPIRPHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRP value = null;

  public EPIRPHolder ()
  {
  }

  public EPIRPHolder (EPIRP initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPHelper.type ();
  }

}
