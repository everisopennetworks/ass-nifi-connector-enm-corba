package org.omg.CosEventChannelAdmin;

/**
* org.omg.CosEventChannelAdmin/ConsumerAdminHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosEventChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:15:23 AM CDT
*/

public final class ConsumerAdminHolder implements org.omg.CORBA.portable.Streamable
{
  public ConsumerAdmin value = null;

  public ConsumerAdminHolder ()
  {
  }

  public ConsumerAdminHolder (ConsumerAdmin initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ConsumerAdminHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ConsumerAdminHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ConsumerAdminHelper.type ();
  }

}
