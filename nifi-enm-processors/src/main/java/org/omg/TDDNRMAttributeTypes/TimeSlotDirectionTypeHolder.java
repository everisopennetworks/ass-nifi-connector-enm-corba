package org.omg.TDDNRMAttributeTypes;

/**
* org.omg.TDDNRMAttributeTypes/TimeSlotDirectionTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.UtranNetworkResourcesNRMDefs.idl
* jueves 5 de septiembre de 2019 02:21:44 AM CDT
*/

public final class TimeSlotDirectionTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public TimeSlotDirectionType value = null;

  public TimeSlotDirectionTypeHolder ()
  {
  }

  public TimeSlotDirectionTypeHolder (TimeSlotDirectionType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = TimeSlotDirectionTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    TimeSlotDirectionTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return TimeSlotDirectionTypeHelper.type ();
  }

}
