package org.omg.FileTransferIRPNotifications;

/**
* org.omg.FileTransferIRPNotifications/NotifyFileReadyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPNotifications.idl
* jueves 5 de septiembre de 2019 02:17:39 AM CDT
*/


/**
   * Constant definitions for the FileReady notification
   */
public final class NotifyFileReadyHolder implements org.omg.CORBA.portable.Streamable
{
  public NotifyFileReady value = null;

  public NotifyFileReadyHolder ()
  {
  }

  public NotifyFileReadyHolder (NotifyFileReady initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotifyFileReadyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotifyFileReadyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotifyFileReadyHelper.type ();
  }

}
