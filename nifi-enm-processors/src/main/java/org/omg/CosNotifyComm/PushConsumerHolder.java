package org.omg.CosNotifyComm;

/**
* org.omg.CosNotifyComm/PushConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyComm.idl
* jueves 5 de septiembre de 2019 02:16:24 AM CDT
*/


// NotifySubscribe
public final class PushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public PushConsumer value = null;

  public PushConsumerHolder ()
  {
  }

  public PushConsumerHolder (PushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PushConsumerHelper.type ();
  }

}
