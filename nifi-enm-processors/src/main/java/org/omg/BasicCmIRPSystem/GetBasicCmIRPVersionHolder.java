package org.omg.BasicCmIRPSystem;

/**
* org.omg.BasicCmIRPSystem/GetBasicCmIRPVersionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:11 AM CDT
*/

public final class GetBasicCmIRPVersionHolder implements org.omg.CORBA.portable.Streamable
{
  public GetBasicCmIRPVersion value = null;

  public GetBasicCmIRPVersionHolder ()
  {
  }

  public GetBasicCmIRPVersionHolder (GetBasicCmIRPVersion initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = GetBasicCmIRPVersionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    GetBasicCmIRPVersionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return GetBasicCmIRPVersionHelper.type ();
  }

}