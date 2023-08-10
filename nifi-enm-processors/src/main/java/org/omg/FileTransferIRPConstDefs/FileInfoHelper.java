package org.omg.FileTransferIRPConstDefs;


import org.omg.TimeBase.UtcTHelper;

/**
* org.omg.FileTransferIRPConstDefs/FileInfoHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:17:31 AM CDT
*/

abstract public class FileInfoHelper
{
  private static String  _id = "IDL:3gppsa5.org/FileTransferIRPConstDefs/FileInfo:1.0";

  public static void insert (org.omg.CORBA.Any a, FileInfo that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static FileInfo extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [6];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = FileLocationHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "file_location",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulong);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (FileSizeHelper.id (), "FileSize", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "file_size",
            _tcOf_members0,
            null);
          _tcOf_members0 = UtcTHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (UTCTimeHelper.id (), "UTCTime", _tcOf_members0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "file_ready_time",
            _tcOf_members0,
            null);
          _tcOf_members0 = UtcTHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (UTCTimeHelper.id (), "UTCTime", _tcOf_members0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "file_expiration_time",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (FileCompressionHelper.id (), "FileCompression", _tcOf_members0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "file_compression",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (FileFormatHelper.id (), "FileFormat", _tcOf_members0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "file_format",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (FileInfoHelper.id (), "FileInfo", _members0);
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

  public static FileInfo read (org.omg.CORBA.portable.InputStream istream)
  {
    FileInfo value = new FileInfo ();
    value.file_location = FileLocationHelper.read (istream);
    value.file_size = istream.read_ulong ();
    value.file_ready_time = UtcTHelper.read (istream);
    value.file_expiration_time = UtcTHelper.read (istream);
    value.file_compression = istream.read_string ();
    value.file_format = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, FileInfo value)
  {
    FileLocationHelper.write (ostream, value.file_location);
    ostream.write_ulong (value.file_size);
    UtcTHelper.write (ostream, value.file_ready_time);
    UtcTHelper.write (ostream, value.file_expiration_time);
    ostream.write_string (value.file_compression);
    ostream.write_string (value.file_format);
  }

}