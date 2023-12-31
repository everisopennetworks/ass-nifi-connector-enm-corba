package org.omg.FileTransferIRPNotifications;


/**
* org.omg.FileTransferIRPNotifications/NotifyFileReadyHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPNotifications.idl
* jueves 5 de septiembre de 2019 02:17:39 AM CDT
*/


/**
   * Constant definitions for the FileReady notification
   */
abstract public class NotifyFileReadyHelper
{
  private static String  _id = "IDL:3gppsa5.org/FileTransferIRPNotifications/NotifyFileReady:1.0";

  public static void insert (org.omg.CORBA.Any a, NotifyFileReady that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static NotifyFileReady extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (NotifyFileReadyHelper.id (), "NotifyFileReady");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static NotifyFileReady read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NotifyFileReadyStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, NotifyFileReady value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static NotifyFileReady narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof NotifyFileReady)
      return (NotifyFileReady)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _NotifyFileReadyStub stub = new _NotifyFileReadyStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static NotifyFileReady unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof NotifyFileReady)
      return (NotifyFileReady)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _NotifyFileReadyStub stub = new _NotifyFileReadyStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
