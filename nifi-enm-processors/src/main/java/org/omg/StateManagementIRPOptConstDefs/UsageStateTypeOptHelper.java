package org.omg.StateManagementIRPOptConstDefs;


/**
* org.omg.StateManagementIRPOptConstDefs/UsageStateTypeOptHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPOptConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:32 AM CDT
*/

abstract public class UsageStateTypeOptHelper
{
  private static String  _id = "IDL:3gppsa5.org/org.omg.StateManagementIRPOptConstDefs/UsageStateTypeOpt:1.0";

  public static void insert (org.omg.CORBA.Any a, UsageStateTypeOpt that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static UsageStateTypeOpt extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      org.omg.CORBA.TypeCode _disTypeCode0;
      _disTypeCode0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
      org.omg.CORBA.UnionMember[] _members0 = new org.omg.CORBA.UnionMember [1];
      org.omg.CORBA.TypeCode _tcOf_members0;
      org.omg.CORBA.Any _anyOf_members0;

      // Branch for usage_state (case label true)
      _anyOf_members0 = org.omg.CORBA.ORB.init ().create_any ();
      _anyOf_members0.insert_boolean ((boolean)true);
      _tcOf_members0 = org.omg.StateManagementIRPConstDefs.UsageStateHelper.type ();
      _members0[0] = new org.omg.CORBA.UnionMember (
        "usage_state",
        _anyOf_members0,
        _tcOf_members0,
        null);
      __typeCode = org.omg.CORBA.ORB.init ().create_union_tc (UsageStateTypeOptHelper.id (), "UsageStateTypeOpt", _disTypeCode0, _members0);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static UsageStateTypeOpt read (org.omg.CORBA.portable.InputStream istream)
  {
    UsageStateTypeOpt value = new UsageStateTypeOpt ();
    boolean _dis0 = false;
    _dis0 = istream.read_boolean ();
    if (_dis0)
    {
      org.omg.StateManagementIRPConstDefs.UsageState _usage_state = null;
      _usage_state = org.omg.StateManagementIRPConstDefs.UsageStateHelper.read (istream);
      value.usage_state (_dis0, _usage_state);
    }
    else
      value._default(_dis0);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, UsageStateTypeOpt value)
  {
    ostream.write_boolean (value.discriminator ());
    if (value.discriminator ())
    {
      org.omg.StateManagementIRPConstDefs.UsageStateHelper.write (ostream, value.usage_state ());
    }
  }

}
