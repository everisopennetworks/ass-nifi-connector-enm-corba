package org.omg.GenericIRPManagementConstDefs;


/**
* org.omg.GenericIRPManagementConstDefs/MethodHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementConstDefs.idl
* jueves 5 de septiembre de 2019 02:18:40 AM CDT
*/

abstract public class MethodHelper
{
  private static String  _id = "IDL:3gppsa5.org/GenericIRPManagementConstDefs/Method:1.0";

  public static void insert (org.omg.CORBA.Any a, Method that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Method extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (MethodNameHelper.id (), "MethodName", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (ParameterNameHelper.id (), "ParameterName", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (ParameterListHelper.id (), "ParameterList", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "parameter_list",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (MethodHelper.id (), "Method", _members0);
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

  public static Method read (org.omg.CORBA.portable.InputStream istream)
  {
    Method value = new Method ();
    value.name = istream.read_string ();
    value.parameter_list = ParameterListHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Method value)
  {
    ostream.write_string (value.name);
    ParameterListHelper.write (ostream, value.parameter_list);
  }

}
