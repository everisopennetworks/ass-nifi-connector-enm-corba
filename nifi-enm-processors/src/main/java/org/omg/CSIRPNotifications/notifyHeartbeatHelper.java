package org.omg.CSIRPNotifications;


/**
* org.omg.CSIRPNotifications/notifyHeartbeatHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CSIRPNotifications.idl
* jueves 5 de septiembre de 2019 02:16:55 AM CDT
*/


/**
   *  Constant definitions for the FileReady notification
   */
abstract public class notifyHeartbeatHelper
{
  private static String  _id = "IDL:3gppsa5.org/CSIRPNotifications/notifyHeartbeat:1.0";

  public static void insert (org.omg.CORBA.Any a, notifyHeartbeat that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static notifyHeartbeat extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (notifyHeartbeatHelper.id (), "notifyHeartbeat");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static notifyHeartbeat read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_notifyHeartbeatStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, notifyHeartbeat value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static notifyHeartbeat narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof notifyHeartbeat)
      return (notifyHeartbeat)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _notifyHeartbeatStub stub = new _notifyHeartbeatStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static notifyHeartbeat unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof notifyHeartbeat)
      return (notifyHeartbeat)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _notifyHeartbeatStub stub = new _notifyHeartbeatStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
