package org.omg.CosEventComm;

/**
* org.omg.CosEventComm/PushSupplierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosEventComm.idl
* jueves 5 de septiembre de 2019 02:15:44 AM CDT
*/

public final class PushSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public PushSupplier value = null;

  public PushSupplierHolder ()
  {
  }

  public PushSupplierHolder (PushSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PushSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PushSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PushSupplierHelper.type ();
  }

}
