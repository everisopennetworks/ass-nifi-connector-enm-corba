package org.omg.CosNotifyFilter;

/**
* org.omg.CosNotifyFilter/FilterNotFoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:38 AM CDT
*/

public final class FilterNotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public FilterNotFound value = null;

  public FilterNotFoundHolder ()
  {
  }

  public FilterNotFoundHolder (FilterNotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = FilterNotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    FilterNotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return FilterNotFoundHelper.type ();
  }

}
