package org.omg.StateManagementIRPOptConstDefs;


/**
* org.omg.StateManagementIRPOptConstDefs/ControlStatusTypeOptHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPOptConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:32 AM CDT
*/

abstract public class ControlStatusTypeOptHelper
{
  private static String  _id = "IDL:3gppsa5.org/org.omg.StateManagementIRPOptConstDefs/ControlStatusTypeOpt:1.0";

  public static void insert (org.omg.CORBA.Any a, ControlStatusTypeOpt that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ControlStatusTypeOpt extract (org.omg.CORBA.Any a)
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

      // Branch for control_status (case label true)
      _anyOf_members0 = org.omg.CORBA.ORB.init ().create_any ();
      _anyOf_members0.insert_boolean ((boolean)true);
      _tcOf_members0 = org.omg.StateManagementIRPConstDefs.ControlStatusValuesHelper.type ();
      _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (4, _tcOf_members0);
      _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.StateManagementIRPConstDefs.ControlStatusHelper.id (), "ControlStatus", _tcOf_members0);
      _members0[0] = new org.omg.CORBA.UnionMember (
        "control_status",
        _anyOf_members0,
        _tcOf_members0,
        null);
      __typeCode = org.omg.CORBA.ORB.init ().create_union_tc (ControlStatusTypeOptHelper.id (), "ControlStatusTypeOpt", _disTypeCode0, _members0);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ControlStatusTypeOpt read (org.omg.CORBA.portable.InputStream istream)
  {
    ControlStatusTypeOpt value = new ControlStatusTypeOpt ();
    boolean _dis0 = false;
    _dis0 = istream.read_boolean ();
    if (_dis0)
    {
      org.omg.StateManagementIRPConstDefs.ControlStatusValues _control_status[] = null;
      _control_status = org.omg.StateManagementIRPConstDefs.ControlStatusHelper.read (istream);
      value.control_status (_dis0, _control_status);
    }
    else
      value._default(_dis0);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ControlStatusTypeOpt value)
  {
    ostream.write_boolean (value.discriminator ());
    if (value.discriminator ())
    {
      org.omg.StateManagementIRPConstDefs.ControlStatusHelper.write (ostream, value.control_status ());
    }
  }

}
