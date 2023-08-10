package org.omg.StateManagementIRPConstDefs;


/**
* org.omg.StateManagementIRPConstDefs/StandbyStatusHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:20 AM CDT
*/


/*
   Definition of Standby Status based on X.721 [3], if mandatory.
   */
abstract public class StandbyStatusHelper
{
  private static String  _id = "IDL:3gppsa5.org/org.omg.StateManagementIRPConstDefs/StandbyStatus:1.0";

  public static void insert (org.omg.CORBA.Any a, StandbyStatus that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static StandbyStatus extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (StandbyStatusHelper.id (), "StandbyStatus", new String[] { "HotStandby", "ColdStandby", "ProvidingService"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static StandbyStatus read (org.omg.CORBA.portable.InputStream istream)
  {
    return StandbyStatus.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, StandbyStatus value)
  {
    ostream.write_long (value.value ());
  }

}
