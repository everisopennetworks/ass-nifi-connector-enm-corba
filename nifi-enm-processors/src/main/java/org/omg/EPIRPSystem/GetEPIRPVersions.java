package org.omg.EPIRPSystem;


/**
* org.omg.EPIRPSystem/GetEPIRPVersions.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.EPIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:21 AM CDT
*/

public final class GetEPIRPVersions extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetEPIRPVersions ()
  {
    super(GetEPIRPVersionsHelper.id());
  } // ctor

  public GetEPIRPVersions (String _reason)
  {
    super(GetEPIRPVersionsHelper.id());
    reason = _reason;
  } // ctor


  public GetEPIRPVersions (String $reason, String _reason)
  {
    super(GetEPIRPVersionsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetEPIRPVersions