package org.omg.CosNotifyComm;

/**
* org.omg.CosNotifyComm/StructuredPullConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyComm.idl
* jueves 5 de septiembre de 2019 02:16:24 AM CDT
*/


// StructuredPushConsumer
public final class StructuredPullConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public StructuredPullConsumer value = null;

  public StructuredPullConsumerHolder ()
  {
  }

  public StructuredPullConsumerHolder (StructuredPullConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StructuredPullConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StructuredPullConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StructuredPullConsumerHelper.type ();
  }

}
