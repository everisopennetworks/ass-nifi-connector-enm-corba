package org.omg.GenericNetworkResourcesNRMDefs.LinkAttributeTypes;

/**
* org.omg.GenericNetworkResourcesNRMDefs/LinkAttributeTypes/LinkTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericNetworkResourcesNRMDefs.idl
* jueves 5 de septiembre de 2019 02:19:12 AM CDT
*/

public final class LinkTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public LinkType value = null;

  public LinkTypeHolder ()
  {
  }

  public LinkTypeHolder (LinkType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LinkTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LinkTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LinkTypeHelper.type ();
  }

}