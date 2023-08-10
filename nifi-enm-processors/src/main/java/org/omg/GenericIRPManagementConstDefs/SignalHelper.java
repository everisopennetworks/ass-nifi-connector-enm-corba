package org.omg.GenericIRPManagementConstDefs;


/**
* org.omg.GenericIRPManagementConstDefs/SignalHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementConstDefs.idl
* jueves 5 de septiembre de 2019 02:18:40 AM CDT
*/

abstract public class SignalHelper
{
  private static String  _id = "IDL:3gppsa5.org/GenericIRPManagementConstDefs/Signal:1.0";

  public static void insert (org.omg.CORBA.Any a, Signal that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Signal extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (SignalHelper.id (), "Signal", new String[] { "OK", "FULL_FAILURE", "PARTIAL_FAILURE"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Signal read (org.omg.CORBA.portable.InputStream istream)
  {
    return Signal.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Signal value)
  {
    ostream.write_long (value.value ());
  }

}