package org.omg.ManagedGenericIRPConstDefs;


import org.omg.TimeBase.UtcT;
import org.omg.TimeBase.UtcTHelper;

/**
* org.omg.ManagedGenericIRPConstDefs/IRPTimeHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.ManagedGenericIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:00:52 AM CDT
*/


/*
   Definition imported from CosTime.  
   The time refers to time in Greenwich Time Zone.
   It also consists of a time displacement factor in the form of minutes of
   displacement from the Greenwich Meridian.
   */
abstract public class IRPTimeHelper
{
  private static String  _id = "IDL:3gppsa5.org/ManagedGenericIRPConstDefs/IRPTime:1.0";

  public static void insert (org.omg.CORBA.Any a, UtcT that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static UtcT extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = UtcTHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (IRPTimeHelper.id (), "IRPTime", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static UtcT read (org.omg.CORBA.portable.InputStream istream)
  {
    UtcT value = null;
    value = UtcTHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, UtcT value)
  {
    UtcTHelper.write (ostream, value);
  }

}
