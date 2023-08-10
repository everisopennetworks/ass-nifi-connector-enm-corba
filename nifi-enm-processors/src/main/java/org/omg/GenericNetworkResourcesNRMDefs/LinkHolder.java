package org.omg.GenericNetworkResourcesNRMDefs;

/**
* org.omg.GenericNetworkResourcesNRMDefs/LinkHolder.java .
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
public final class LinkHolder implements org.omg.CORBA.portable.Streamable
{
  public Link value = null;

  public LinkHolder ()
  {
  }

  public LinkHolder (Link initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LinkHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LinkHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LinkHelper.type ();
  }

}