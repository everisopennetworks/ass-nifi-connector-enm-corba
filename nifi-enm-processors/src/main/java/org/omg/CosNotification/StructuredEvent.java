package org.omg.CosNotification;


/**
* org.omg.CosNotification/StructuredEvent.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotification.idl
* jueves 5 de septiembre de 2019 01:57:53 AM CDT
*/

public final class StructuredEvent implements org.omg.CORBA.portable.IDLEntity
{
  public EventHeader header = null;
  public Property filterable_data[] = null;
  public org.omg.CORBA.Any remainder_of_body = null;

  public StructuredEvent ()
  {
  } // ctor

  public StructuredEvent (EventHeader _header, Property[] _filterable_data, org.omg.CORBA.Any _remainder_of_body)
  {
    header = _header;
    filterable_data = _filterable_data;
    remainder_of_body = _remainder_of_body;
  } // ctor

} // class StructuredEvent
