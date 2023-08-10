package org.omg.KernelCmNotifications;


/**
* org.omg.KernelCmNotifications/AttributeValueChangeHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmNotifications.idl
* jueves 5 de septiembre de 2019 02:20:05 AM CDT
*/


/**
       *  Constant definitions for the Attribute Value Change
       *  notification
       */
abstract public class AttributeValueChangeHelper
{
  private static String  _id = "IDL:3gppsa5.org/KernelCmNotifications/AttributeValueChange:1.0";

  public static void insert (org.omg.CORBA.Any a, AttributeValueChange that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AttributeValueChange extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (AttributeValueChangeHelper.id (), "AttributeValueChange");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AttributeValueChange read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AttributeValueChangeStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AttributeValueChange value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static AttributeValueChange narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AttributeValueChange)
      return (AttributeValueChange)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _AttributeValueChangeStub stub = new _AttributeValueChangeStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static AttributeValueChange unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AttributeValueChange)
      return (AttributeValueChange)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _AttributeValueChangeStub stub = new _AttributeValueChangeStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
