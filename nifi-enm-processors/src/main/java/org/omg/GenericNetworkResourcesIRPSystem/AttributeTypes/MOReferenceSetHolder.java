package org.omg.GenericNetworkResourcesIRPSystem.AttributeTypes;


/**
* org.omg.GenericNetworkResourcesIRPSystem/AttributeTypes/MOReferenceSetHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericNetworkResourcesIRPSystem.idl
* jueves 5 de septiembre de 2019 02:19:00 AM CDT
*/


/**
       * MOReferenceSet represents a set of MO references. 
       * This type is used to hold 0..n MO references. 
       * A referred MO is not allowed to be repeated (therefore
       * it is denoted as a "Set")
       */
public final class MOReferenceSetHolder implements org.omg.CORBA.portable.Streamable
{
  public MOReference value[] = null;

  public MOReferenceSetHolder ()
  {
  }

  public MOReferenceSetHolder (MOReference[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MOReferenceSetHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MOReferenceSetHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MOReferenceSetHelper.type ();
  }

}
