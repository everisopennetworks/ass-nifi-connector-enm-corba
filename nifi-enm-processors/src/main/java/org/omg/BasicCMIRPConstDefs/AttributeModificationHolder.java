package org.omg.BasicCMIRPConstDefs;

/**
* org.omg.BasicCMIRPConstDefs/AttributeModificationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.BasicCMIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:15:02 AM CDT
*/

public final class AttributeModificationHolder implements org.omg.CORBA.portable.Streamable
{
  public AttributeModification value = null;

  public AttributeModificationHolder ()
  {
  }

  public AttributeModificationHolder (AttributeModification initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AttributeModificationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AttributeModificationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AttributeModificationHelper.type ();
  }

}
