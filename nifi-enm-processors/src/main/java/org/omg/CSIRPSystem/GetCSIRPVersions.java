package org.omg.CSIRPSystem;


/**
* org.omg.CSIRPSystem/GetCSIRPVersions.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CSIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:03 AM CDT
*/

public final class GetCSIRPVersions extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetCSIRPVersions ()
  {
    super(GetCSIRPVersionsHelper.id());
  } // ctor

  public GetCSIRPVersions (String _reason)
  {
    super(GetCSIRPVersionsHelper.id());
    reason = _reason;
  } // ctor


  public GetCSIRPVersions (String $reason, String _reason)
  {
    super(GetCSIRPVersionsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetCSIRPVersions
