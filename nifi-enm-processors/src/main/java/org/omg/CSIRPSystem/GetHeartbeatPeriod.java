package org.omg.CSIRPSystem;


/**
* org.omg.CSIRPSystem/GetHeartbeatPeriod.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CSIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:02 AM CDT
*/

public final class GetHeartbeatPeriod extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetHeartbeatPeriod ()
  {
    super(GetHeartbeatPeriodHelper.id());
  } // ctor

  public GetHeartbeatPeriod (String _reason)
  {
    super(GetHeartbeatPeriodHelper.id());
    reason = _reason;
  } // ctor


  public GetHeartbeatPeriod (String $reason, String _reason)
  {
    super(GetHeartbeatPeriodHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetHeartbeatPeriod
