package org.omg.BasicCMIRPConstDefs;


/**
* org.omg.BasicCMIRPConstDefs/AttributeError.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.BasicCMIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:15:01 AM CDT
*/

public final class AttributeError implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public AttributeErrorCategory error = null;
  public org.omg.CORBA.Any value = null;
  public String reason = null;

  public AttributeError ()
  {
  } // ctor

  public AttributeError (String _name, AttributeErrorCategory _error, org.omg.CORBA.Any _value, String _reason)
  {
    name = _name;
    error = _error;
    value = _value;
    reason = _reason;
  } // ctor

} // class AttributeError
