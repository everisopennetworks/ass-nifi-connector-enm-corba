package org.omg.KernelCmConstDefs;


/**
* org.omg.KernelCmConstDefs/MOAttributeSetHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmConstDefs.idl
* jueves 5 de septiembre de 2019 02:19:32 AM CDT
*/


/**
       * A set of attribute names and values
       */
abstract public class MOAttributeSetHelper
{
  private static String  _id = "IDL:3gppsa5.org/KernelCmConstDefs/MOAttributeSet:1.0";

  public static void insert (org.omg.CORBA.Any a, MOAttribute[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static MOAttribute[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = MOAttributeHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (MOAttributeSetHelper.id (), "MOAttributeSet", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static MOAttribute[] read (org.omg.CORBA.portable.InputStream istream)
  {
    MOAttribute value[] = null;
    int _len0 = istream.read_long ();
    value = new MOAttribute[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = MOAttributeHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, MOAttribute[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      MOAttributeHelper.write (ostream, value[_i0]);
  }

}
