package org.omg.AlarmIRPConstDefs;

/**
* org.omg.AlarmIRPConstDefs/PerceivedSeverityHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:42 AM CDT
*/


/*
   This block identifies the levels of severity.
   */
public final class PerceivedSeverityHolder implements org.omg.CORBA.portable.Streamable
{
  public PerceivedSeverity value = null;

  public PerceivedSeverityHolder ()
  {
  }

  public PerceivedSeverityHolder (PerceivedSeverity initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PerceivedSeverityHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PerceivedSeverityHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PerceivedSeverityHelper.type ();
  }

}