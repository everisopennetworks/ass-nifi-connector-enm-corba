package org.omg.NotificationIRPSystem;

/**
* org.omg.NotificationIRPSystem/ChangeSubscriptionFilterHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.NotificationIRPSystem.idl
* jueves 5 de septiembre de 2019 01:39:37 AM CDT
*/

public final class ChangeSubscriptionFilterHolder implements org.omg.CORBA.portable.Streamable
{
  public ChangeSubscriptionFilter value = null;

  public ChangeSubscriptionFilterHolder ()
  {
  }

  public ChangeSubscriptionFilterHolder (ChangeSubscriptionFilter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ChangeSubscriptionFilterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ChangeSubscriptionFilterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ChangeSubscriptionFilterHelper.type ();
  }

}
