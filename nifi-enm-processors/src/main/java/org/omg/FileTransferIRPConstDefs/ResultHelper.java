package org.omg.FileTransferIRPConstDefs;


/**
* org.omg.FileTransferIRPConstDefs/ResultHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:17:31 AM CDT
*/

abstract public class ResultHelper
{
  private static String  _id = "IDL:3gppsa5.org/FileTransferIRPConstDefs/Result:1.0";

  public static void insert (org.omg.CORBA.Any a, Result that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Result extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (ResultHelper.id (), "Result", new String[] { "OK", "FAILURE"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Result read (org.omg.CORBA.portable.InputStream istream)
  {
    return Result.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Result value)
  {
    ostream.write_long (value.value ());
  }

}