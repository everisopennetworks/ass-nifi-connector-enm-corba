package org.omg.AlarmIRPConstDefs;


/**
* org.omg.AlarmIRPConstDefs/TrendIndicationTypeHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:43 AM CDT
*/


/*
   It indicates if some observed condition is getting better, worse,
   or not changing.
   */
abstract public class TrendIndicationTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/TrendIndicationType:1.0";

  public static void insert (org.omg.CORBA.Any a, TrendIndicationType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static TrendIndicationType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (TrendIndicationTypeHelper.id (), "TrendIndicationType", new String[] { "LessSevere", "NoChange", "MoreSevere"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static TrendIndicationType read (org.omg.CORBA.portable.InputStream istream)
  {
    return TrendIndicationType.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, TrendIndicationType value)
  {
    ostream.write_long (value.value ());
  }

}
