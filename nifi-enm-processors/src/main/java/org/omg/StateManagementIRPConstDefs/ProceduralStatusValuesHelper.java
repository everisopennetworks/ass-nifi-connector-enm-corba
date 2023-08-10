package org.omg.StateManagementIRPConstDefs;


/**
* org.omg.StateManagementIRPConstDefs/ProceduralStatusValuesHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:19 AM CDT
*/


/*
   Definition of Procedural Status based on X.721 [3], if mandatory.
   */
abstract public class ProceduralStatusValuesHelper
{
  private static String  _id = "IDL:3gppsa5.org/org.omg.StateManagementIRPConstDefs/ProceduralStatusValues:1.0";

  public static void insert (org.omg.CORBA.Any a, ProceduralStatusValues that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ProceduralStatusValues extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (ProceduralStatusValuesHelper.id (), "ProceduralStatusValues", new String[] { "InitializationRequired", "NotInitialized", "Initializing", "Reporting", "Terminating"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ProceduralStatusValues read (org.omg.CORBA.portable.InputStream istream)
  {
    return ProceduralStatusValues.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ProceduralStatusValues value)
  {
    ostream.write_long (value.value ());
  }

}
