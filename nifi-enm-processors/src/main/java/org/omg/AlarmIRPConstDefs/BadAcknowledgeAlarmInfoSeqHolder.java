package org.omg.AlarmIRPConstDefs;


/**
* org.omg.AlarmIRPConstDefs/BadAcknowledgeAlarmInfoSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:44 AM CDT
*/

public final class BadAcknowledgeAlarmInfoSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public BadAcknowledgeAlarmInfo value[] = null;

  public BadAcknowledgeAlarmInfoSeqHolder ()
  {
  }

  public BadAcknowledgeAlarmInfoSeqHolder (BadAcknowledgeAlarmInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BadAcknowledgeAlarmInfoSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BadAcknowledgeAlarmInfoSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BadAcknowledgeAlarmInfoSeqHelper.type ();
  }

}