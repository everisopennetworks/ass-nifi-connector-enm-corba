package org.omg.BasicCmIRPSystem;

/**
* org.omg.BasicCmIRPSystem/DuplicateMOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:10 AM CDT
*/

public final class DuplicateMOHolder implements org.omg.CORBA.portable.Streamable
{
  public DuplicateMO value = null;

  public DuplicateMOHolder ()
  {
  }

  public DuplicateMOHolder (DuplicateMO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DuplicateMOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DuplicateMOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DuplicateMOHelper.type ();
  }

}
