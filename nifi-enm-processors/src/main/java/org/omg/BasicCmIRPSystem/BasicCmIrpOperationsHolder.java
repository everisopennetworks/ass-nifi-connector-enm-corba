package org.omg.BasicCmIRPSystem;

/**
* org.omg.BasicCmIRPSystem/BasicCmIrpOperationsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:12 AM CDT
*/


/**
     * The BasicCmIrpOperations interface.
     * Supports a number of Resource Model versions.
     */
public final class BasicCmIrpOperationsHolder implements org.omg.CORBA.portable.Streamable
{
  public BasicCmIrpOperations value = null;

  public BasicCmIrpOperationsHolder ()
  {
  }

  public BasicCmIrpOperationsHolder (BasicCmIrpOperations initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BasicCmIrpOperationsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BasicCmIrpOperationsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BasicCmIrpOperationsHelper.type ();
  }

}
