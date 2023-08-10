package org.omg.TimeBase;


import org.omg.TimeBase.IntervalT;
import org.omg.TimeBase.TimeTHelper;

/**
* org.omg.TimeBase/IntervalTHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.TimeBase.idl
* jueves 5 de septiembre de 2019 02:04:35 AM CDT
*/

abstract public class IntervalTHelper
{
  private static String  _id = "IDL:omg.org/org.omg.TimeBase/IntervalT:1.0";

  public static void insert (org.omg.CORBA.Any a, IntervalT that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IntervalT extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulonglong);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (TimeTHelper.id (), "TimeT", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "lower_bound",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulonglong);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (TimeTHelper.id (), "TimeT", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "upper_bound",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (id(), "IntervalT", _members0);
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

  public static IntervalT read (org.omg.CORBA.portable.InputStream istream)
  {
    IntervalT value = new IntervalT ();
    value.lower_bound = istream.read_ulonglong ();
    value.upper_bound = istream.read_ulonglong ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IntervalT value)
  {
    ostream.write_ulonglong (value.lower_bound);
    ostream.write_ulonglong (value.upper_bound);
  }

}
