package org.omg.CosNotifyChannelAdmin;

/**
* org.omg.CosNotifyChannelAdmin/ProxySupplierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:15 AM CDT
*/


// ProxyConsumer
public final class ProxySupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public ProxySupplier value = null;

  public ProxySupplierHolder ()
  {
  }

  public ProxySupplierHolder (ProxySupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ProxySupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ProxySupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ProxySupplierHelper.type ();
  }

}
