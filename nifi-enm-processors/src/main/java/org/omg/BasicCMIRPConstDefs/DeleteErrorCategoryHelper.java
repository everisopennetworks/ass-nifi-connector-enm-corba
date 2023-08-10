package org.omg.BasicCMIRPConstDefs;


/**
* org.omg.BasicCMIRPConstDefs/DeleteErrorCategoryHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.BasicCMIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:15:01 AM CDT
*/


/**
     * DeleteErrorCategory defines the categories of errors that can occur
     * during deletion of MOs.
     *
     * SUBORDINATE_OBJECT: The MO cannot be deleted due to subordinate MOs.
     * DELETE_NOT_ALLOWED: The deletion of the MO is not allowed.
     * DELETE_FAILED: The deletion failed because of an unspecified reason.
     */
abstract public class DeleteErrorCategoryHelper
{
  private static String  _id = "IDL:3gppsa5.org/BasicCMIRPConstDefs/DeleteErrorCategory:1.0";

  public static void insert (org.omg.CORBA.Any a, DeleteErrorCategory that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DeleteErrorCategory extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (DeleteErrorCategoryHelper.id (), "DeleteErrorCategory", new String[] { "SUBORDINATE_OBJECT", "DELETE_NOT_ALLOWED", "DELETE_FAILED"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DeleteErrorCategory read (org.omg.CORBA.portable.InputStream istream)
  {
    return DeleteErrorCategory.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DeleteErrorCategory value)
  {
    ostream.write_long (value.value ());
  }

}