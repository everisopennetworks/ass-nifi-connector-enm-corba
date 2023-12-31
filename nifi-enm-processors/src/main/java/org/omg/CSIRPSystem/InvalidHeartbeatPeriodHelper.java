package org.omg.CSIRPSystem;


/**
* org.omg.CSIRPSystem/InvalidHeartbeatPeriodHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CSIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:02 AM CDT
*/

abstract public class InvalidHeartbeatPeriodHelper
{
  private static String  _id = "IDL:3gppsa5.org/CSIRPSystem/InvalidHeartbeatPeriod:1.0";

  public static void insert (org.omg.CORBA.Any a, InvalidHeartbeatPeriod that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static InvalidHeartbeatPeriod extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ushort);
          _members0[0] = new org.omg.CORBA.StructMember (
            "periodLowerLimit",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "reason",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (InvalidHeartbeatPeriodHelper.id (), "InvalidHeartbeatPeriod", _members0);
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

  public static InvalidHeartbeatPeriod read (org.omg.CORBA.portable.InputStream istream)
  {
    InvalidHeartbeatPeriod value = new InvalidHeartbeatPeriod ();
    // read and discard the repository ID
    istream.read_string ();
    value.periodLowerLimit = istream.read_ushort ();
    value.reason = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, InvalidHeartbeatPeriod value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_ushort (value.periodLowerLimit);
    ostream.write_string (value.reason);
  }

}
