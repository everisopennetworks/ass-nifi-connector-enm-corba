package org.omg.EPIRPSystem;

/**
* org.omg.EPIRPSystem/ReleaseIRPReferenceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.EPIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:21 AM CDT
*/

public final class ReleaseIRPReferenceHolder implements org.omg.CORBA.portable.Streamable
{
  public ReleaseIRPReference value = null;

  public ReleaseIRPReferenceHolder ()
  {
  }

  public ReleaseIRPReferenceHolder (ReleaseIRPReference initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ReleaseIRPReferenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ReleaseIRPReferenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ReleaseIRPReferenceHelper.type ();
  }

}
