package org.omg.CosNotification;


/**
* org.omg.CosNotification/AdminPropertiesAdminHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotification.idl
* jueves 5 de septiembre de 2019 01:57:53 AM CDT
*/


// RejectNewEvents takes on a value of type Boolean
abstract public class AdminPropertiesAdminHelper
{
  private static String  _id = "IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0";

  public static void insert (org.omg.CORBA.Any a, AdminPropertiesAdmin that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AdminPropertiesAdmin extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (AdminPropertiesAdminHelper.id (), "AdminPropertiesAdmin");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AdminPropertiesAdmin read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AdminPropertiesAdminStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AdminPropertiesAdmin value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static AdminPropertiesAdmin narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AdminPropertiesAdmin)
      return (AdminPropertiesAdmin)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _AdminPropertiesAdminStub stub = new _AdminPropertiesAdminStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static AdminPropertiesAdmin unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AdminPropertiesAdmin)
      return (AdminPropertiesAdmin)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _AdminPropertiesAdminStub stub = new _AdminPropertiesAdminStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
