package org.omg.AlarmIRPNotifications;


/**
* org.omg.AlarmIRPNotifications/NotifyPotentialFaultyAlarmListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPNotifications.idl
* jueves 5 de septiembre de 2019 01:10:29 AM CDT
*/

abstract public class NotifyPotentialFaultyAlarmListHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPNotifications/NotifyPotentialFaultyAlarmList:1.0";

  public static void insert (org.omg.CORBA.Any a, NotifyPotentialFaultyAlarmList that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static NotifyPotentialFaultyAlarmList extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (NotifyPotentialFaultyAlarmListHelper.id (), "NotifyPotentialFaultyAlarmList");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static NotifyPotentialFaultyAlarmList read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NotifyPotentialFaultyAlarmListStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, NotifyPotentialFaultyAlarmList value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static NotifyPotentialFaultyAlarmList narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof NotifyPotentialFaultyAlarmList)
      return (NotifyPotentialFaultyAlarmList)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _NotifyPotentialFaultyAlarmListStub stub = new _NotifyPotentialFaultyAlarmListStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static NotifyPotentialFaultyAlarmList unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof NotifyPotentialFaultyAlarmList)
      return (NotifyPotentialFaultyAlarmList)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _NotifyPotentialFaultyAlarmListStub stub = new _NotifyPotentialFaultyAlarmListStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
