package org.omg.KernelCmIRPSystem;

/**
* org.omg.KernelCmIRPSystem/KernelCmIrpOperationsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmIRPSystem.idl
* jueves 5 de septiembre de 2019 02:19:42 AM CDT
*/


/**
     * The KernelCmIrpOperations interface.
     * Supports a number of Resource Model versions.
     */
public final class KernelCmIrpOperationsHolder implements org.omg.CORBA.portable.Streamable
{
  public KernelCmIrpOperations value = null;

  public KernelCmIrpOperationsHolder ()
  {
  }

  public KernelCmIrpOperationsHolder (KernelCmIrpOperations initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = KernelCmIrpOperationsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    KernelCmIrpOperationsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return KernelCmIrpOperationsHelper.type ();
  }

}
