package org.omg.CSIRPSystem;


/**
* org.omg.CSIRPSystem/InvalidManagerIdentifier.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CSIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:02 AM CDT
*/

public final class InvalidManagerIdentifier extends org.omg.CORBA.UserException
{
  public String reason = null;

  public InvalidManagerIdentifier ()
  {
    super(InvalidManagerIdentifierHelper.id());
  } // ctor

  public InvalidManagerIdentifier (String _reason)
  {
    super(InvalidManagerIdentifierHelper.id());
    reason = _reason;
  } // ctor


  public InvalidManagerIdentifier (String $reason, String _reason)
  {
    super(InvalidManagerIdentifierHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class InvalidManagerIdentifier
