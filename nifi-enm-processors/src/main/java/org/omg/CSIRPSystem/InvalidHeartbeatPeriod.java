package org.omg.CSIRPSystem;


/**
* org.omg.CSIRPSystem/InvalidHeartbeatPeriod.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CSIRPSystem.idl
* jueves 5 de septiembre de 2019 02:17:02 AM CDT
*/

public final class InvalidHeartbeatPeriod extends org.omg.CORBA.UserException
{
  public short periodLowerLimit = (short)0;
  public String reason = null;

  public InvalidHeartbeatPeriod ()
  {
    super(InvalidHeartbeatPeriodHelper.id());
  } // ctor

  public InvalidHeartbeatPeriod (short _periodLowerLimit, String _reason)
  {
    super(InvalidHeartbeatPeriodHelper.id());
    periodLowerLimit = _periodLowerLimit;
    reason = _reason;
  } // ctor


  public InvalidHeartbeatPeriod (String $reason, short _periodLowerLimit, String _reason)
  {
    super(InvalidHeartbeatPeriodHelper.id() + "  " + $reason);
    periodLowerLimit = _periodLowerLimit;
    reason = _reason;
  } // ctor

} // class InvalidHeartbeatPeriod
