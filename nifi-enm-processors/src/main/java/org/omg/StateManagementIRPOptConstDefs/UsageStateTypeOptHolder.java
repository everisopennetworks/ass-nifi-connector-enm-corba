package org.omg.StateManagementIRPOptConstDefs;

/**
* org.omg.StateManagementIRPOptConstDefs/UsageStateTypeOptHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPOptConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:32 AM CDT
*/

public final class UsageStateTypeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public UsageStateTypeOpt value = null;

  public UsageStateTypeOptHolder ()
  {
  }

  public UsageStateTypeOptHolder (UsageStateTypeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = UsageStateTypeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    UsageStateTypeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return UsageStateTypeOptHelper.type ();
  }

}
