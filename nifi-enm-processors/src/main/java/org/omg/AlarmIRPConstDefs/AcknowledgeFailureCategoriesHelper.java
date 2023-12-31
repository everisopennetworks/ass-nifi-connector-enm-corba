package org.omg.AlarmIRPConstDefs;


/**
* org.omg.AlarmIRPConstDefs/AcknowledgeFailureCategoriesHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:43 AM CDT
*/


/*
   It indicates the reason for an alarm acknowledgement to have failed:
     - The specified Alarm Information is absent from the Alarm List
     - The Perceived Severity to be acknowledged has changed and/or is different
       within the Alarm List
     - The acknowledgement failed for some other reason
   */
abstract public class AcknowledgeFailureCategoriesHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/AcknowledgeFailureCategories:1.0";

  public static void insert (org.omg.CORBA.Any a, AcknowledgeFailureCategories that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AcknowledgeFailureCategories extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (AcknowledgeFailureCategoriesHelper.id (), "AcknowledgeFailureCategories", new String[] { "UnknownAlarmId", "WrongPerceivedSeverity", "AcknowledgmentFailed"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AcknowledgeFailureCategories read (org.omg.CORBA.portable.InputStream istream)
  {
    return AcknowledgeFailureCategories.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AcknowledgeFailureCategories value)
  {
    ostream.write_long (value.value ());
  }

}
