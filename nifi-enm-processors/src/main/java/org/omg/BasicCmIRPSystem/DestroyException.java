package org.omg.BasicCmIRPSystem;


/**
* org.omg.BasicCmIRPSystem/DestroyException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:11 AM CDT
*/

public final class DestroyException extends org.omg.CORBA.UserException
{
  public String reason = null;

  public DestroyException ()
  {
    super(DestroyExceptionHelper.id());
  } // ctor

  public DestroyException (String _reason)
  {
    super(DestroyExceptionHelper.id());
    reason = _reason;
  } // ctor


  public DestroyException (String $reason, String _reason)
  {
    super(DestroyExceptionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class DestroyException
