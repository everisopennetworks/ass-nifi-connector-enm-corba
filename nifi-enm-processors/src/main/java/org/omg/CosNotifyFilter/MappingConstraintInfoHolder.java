package org.omg.CosNotifyFilter;

/**
* org.omg.CosNotifyFilter/MappingConstraintInfoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:37 AM CDT
*/

public final class MappingConstraintInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public MappingConstraintInfo value = null;

  public MappingConstraintInfoHolder ()
  {
  }

  public MappingConstraintInfoHolder (MappingConstraintInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MappingConstraintInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MappingConstraintInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MappingConstraintInfoHelper.type ();
  }

}
