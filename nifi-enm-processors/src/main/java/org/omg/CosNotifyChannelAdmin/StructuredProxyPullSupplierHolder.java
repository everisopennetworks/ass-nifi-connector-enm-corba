package org.omg.CosNotifyChannelAdmin;

/**
* org.omg.CosNotifyChannelAdmin/StructuredProxyPullSupplierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:15 AM CDT
*/


// ProxyPullSupplier
public final class StructuredProxyPullSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public StructuredProxyPullSupplier value = null;

  public StructuredProxyPullSupplierHolder ()
  {
  }

  public StructuredProxyPullSupplierHolder (StructuredProxyPullSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StructuredProxyPullSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StructuredProxyPullSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StructuredProxyPullSupplierHelper.type ();
  }

}
