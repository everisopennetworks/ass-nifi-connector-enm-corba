package org.omg.KernelCmConstDefs;

/**
* org.omg.KernelCmConstDefs/CorrelatedNotificationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmConstDefs.idl
* jueves 5 de septiembre de 2019 02:19:33 AM CDT
*/

public final class CorrelatedNotificationHolder implements org.omg.CORBA.portable.Streamable
{
  public CorrelatedNotification value = null;

  public CorrelatedNotificationHolder ()
  {
  }

  public CorrelatedNotificationHolder (CorrelatedNotification initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CorrelatedNotificationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CorrelatedNotificationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CorrelatedNotificationHelper.type ();
  }

}
