package org.omg.KernelCmIRPSystem;

/**
* org.omg.KernelCmIRPSystem/GetKernelCMIRPVersionsExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmIRPSystem.idl
* jueves 5 de septiembre de 2019 02:19:42 AM CDT
*/

public final class GetKernelCMIRPVersionsExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public GetKernelCMIRPVersionsException value = null;

  public GetKernelCMIRPVersionsExceptionHolder ()
  {
  }

  public GetKernelCMIRPVersionsExceptionHolder (GetKernelCMIRPVersionsException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = GetKernelCMIRPVersionsExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    GetKernelCMIRPVersionsExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return GetKernelCMIRPVersionsExceptionHelper.type ();
  }

}