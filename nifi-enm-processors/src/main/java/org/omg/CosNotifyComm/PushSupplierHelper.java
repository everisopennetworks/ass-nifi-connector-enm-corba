package org.omg.CosNotifyComm;


/**
* org.omg.CosNotifyComm/PushSupplierHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyComm.idl
* jueves 5 de septiembre de 2019 02:16:24 AM CDT
*/


// PullSupplier
abstract public class PushSupplierHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyComm/PushSupplier:1.0";

  public static void insert (org.omg.CORBA.Any a, PushSupplier that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static PushSupplier extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (PushSupplierHelper.id (), "PushSupplier");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static PushSupplier read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PushSupplierStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, PushSupplier value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static PushSupplier narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof PushSupplier)
      return (PushSupplier)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _PushSupplierStub stub = new _PushSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static PushSupplier unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof PushSupplier)
      return (PushSupplier)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _PushSupplierStub stub = new _PushSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
