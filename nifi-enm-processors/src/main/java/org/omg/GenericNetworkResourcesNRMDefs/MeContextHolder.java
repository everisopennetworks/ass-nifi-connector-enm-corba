package org.omg.GenericNetworkResourcesNRMDefs;

/**
* org.omg.GenericNetworkResourcesNRMDefs/MeContextHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericNetworkResourcesNRMDefs.idl
* jueves 5 de septiembre de 2019 02:19:11 AM CDT
*/


/**
       *  Definitions for MO class MeContext
       */
public final class MeContextHolder implements org.omg.CORBA.portable.Streamable
{
  public MeContext value = null;

  public MeContextHolder ()
  {
  }

  public MeContextHolder (MeContext initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MeContextHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MeContextHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MeContextHelper.type ();
  }

}
