package org.omg.FileTransferIRPSystem;

/**
* org.omg.FileTransferIRPSystem/FileDownloadIndicationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPSystem.idl
* jueves 5 de septiembre de 2019 02:18:30 AM CDT
*/

public final class FileDownloadIndicationHolder implements org.omg.CORBA.portable.Streamable
{
  public FileDownloadIndication value = null;

  public FileDownloadIndicationHolder ()
  {
  }

  public FileDownloadIndicationHolder (FileDownloadIndication initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = FileDownloadIndicationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    FileDownloadIndicationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return FileDownloadIndicationHelper.type ();
  }

}