package org.omg.CSIRPSystem;


/**
* org.omg.CSIRPSystem/SetHeartbeatPeriod.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CSIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:02 AM CDT
*/

public final class SetHeartbeatPeriod extends org.omg.CORBA.UserException
{
  public String reason = null;

  public SetHeartbeatPeriod ()
  {
    super(SetHeartbeatPeriodHelper.id());
  } // ctor

  public SetHeartbeatPeriod (String _reason)
  {
    super(SetHeartbeatPeriodHelper.id());
    reason = _reason;
  } // ctor


  public SetHeartbeatPeriod (String $reason, String _reason)
  {
    super(SetHeartbeatPeriodHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class SetHeartbeatPeriod
