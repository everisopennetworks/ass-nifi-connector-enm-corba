package org.omg.CosEventChannelAdmin;

/**
* org.omg.CosEventChannelAdmin/AlreadyConnectedHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosEventChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:15:22 AM CDT
*/

public final class AlreadyConnectedHolder implements org.omg.CORBA.portable.Streamable
{
  public AlreadyConnected value = null;

  public AlreadyConnectedHolder ()
  {
  }

  public AlreadyConnectedHolder (AlreadyConnected initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlreadyConnectedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlreadyConnectedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlreadyConnectedHelper.type ();
  }

}
