package org.omg.FileTransferIRPSystem;

/**
* org.omg.FileTransferIRPSystem/GetFileTransferIRPVersionsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPSystem.idl
* jueves 5 de septiembre de 2019 02:18:30 AM CDT
*/

public final class GetFileTransferIRPVersionsHolder implements org.omg.CORBA.portable.Streamable
{
  public GetFileTransferIRPVersions value = null;

  public GetFileTransferIRPVersionsHolder ()
  {
  }

  public GetFileTransferIRPVersionsHolder (GetFileTransferIRPVersions initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = GetFileTransferIRPVersionsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    GetFileTransferIRPVersionsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return GetFileTransferIRPVersionsHelper.type ();
  }

}