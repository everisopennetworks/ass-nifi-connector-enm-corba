package org.omg.BasicCMIRPConstDefs;


/**
* org.omg.BasicCMIRPConstDefs/ModifyOperatorHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.BasicCMIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:15:01 AM CDT
*/


/**
     * ModifyOperator defines the way in which an attribute value is to be
     * applied to an attribute in a modification of MO attributes.
     *
     * REPLACE: replace the current value with the provided value
     * ADD_VALUES: for a multi-valued attribute, add the provided values to the
     *   current list of values
     * REMOVE_VALUES: for a multi-valued attribute, remove the provided values
     *   from the current list of values
     * SET_TO_DEFAULT: set the attribute to its default value
     */
abstract public class ModifyOperatorHelper
{
  private static String  _id = "IDL:3gppsa5.org/BasicCMIRPConstDefs/ModifyOperator:1.0";

  public static void insert (org.omg.CORBA.Any a, ModifyOperator that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ModifyOperator extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (ModifyOperatorHelper.id (), "ModifyOperator", new String[] { "REPLACE", "ADD_VALUES", "REMOVE_VALUES", "SET_TO_DEFAULT"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ModifyOperator read (org.omg.CORBA.portable.InputStream istream)
  {
    return ModifyOperator.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ModifyOperator value)
  {
    ostream.write_long (value.value ());
  }

}
