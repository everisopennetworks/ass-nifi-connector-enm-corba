package org.omg.EPIRPSystem;

/**
* org.omg.EPIRPSystem/GetIRPOutlineHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.EPIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:21 AM CDT
*/

public final class GetIRPOutlineHolder implements org.omg.CORBA.portable.Streamable
{
  public GetIRPOutline value = null;

  public GetIRPOutlineHolder ()
  {
  }

  public GetIRPOutlineHolder (GetIRPOutline initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = GetIRPOutlineHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    GetIRPOutlineHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return GetIRPOutlineHelper.type ();
  }

}
