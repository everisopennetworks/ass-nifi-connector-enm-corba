package org.omg.CosNotifyChannelAdmin;


/**
* org.omg.CosNotifyChannelAdmin/StructuredProxyPullSupplierHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:15 AM CDT
*/


// ProxyPullSupplier
abstract public class StructuredProxyPullSupplierHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyChannelAdmin/StructuredProxyPullSupplier:1.0";

  public static void insert (org.omg.CORBA.Any a, StructuredProxyPullSupplier that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static StructuredProxyPullSupplier extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (StructuredProxyPullSupplierHelper.id (), "StructuredProxyPullSupplier");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static StructuredProxyPullSupplier read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_StructuredProxyPullSupplierStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, StructuredProxyPullSupplier value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static StructuredProxyPullSupplier narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof StructuredProxyPullSupplier)
      return (StructuredProxyPullSupplier)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _StructuredProxyPullSupplierStub stub = new _StructuredProxyPullSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static StructuredProxyPullSupplier unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof StructuredProxyPullSupplier)
      return (StructuredProxyPullSupplier)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _StructuredProxyPullSupplierStub stub = new _StructuredProxyPullSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
