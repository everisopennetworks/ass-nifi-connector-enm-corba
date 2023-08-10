package org.omg.AlarmIRPConstDefs;

/**
* org.omg.AlarmIRPConstDefs/TrendIndicationTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:43 AM CDT
*/


/*
   It indicates if some observed condition is getting better, worse,
   or not changing.
   */
public final class TrendIndicationTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public TrendIndicationType value = null;

  public TrendIndicationTypeHolder ()
  {
  }

  public TrendIndicationTypeHolder (TrendIndicationType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = TrendIndicationTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    TrendIndicationTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return TrendIndicationTypeHelper.type ();
  }

}
