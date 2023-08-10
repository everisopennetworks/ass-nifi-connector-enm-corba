package org.omg.AlarmIRPConstDefs;


import org.omg.TimeBase.UtcTHelper;

/**
* org.omg.AlarmIRPConstDefs/CommentHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:42 AM CDT
*/

abstract public class CommentHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/Comment:1.0";

  public static void insert (org.omg.CORBA.Any a, Comment that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Comment extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = UtcTHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.ManagedGenericIRPConstDefs.IRPTimeHelper.id (), "IRPTime", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "comment_time",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "comment_text",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "user_id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "system_id",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (CommentHelper.id (), "Comment", _members0);
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

  public static Comment read (org.omg.CORBA.portable.InputStream istream)
  {
    Comment value = new Comment ();
    value.comment_time = UtcTHelper.read (istream);
    value.comment_text = istream.read_string ();
    value.user_id = istream.read_string ();
    value.system_id = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Comment value)
  {
    UtcTHelper.write (ostream, value.comment_time);
    ostream.write_string (value.comment_text);
    ostream.write_string (value.user_id);
    ostream.write_string (value.system_id);
  }

}
