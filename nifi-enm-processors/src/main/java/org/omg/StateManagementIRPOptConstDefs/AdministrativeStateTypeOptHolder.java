package org.omg.StateManagementIRPOptConstDefs;

/**
* org.omg.StateManagementIRPOptConstDefs/AdministrativeStateTypeOptHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPOptConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:32 AM CDT
*/

public final class AdministrativeStateTypeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public AdministrativeStateTypeOpt value = null;

  public AdministrativeStateTypeOptHolder ()
  {
  }

  public AdministrativeStateTypeOptHolder (AdministrativeStateTypeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AdministrativeStateTypeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AdministrativeStateTypeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AdministrativeStateTypeOptHelper.type ();
  }

}
