package org.omg.BasicCmIRPSystem;


/**
* org.omg.BasicCmIRPSystem/GetBasicCmIRPVersion.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:11 AM CDT
*/

public final class GetBasicCmIRPVersion extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetBasicCmIRPVersion ()
  {
    super(GetBasicCmIRPVersionHelper.id());
  } // ctor

  public GetBasicCmIRPVersion (String _reason)
  {
    super(GetBasicCmIRPVersionHelper.id());
    reason = _reason;
  } // ctor


  public GetBasicCmIRPVersion (String $reason, String _reason)
  {
    super(GetBasicCmIRPVersionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetBasicCmIRPVersion
