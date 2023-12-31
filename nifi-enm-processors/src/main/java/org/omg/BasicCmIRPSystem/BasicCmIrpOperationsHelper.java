package org.omg.BasicCmIRPSystem;


/**
* org.omg.BasicCmIRPSystem/BasicCmIrpOperationsHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:12 AM CDT
*/


/**
     * The BasicCmIrpOperations interface.
     * Supports a number of Resource Model versions.
     */
abstract public class BasicCmIrpOperationsHelper
{
  private static String  _id = "IDL:3gppsa5.org/BasicCmIRPSystem/BasicCmIrpOperations:1.0";

  public static void insert (org.omg.CORBA.Any a, BasicCmIrpOperations that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static BasicCmIrpOperations extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (BasicCmIrpOperationsHelper.id (), "BasicCmIrpOperations");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static BasicCmIrpOperations read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_BasicCmIrpOperationsStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, BasicCmIrpOperations value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static BasicCmIrpOperations narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof BasicCmIrpOperations)
      return (BasicCmIrpOperations)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _BasicCmIrpOperationsStub stub = new _BasicCmIrpOperationsStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static BasicCmIrpOperations unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof BasicCmIrpOperations)
      return (BasicCmIrpOperations)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _BasicCmIrpOperationsStub stub = new _BasicCmIrpOperationsStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
