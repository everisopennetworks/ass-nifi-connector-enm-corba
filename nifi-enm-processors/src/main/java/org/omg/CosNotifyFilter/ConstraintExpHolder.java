package org.omg.CosNotifyFilter;

/**
* org.omg.CosNotifyFilter/ConstraintExpHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:36 AM CDT
*/

public final class ConstraintExpHolder implements org.omg.CORBA.portable.Streamable
{
  public ConstraintExp value = null;

  public ConstraintExpHolder ()
  {
  }

  public ConstraintExpHolder (ConstraintExp initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ConstraintExpHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ConstraintExpHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ConstraintExpHelper.type ();
  }

}
