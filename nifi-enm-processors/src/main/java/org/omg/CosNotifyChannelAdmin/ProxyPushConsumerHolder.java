package org.omg.CosNotifyChannelAdmin;

/**
* org.omg.CosNotifyChannelAdmin/ProxyPushConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:15 AM CDT
*/


// ProxySupplier
public final class ProxyPushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public ProxyPushConsumer value = null;

  public ProxyPushConsumerHolder ()
  {
  }

  public ProxyPushConsumerHolder (ProxyPushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ProxyPushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ProxyPushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ProxyPushConsumerHelper.type ();
  }

}