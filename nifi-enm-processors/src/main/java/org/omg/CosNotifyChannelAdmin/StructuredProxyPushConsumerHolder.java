package org.omg.CosNotifyChannelAdmin;

/**
* org.omg.CosNotifyChannelAdmin/StructuredProxyPushConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:15 AM CDT
*/


// ProxyPushConsumer
public final class StructuredProxyPushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public StructuredProxyPushConsumer value = null;

  public StructuredProxyPushConsumerHolder ()
  {
  }

  public StructuredProxyPushConsumerHolder (StructuredProxyPushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StructuredProxyPushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StructuredProxyPushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StructuredProxyPushConsumerHelper.type ();
  }

}
