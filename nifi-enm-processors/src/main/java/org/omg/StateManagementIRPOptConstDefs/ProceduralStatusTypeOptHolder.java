package org.omg.StateManagementIRPOptConstDefs;

/**
* org.omg.StateManagementIRPOptConstDefs/ProceduralStatusTypeOptHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPOptConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:32 AM CDT
*/

public final class ProceduralStatusTypeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public ProceduralStatusTypeOpt value = null;

  public ProceduralStatusTypeOptHolder ()
  {
  }

  public ProceduralStatusTypeOptHolder (ProceduralStatusTypeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ProceduralStatusTypeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ProceduralStatusTypeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ProceduralStatusTypeOptHelper.type ();
  }

}