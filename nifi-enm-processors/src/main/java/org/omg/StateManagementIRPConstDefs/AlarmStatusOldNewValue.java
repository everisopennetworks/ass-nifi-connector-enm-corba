package org.omg.StateManagementIRPConstDefs;


/**
* org.omg.StateManagementIRPConstDefs/AlarmStatusOldNewValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPOptConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:33 AM CDT
*/

public final class AlarmStatusOldNewValue implements org.omg.CORBA.portable.IDLEntity
{
  public AlarmStatusValues _new = null;
  public org.omg.StateManagementIRPOptConstDefs.AdministrativeStateTypeOpt old = null;

  public AlarmStatusOldNewValue ()
  {
  } // ctor

  public AlarmStatusOldNewValue (AlarmStatusValues __new, org.omg.StateManagementIRPOptConstDefs.AdministrativeStateTypeOpt _old)
  {
    _new = __new;
    old = _old;
  } // ctor

} // class AlarmStatusOldNewValue
