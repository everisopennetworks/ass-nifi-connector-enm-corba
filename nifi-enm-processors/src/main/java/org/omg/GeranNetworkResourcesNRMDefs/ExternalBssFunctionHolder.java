package org.omg.GeranNetworkResourcesNRMDefs;

/**
* org.omg.GeranNetworkResourcesNRMDefs/ExternalBssFunctionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GeranNetworkResourcesNRMDefs.idl
* jueves 5 de septiembre de 2019 02:19:22 AM CDT
*/


/**
       *  Definitions for MO class ExternalBssFunction
       */
public final class ExternalBssFunctionHolder implements org.omg.CORBA.portable.Streamable
{
  public ExternalBssFunction value = null;

  public ExternalBssFunctionHolder ()
  {
  }

  public ExternalBssFunctionHolder (ExternalBssFunction initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ExternalBssFunctionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ExternalBssFunctionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ExternalBssFunctionHelper.type ();
  }

}