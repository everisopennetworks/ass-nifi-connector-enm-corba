package org.omg.CosEventChannelAdmin;

/**
* org.omg.CosEventChannelAdmin/SupplierAdminHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosEventChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:15:23 AM CDT
*/

public final class SupplierAdminHolder implements org.omg.CORBA.portable.Streamable
{
  public SupplierAdmin value = null;

  public SupplierAdminHolder ()
  {
  }

  public SupplierAdminHolder (SupplierAdmin initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SupplierAdminHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SupplierAdminHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SupplierAdminHelper.type ();
  }

}
