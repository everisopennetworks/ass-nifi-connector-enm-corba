package org.omg.GenericNetworkResourcesNRMDefs;

/**
* org.omg.GenericNetworkResourcesNRMDefs/VsDataContainerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericNetworkResourcesNRMDefs.idl
* jueves 5 de septiembre de 2019 02:19:12 AM CDT
*/


/**
       *  Definitions for MO class VsDataContainer
       */
public final class VsDataContainerHolder implements org.omg.CORBA.portable.Streamable
{
  public VsDataContainer value = null;

  public VsDataContainerHolder ()
  {
  }

  public VsDataContainerHolder (VsDataContainer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = VsDataContainerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    VsDataContainerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return VsDataContainerHelper.type ();
  }

}
