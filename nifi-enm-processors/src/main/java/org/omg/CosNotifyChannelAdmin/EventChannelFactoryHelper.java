package org.omg.CosNotifyChannelAdmin;


/**
* org.omg.CosNotifyChannelAdmin/EventChannelFactoryHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:17 AM CDT
*/

abstract public class EventChannelFactoryHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyChannelAdmin/EventChannelFactory:1.0";

  public static void insert (org.omg.CORBA.Any a, EventChannelFactory that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static EventChannelFactory extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (EventChannelFactoryHelper.id (), "EventChannelFactory");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static EventChannelFactory read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_EventChannelFactoryStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, EventChannelFactory value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static EventChannelFactory narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof EventChannelFactory)
      return (EventChannelFactory)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _EventChannelFactoryStub stub = new _EventChannelFactoryStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static EventChannelFactory unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof EventChannelFactory)
      return (EventChannelFactory)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _EventChannelFactoryStub stub = new _EventChannelFactoryStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
