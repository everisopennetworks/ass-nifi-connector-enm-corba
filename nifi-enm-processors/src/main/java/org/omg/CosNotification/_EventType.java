package org.omg.CosNotification;


/**
* org.omg.CosNotification/_EventType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotification.idl
* jueves 5 de septiembre de 2019 01:57:52 AM CDT
*/

public final class _EventType implements org.omg.CORBA.portable.IDLEntity
{
  public String domain_name = null;
  public String type_name = null;

  public _EventType ()
  {
  } // ctor

  public _EventType (String _domain_name, String _type_name)
  {
    domain_name = _domain_name;
    type_name = _type_name;
  } // ctor

} // class _EventType
