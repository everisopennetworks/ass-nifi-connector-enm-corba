package org.omg.CosEventChannelAdmin;


/**
* org.omg.CosEventChannelAdmin/ConsumerAdminHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosEventChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:15:23 AM CDT
*/

abstract public class ConsumerAdminHelper
{
  private static String  _id = "IDL:omg.org/CosEventChannelAdmin/ConsumerAdmin:1.0";

  public static void insert (org.omg.CORBA.Any a, ConsumerAdmin that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ConsumerAdmin extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ConsumerAdminHelper.id (), "ConsumerAdmin");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ConsumerAdmin read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ConsumerAdminStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ConsumerAdmin value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static ConsumerAdmin narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ConsumerAdmin)
      return (ConsumerAdmin)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _ConsumerAdminStub stub = new _ConsumerAdminStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static ConsumerAdmin unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ConsumerAdmin)
      return (ConsumerAdmin)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _ConsumerAdminStub stub = new _ConsumerAdminStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
