package org.omg.KernelCmNotifications;

/**
* org.omg.KernelCmNotifications/MODeletionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmNotifications.idl
* jueves 5 de septiembre de 2019 02:20:05 AM CDT
*/


/**
       *  Constant definitions for the MO deleted notification
       */
public final class MODeletionHolder implements org.omg.CORBA.portable.Streamable
{
  public MODeletion value = null;

  public MODeletionHolder ()
  {
  }

  public MODeletionHolder (MODeletion initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MODeletionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MODeletionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MODeletionHelper.type ();
  }

}
