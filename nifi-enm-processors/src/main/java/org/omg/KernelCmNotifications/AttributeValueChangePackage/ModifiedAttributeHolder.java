package org.omg.KernelCmNotifications.AttributeValueChangePackage;

/**
* org.omg.KernelCmNotifications/AttributeValueChangePackage/ModifiedAttributeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmNotifications.idl
* jueves 5 de septiembre de 2019 02:20:05 AM CDT
*/

public final class ModifiedAttributeHolder implements org.omg.CORBA.portable.Streamable
{
  public ModifiedAttribute value = null;

  public ModifiedAttributeHolder ()
  {
  }

  public ModifiedAttributeHolder (ModifiedAttribute initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ModifiedAttributeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ModifiedAttributeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ModifiedAttributeHelper.type ();
  }

}
