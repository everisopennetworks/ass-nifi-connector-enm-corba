package org.omg.GenericIRPManagementConstDefs;

/**
* org.omg.GenericIRPManagementConstDefs/IRPTimeOptHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementConstDefs.idl
* jueves 5 de septiembre de 2019 02:18:41 AM CDT
*/

public final class IRPTimeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public IRPTimeOpt value = null;

  public IRPTimeOptHolder ()
  {
  }

  public IRPTimeOptHolder (IRPTimeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IRPTimeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IRPTimeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IRPTimeOptHelper.type ();
  }

}