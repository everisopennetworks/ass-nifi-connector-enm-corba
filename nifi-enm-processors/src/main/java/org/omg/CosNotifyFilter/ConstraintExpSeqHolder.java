package org.omg.CosNotifyFilter;


/**
* org.omg.CosNotifyFilter/ConstraintExpSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:36 AM CDT
*/

public final class ConstraintExpSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public ConstraintExp value[] = null;

  public ConstraintExpSeqHolder ()
  {
  }

  public ConstraintExpSeqHolder (ConstraintExp[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ConstraintExpSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ConstraintExpSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ConstraintExpSeqHelper.type ();
  }

}