package org.omg.CosNotifyFilter;


/**
* org.omg.CosNotifyFilter/ConstraintInfoSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:36 AM CDT
*/

public final class ConstraintInfoSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public ConstraintInfo value[] = null;

  public ConstraintInfoSeqHolder ()
  {
  }

  public ConstraintInfoSeqHolder (ConstraintInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ConstraintInfoSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ConstraintInfoSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ConstraintInfoSeqHelper.type ();
  }

}
