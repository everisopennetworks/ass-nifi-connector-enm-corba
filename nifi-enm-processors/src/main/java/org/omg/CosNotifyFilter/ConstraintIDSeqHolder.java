package org.omg.CosNotifyFilter;


/**
* org.omg.CosNotifyFilter/ConstraintIDSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:36 AM CDT
*/

public final class ConstraintIDSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public ConstraintIDSeqHolder ()
  {
  }

  public ConstraintIDSeqHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ConstraintIDSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ConstraintIDSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ConstraintIDSeqHelper.type ();
  }

}
