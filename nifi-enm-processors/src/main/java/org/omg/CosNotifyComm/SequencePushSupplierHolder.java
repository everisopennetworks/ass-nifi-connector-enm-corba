package org.omg.CosNotifyComm;

/**
* org.omg.CosNotifyComm/SequencePushSupplierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyComm.idl
* jueves 5 de septiembre de 2019 02:16:25 AM CDT
*/


// SequencePullSupplier
public final class SequencePushSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public SequencePushSupplier value = null;

  public SequencePushSupplierHolder ()
  {
  }

  public SequencePushSupplierHolder (SequencePushSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SequencePushSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SequencePushSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SequencePushSupplierHelper.type ();
  }

}