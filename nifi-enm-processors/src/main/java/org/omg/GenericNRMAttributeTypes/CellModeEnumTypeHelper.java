package org.omg.GenericNRMAttributeTypes;


/**
* org.omg.GenericNRMAttributeTypes/CellModeEnumTypeHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.UtranNetworkResourcesNRMDefs.idl
* jueves 5 de septiembre de 2019 02:21:44 AM CDT
*/

abstract public class CellModeEnumTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/GenericNRMAttributeTypes/CellModeEnumType:1.0";

  public static void insert (org.omg.CORBA.Any a, CellModeEnumType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CellModeEnumType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (CellModeEnumTypeHelper.id (), "CellModeEnumType", new String[] { "FDDMode", "TDDMode_1_28Mcps", "TDDMode_3_84Mcps"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CellModeEnumType read (org.omg.CORBA.portable.InputStream istream)
  {
    return CellModeEnumType.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CellModeEnumType value)
  {
    ostream.write_long (value.value ());
  }

}
