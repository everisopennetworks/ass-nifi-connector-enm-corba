package org.omg.CosNotification;


/**
* org.omg.CosNotification/PropertyErrorSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotification.idl
* jueves 5 de septiembre de 2019 01:57:52 AM CDT
*/

public final class PropertyErrorSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public PropertyError value[] = null;

  public PropertyErrorSeqHolder ()
  {
  }

  public PropertyErrorSeqHolder (PropertyError[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PropertyErrorSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PropertyErrorSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PropertyErrorSeqHelper.type ();
  }

}
