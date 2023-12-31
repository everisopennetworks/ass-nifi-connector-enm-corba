package org.omg.AlarmIRPConstDefs;


/**
* org.omg.AlarmIRPConstDefs/AckStateHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:42 AM CDT
*/


/*
   This block identifies the acknowledgement state of a reported alarm.
   */
abstract public class AckStateHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/AckState:1.0";

  public static void insert (org.omg.CORBA.Any a, AckState that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AckState extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (AckStateHelper.id (), "AckState");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AckState read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AckStateStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AckState value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static AckState narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AckState)
      return (AckState)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _AckStateStub stub = new _AckStateStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static AckState unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AckState)
      return (AckState)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _AckStateStub stub = new _AckStateStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
