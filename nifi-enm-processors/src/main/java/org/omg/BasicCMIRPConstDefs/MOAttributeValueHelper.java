package org.omg.BasicCMIRPConstDefs;


/**
* org.omg.BasicCMIRPConstDefs/MOAttributeValueHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.BasicCMIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:15:01 AM CDT
*/


/**
    * Defines the value of an attribute of a Managed Object in form of a CORBA
    * Any. Apart from basic datatypes already defined in CORBA, the allowed
    * attribute value types are defined in the AttributeTypes module.
    */
abstract public class MOAttributeValueHelper
{
  private static String  _id = "IDL:3gppsa5.org/BasicCMIRPConstDefs/MOAttributeValue:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.Any that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CORBA.Any extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_any);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (MOAttributeValueHelper.id (), "MOAttributeValue", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CORBA.Any read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.CORBA.Any value = null;
    value = istream.read_any ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.Any value)
  {
    ostream.write_any (value);
  }

}
