package org.omg.KernelCmNotifications;

/**
* org.omg.KernelCmNotifications/MOCreationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmNotifications.idl
* jueves 5 de septiembre de 2019 02:20:05 AM CDT
*/


/**
       *  Constant definitions for the MO created notification
       */
public final class MOCreationHolder implements org.omg.CORBA.portable.Streamable
{
  public MOCreation value = null;

  public MOCreationHolder ()
  {
  }

  public MOCreationHolder (MOCreation initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MOCreationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MOCreationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MOCreationHelper.type ();
  }

}