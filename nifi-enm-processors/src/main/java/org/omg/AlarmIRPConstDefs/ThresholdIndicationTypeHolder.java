package org.omg.AlarmIRPConstDefs;

/**
* org.omg.AlarmIRPConstDefs/ThresholdIndicationTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:42 AM CDT
*/


/*
   It indicates if the threshold crossed was in the up or down direction.
   */
public final class ThresholdIndicationTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public ThresholdIndicationType value = null;

  public ThresholdIndicationTypeHolder ()
  {
  }

  public ThresholdIndicationTypeHolder (ThresholdIndicationType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ThresholdIndicationTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ThresholdIndicationTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ThresholdIndicationTypeHelper.type ();
  }

}
