package org.omg.UtranNetworkResourcesNRMDefs;

/**
* org.omg.UtranNetworkResourcesNRMDefs/RncFunctionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.UtranNetworkResourcesNRMDefs.idl
* jueves 5 de septiembre de 2019 02:21:43 AM CDT
*/


/**
       *  Definitions for MO class RncFunction
       */
public final class RncFunctionHolder implements org.omg.CORBA.portable.Streamable
{
  public RncFunction value = null;

  public RncFunctionHolder ()
  {
  }

  public RncFunctionHolder (RncFunction initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RncFunctionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RncFunctionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RncFunctionHelper.type ();
  }

}