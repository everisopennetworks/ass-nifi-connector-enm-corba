package org.omg.CosNotification;

/**
* org.omg.CosNotification/QoSError_codeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotification.idl
* jueves 5 de septiembre de 2019 01:57:52 AM CDT
*/

public final class QoSError_codeHolder implements org.omg.CORBA.portable.Streamable
{
  public QoSError_code value = null;

  public QoSError_codeHolder ()
  {
  }

  public QoSError_codeHolder (QoSError_code initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = QoSError_codeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    QoSError_codeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return QoSError_codeHelper.type ();
  }

}