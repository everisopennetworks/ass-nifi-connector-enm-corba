package org.omg.FileTransferIRPConstDefs;


/**
* org.omg.FileTransferIRPConstDefs/FileLocationHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:17:31 AM CDT
*/

abstract public class FileLocationHelper
{
  private static String  _id = "IDL:3gppsa5.org/FileTransferIRPConstDefs/FileLocation:1.0";

  public static void insert (org.omg.CORBA.Any a, FileLocation that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static FileLocation extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = URLHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "url",
            _tcOf_members0,
            null);
          _tcOf_members0 = DIRECTORYHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "directory",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (FileLocationHelper.id (), "FileLocation", _members0);
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

  public static FileLocation read (org.omg.CORBA.portable.InputStream istream)
  {
    FileLocation value = new FileLocation ();
    value.url = URLHelper.read (istream);
    value.directory = DIRECTORYHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, FileLocation value)
  {
    URLHelper.write (ostream, value.url);
    DIRECTORYHelper.write (ostream, value.directory);
  }

}