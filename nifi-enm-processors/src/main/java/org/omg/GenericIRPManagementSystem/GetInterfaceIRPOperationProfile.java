package org.omg.GenericIRPManagementSystem;


/**
* org.omg.GenericIRPManagementSystem/GetInterfaceIRPOperationProfile.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementSystem.idl
* jueves 5 de septiembre de 2019 02:18:50 AM CDT
*/

public final class GetInterfaceIRPOperationProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetInterfaceIRPOperationProfile ()
  {
    super(GetInterfaceIRPOperationProfileHelper.id());
  } // ctor

  public GetInterfaceIRPOperationProfile (String _reason)
  {
    super(GetInterfaceIRPOperationProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetInterfaceIRPOperationProfile (String $reason, String _reason)
  {
    super(GetInterfaceIRPOperationProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetInterfaceIRPOperationProfile