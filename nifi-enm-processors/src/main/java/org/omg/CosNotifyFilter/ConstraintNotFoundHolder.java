package org.omg.CosNotifyFilter;

/**
* org.omg.CosNotifyFilter/ConstraintNotFoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:37 AM CDT
*/

public final class ConstraintNotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public ConstraintNotFound value = null;

  public ConstraintNotFoundHolder ()
  {
  }

  public ConstraintNotFoundHolder (ConstraintNotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ConstraintNotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ConstraintNotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ConstraintNotFoundHelper.type ();
  }

}
