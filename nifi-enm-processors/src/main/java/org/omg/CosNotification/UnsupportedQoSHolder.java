package org.omg.CosNotification;

/**
* org.omg.CosNotification/UnsupportedQoSHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotification.idl
* jueves 5 de septiembre de 2019 01:57:52 AM CDT
*/

public final class UnsupportedQoSHolder implements org.omg.CORBA.portable.Streamable
{
  public UnsupportedQoS value = null;

  public UnsupportedQoSHolder ()
  {
  }

  public UnsupportedQoSHolder (UnsupportedQoS initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = UnsupportedQoSHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    UnsupportedQoSHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return UnsupportedQoSHelper.type ();
  }

}
