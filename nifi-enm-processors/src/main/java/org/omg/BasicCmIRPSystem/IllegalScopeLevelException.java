package org.omg.BasicCmIRPSystem;


/**
* org.omg.BasicCmIRPSystem/IllegalScopeLevelException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:10 AM CDT
*/

public final class IllegalScopeLevelException extends org.omg.CORBA.UserException
{
  public String reason = null;

  public IllegalScopeLevelException ()
  {
    super(IllegalScopeLevelExceptionHelper.id());
  } // ctor

  public IllegalScopeLevelException (String _reason)
  {
    super(IllegalScopeLevelExceptionHelper.id());
    reason = _reason;
  } // ctor


  public IllegalScopeLevelException (String $reason, String _reason)
  {
    super(IllegalScopeLevelExceptionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class IllegalScopeLevelException
