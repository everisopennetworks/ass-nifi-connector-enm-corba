package org.omg.CosNotification;


/**
* org.omg.CosNotification/NamedPropertyRange.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotification.idl
* jueves 5 de septiembre de 2019 01:57:52 AM CDT
*/

public final class NamedPropertyRange implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public PropertyRange range = null;

  public NamedPropertyRange ()
  {
  } // ctor

  public NamedPropertyRange (String _name, PropertyRange _range)
  {
    name = _name;
    range = _range;
  } // ctor

} // class NamedPropertyRange
