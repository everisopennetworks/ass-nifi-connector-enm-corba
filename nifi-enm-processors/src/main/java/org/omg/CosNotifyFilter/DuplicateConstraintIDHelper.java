package org.omg.CosNotifyFilter;


/**
* org.omg.CosNotifyFilter/DuplicateConstraintIDHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:37 AM CDT
*/

abstract public class DuplicateConstraintIDHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyFilter/DuplicateConstraintID:1.0";

  public static void insert (org.omg.CORBA.Any a, DuplicateConstraintID that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DuplicateConstraintID extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (ConstraintIDHelper.id (), "ConstraintID", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (DuplicateConstraintIDHelper.id (), "DuplicateConstraintID", _members0);
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

  public static DuplicateConstraintID read (org.omg.CORBA.portable.InputStream istream)
  {
    DuplicateConstraintID value = new DuplicateConstraintID ();
    // read and discard the repository ID
    istream.read_string ();
    value.id = istream.read_long ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DuplicateConstraintID value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_long (value.id);
  }

}
