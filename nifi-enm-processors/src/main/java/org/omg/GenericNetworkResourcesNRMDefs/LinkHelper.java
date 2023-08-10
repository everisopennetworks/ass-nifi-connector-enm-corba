package org.omg.GenericNetworkResourcesNRMDefs;


/**
* org.omg.GenericNetworkResourcesNRMDefs/LinkHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericNetworkResourcesNRMDefs.idl
* jueves 5 de septiembre de 2019 02:19:12 AM CDT
*/


/**
       *  Definitions for abstract MO class Link
       *  This inherits from ManagedFunction
       *  The attributes aEnd and zEnd are populated with the DNs
       *  of the entities associated via the link class.
       *  The aEnd takes the DN of the 1st entity in alphabetical order,
       *  the zEnd takes the 2nd entity in alphabetical order of the class
       *  names.
       */
abstract public class LinkHelper
{
  private static String  _id = "IDL:3gppsa5.org/GenericNetworkResourcesNRMDefs/Link:1.0";

  public static void insert (org.omg.CORBA.Any a, Link that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Link extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (LinkHelper.id (), "Link");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Link read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_LinkStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Link value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Link narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Link)
      return (Link)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _LinkStub stub = new _LinkStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Link unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Link)
      return (Link)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _LinkStub stub = new _LinkStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
