package org.omg.NotificationIRPConstDefs;


/**
* org.omg.NotificationIRPConstDefs/SubscriptionIdSetHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.NotificationIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:10:24 AM CDT
*/

public final class SubscriptionIdSetHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public SubscriptionIdSetHolder ()
  {
  }

  public SubscriptionIdSetHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SubscriptionIdSetHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SubscriptionIdSetHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SubscriptionIdSetHelper.type ();
  }

}
