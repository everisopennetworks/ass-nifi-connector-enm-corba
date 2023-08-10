package org.omg.CosNotifyChannelAdmin;


/**
* org.omg.CosNotifyChannelAdmin/ProxyTypeHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:14 AM CDT
*/

abstract public class ProxyTypeHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyChannelAdmin/ProxyType:1.0";

  public static void insert (org.omg.CORBA.Any a, ProxyType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ProxyType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (ProxyTypeHelper.id (), "ProxyType", new String[] { "PUSH_ANY", "PULL_ANY", "PUSH_STRUCTURED", "PULL_STRUCTURED", "PUSH_SEQUENCE", "PULL_SEQUENCE", "PUSH_TYPED", "PULL_TYPED"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ProxyType read (org.omg.CORBA.portable.InputStream istream)
  {
    return ProxyType.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ProxyType value)
  {
    ostream.write_long (value.value ());
  }

}
