package org.omg.FileTransferIRPConstDefs;


/**
* org.omg.FileTransferIRPConstDefs/FileInfoListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:17:31 AM CDT
*/

public final class FileInfoListHolder implements org.omg.CORBA.portable.Streamable
{
  public FileInfo value[] = null;

  public FileInfoListHolder ()
  {
  }

  public FileInfoListHolder (FileInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = FileInfoListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    FileInfoListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return FileInfoListHelper.type ();
  }

}
