package org.omg.StateManagementIRPConstDefs;


/**
* org.omg.StateManagementIRPConstDefs/AvailabilityStatusOldNewValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPOptConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:33 AM CDT
*/

public final class AvailabilityStatusOldNewValue implements org.omg.CORBA.portable.IDLEntity
{
  public AvailabilityStatusValues _new = null;
  public org.omg.StateManagementIRPOptConstDefs.AvailabilityStatusTypeOpt old = null;

  public AvailabilityStatusOldNewValue ()
  {
  } // ctor

  public AvailabilityStatusOldNewValue (AvailabilityStatusValues __new, org.omg.StateManagementIRPOptConstDefs.AvailabilityStatusTypeOpt _old)
  {
    _new = __new;
    old = _old;
  } // ctor

} // class AvailabilityStatusOldNewValue
