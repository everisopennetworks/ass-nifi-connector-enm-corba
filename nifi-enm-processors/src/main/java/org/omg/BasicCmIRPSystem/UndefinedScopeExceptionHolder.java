package org.omg.BasicCmIRPSystem;

/**
* org.omg.BasicCmIRPSystem/UndefinedScopeExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:10 AM CDT
*/

public final class UndefinedScopeExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public UndefinedScopeException value = null;

  public UndefinedScopeExceptionHolder ()
  {
  }

  public UndefinedScopeExceptionHolder (UndefinedScopeException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = UndefinedScopeExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    UndefinedScopeExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return UndefinedScopeExceptionHelper.type ();
  }

}
