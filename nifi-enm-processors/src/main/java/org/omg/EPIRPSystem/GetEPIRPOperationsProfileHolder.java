package org.omg.EPIRPSystem;

/**
* org.omg.EPIRPSystem/GetEPIRPOperationsProfileHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.EPIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:21 AM CDT
*/

public final class GetEPIRPOperationsProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public GetEPIRPOperationsProfile value = null;

  public GetEPIRPOperationsProfileHolder ()
  {
  }

  public GetEPIRPOperationsProfileHolder (GetEPIRPOperationsProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = GetEPIRPOperationsProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    GetEPIRPOperationsProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return GetEPIRPOperationsProfileHelper.type ();
  }

}
