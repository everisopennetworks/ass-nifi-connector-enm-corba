package org.omg.GenericNetworkResourcesNRMDefs;


/**
* org.omg.GenericNetworkResourcesNRMDefs/Link.java .
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
public interface Link extends LinkOperations, ManagedFunction, org.omg.CORBA.portable.IDLEntity
{
  public static final String CLASS = "Link";

  //
  public static final String linkId = "linkId";
  public static final String aEnd = "aEnd";
  public static final String zEnd = "zEnd";
  public static final String linkType = "linkType";
  public static final String protocolName = "protocolName";
  public static final String protocolVersion = "protocolVersion";
} // interface Link