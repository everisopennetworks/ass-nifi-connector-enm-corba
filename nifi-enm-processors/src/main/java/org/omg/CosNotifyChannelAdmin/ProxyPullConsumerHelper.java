package org.omg.CosNotifyChannelAdmin;


/**
* org.omg.CosNotifyChannelAdmin/ProxyPullConsumerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:15 AM CDT
*/


// SequenceProxyPullSupplier
abstract public class ProxyPullConsumerHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyChannelAdmin/ProxyPullConsumer:1.0";

  public static void insert (org.omg.CORBA.Any a, ProxyPullConsumer that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ProxyPullConsumer extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ProxyPullConsumerHelper.id (), "ProxyPullConsumer");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ProxyPullConsumer read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ProxyPullConsumerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ProxyPullConsumer value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static ProxyPullConsumer narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ProxyPullConsumer)
      return (ProxyPullConsumer)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _ProxyPullConsumerStub stub = new _ProxyPullConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static ProxyPullConsumer unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ProxyPullConsumer)
      return (ProxyPullConsumer)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _ProxyPullConsumerStub stub = new _ProxyPullConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
