package org.omg.CosNotification;

/**
* org.omg.CosNotification/PropertyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotification.idl
* jueves 5 de septiembre de 2019 01:57:52 AM CDT
*/

public final class PropertyHolder implements org.omg.CORBA.portable.Streamable
{
  public Property value = null;

  public PropertyHolder ()
  {
  }

  public PropertyHolder (Property initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PropertyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PropertyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PropertyHelper.type ();
  }

}
