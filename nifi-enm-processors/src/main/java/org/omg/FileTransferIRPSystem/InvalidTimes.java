package org.omg.FileTransferIRPSystem;


/**
* org.omg.FileTransferIRPSystem/InvalidTimes.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPSystem.idl
* jueves 5 de septiembre de 2019 02:18:30 AM CDT
*/

public final class InvalidTimes extends org.omg.CORBA.UserException
{
  public String reason = null;

  public InvalidTimes ()
  {
    super(InvalidTimesHelper.id());
  } // ctor

  public InvalidTimes (String _reason)
  {
    super(InvalidTimesHelper.id());
    reason = _reason;
  } // ctor


  public InvalidTimes (String $reason, String _reason)
  {
    super(InvalidTimesHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class InvalidTimes
