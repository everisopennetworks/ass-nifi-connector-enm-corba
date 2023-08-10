package org.omg.CosNotifyChannelAdmin;


/**
* org.omg.CosNotifyChannelAdmin/InterFilterGroupOperatorHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:16 AM CDT
*/

abstract public class InterFilterGroupOperatorHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyChannelAdmin/InterFilterGroupOperator:1.0";

  public static void insert (org.omg.CORBA.Any a, InterFilterGroupOperator that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static InterFilterGroupOperator extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (InterFilterGroupOperatorHelper.id (), "InterFilterGroupOperator", new String[] { "AND_OP", "OR_OP"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static InterFilterGroupOperator read (org.omg.CORBA.portable.InputStream istream)
  {
    return InterFilterGroupOperator.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, InterFilterGroupOperator value)
  {
    ostream.write_long (value.value ());
  }

}