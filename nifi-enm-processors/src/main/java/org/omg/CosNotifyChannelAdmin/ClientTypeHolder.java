package org.omg.CosNotifyChannelAdmin;

/**
* org.omg.CosNotifyChannelAdmin/ClientTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:16 AM CDT
*/

public final class ClientTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public ClientType value = null;

  public ClientTypeHolder ()
  {
  }

  public ClientTypeHolder (ClientType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ClientTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ClientTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ClientTypeHelper.type ();
  }

}
