package org.omg.CosNotifyChannelAdmin;

/**
* org.omg.CosNotifyChannelAdmin/InterFilterGroupOperatorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:16 AM CDT
*/

public final class InterFilterGroupOperatorHolder implements org.omg.CORBA.portable.Streamable
{
  public InterFilterGroupOperator value = null;

  public InterFilterGroupOperatorHolder ()
  {
  }

  public InterFilterGroupOperatorHolder (InterFilterGroupOperator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InterFilterGroupOperatorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InterFilterGroupOperatorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InterFilterGroupOperatorHelper.type ();
  }

}