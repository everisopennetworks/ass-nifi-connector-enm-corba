package org.omg.CosNotification;


/**
* org.omg.CosNotification/FixedEventHeaderHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotification.idl
* jueves 5 de septiembre de 2019 01:57:52 AM CDT
*/

abstract public class FixedEventHeaderHelper
{
  private static String  _id = "IDL:omg.org/CosNotification/FixedEventHeader:1.0";

  public static void insert (org.omg.CORBA.Any a, FixedEventHeader that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static FixedEventHeader extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = _EventTypeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "event_type",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "event_name",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (FixedEventHeaderHelper.id (), "FixedEventHeader", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static FixedEventHeader read (org.omg.CORBA.portable.InputStream istream)
  {
    FixedEventHeader value = new FixedEventHeader ();
    value.event_type = _EventTypeHelper.read (istream);
    value.event_name = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, FixedEventHeader value)
  {
    _EventTypeHelper.write (ostream, value.event_type);
    ostream.write_string (value.event_name);
  }

}
