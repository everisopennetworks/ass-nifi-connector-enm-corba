package org.omg.GenericNRMAttributeTypes;

/**
* org.omg.GenericNRMAttributeTypes/CellModeEnumTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.UtranNetworkResourcesNRMDefs.idl
* jueves 5 de septiembre de 2019 02:21:44 AM CDT
*/

public final class CellModeEnumTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public CellModeEnumType value = null;

  public CellModeEnumTypeHolder ()
  {
  }

  public CellModeEnumTypeHolder (CellModeEnumType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CellModeEnumTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CellModeEnumTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CellModeEnumTypeHelper.type ();
  }

}
