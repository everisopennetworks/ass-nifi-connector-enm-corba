package org.omg.GeranNetworkResourcesNRMDefs;

/**
* org.omg.GeranNetworkResourcesNRMDefs/BssFunctionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GeranNetworkResourcesNRMDefs.idl
* jueves 5 de septiembre de 2019 02:19:22 AM CDT
*/


/**
       *  Definitions for MO class BssFunction
       */
public final class BssFunctionHolder implements org.omg.CORBA.portable.Streamable
{
  public BssFunction value = null;

  public BssFunctionHolder ()
  {
  }

  public BssFunctionHolder (BssFunction initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BssFunctionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BssFunctionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BssFunctionHelper.type ();
  }

}