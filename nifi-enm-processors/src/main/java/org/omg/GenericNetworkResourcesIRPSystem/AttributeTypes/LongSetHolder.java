package org.omg.GenericNetworkResourcesIRPSystem.AttributeTypes;


/**
* org.omg.GenericNetworkResourcesIRPSystem/AttributeTypes/LongSetHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericNetworkResourcesIRPSystem.idl
* jueves 5 de septiembre de 2019 02:19:00 AM CDT
*/


/**
       *  A set of long. 
       */
public final class LongSetHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public LongSetHolder ()
  {
  }

  public LongSetHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LongSetHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LongSetHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LongSetHelper.type ();
  }

}