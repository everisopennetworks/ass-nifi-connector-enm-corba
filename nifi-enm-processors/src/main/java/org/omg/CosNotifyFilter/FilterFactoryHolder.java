package org.omg.CosNotifyFilter;

/**
* org.omg.CosNotifyFilter/FilterFactoryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:37 AM CDT
*/


// MappingFilter
public final class FilterFactoryHolder implements org.omg.CORBA.portable.Streamable
{
  public FilterFactory value = null;

  public FilterFactoryHolder ()
  {
  }

  public FilterFactoryHolder (FilterFactory initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = FilterFactoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    FilterFactoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return FilterFactoryHelper.type ();
  }

}
