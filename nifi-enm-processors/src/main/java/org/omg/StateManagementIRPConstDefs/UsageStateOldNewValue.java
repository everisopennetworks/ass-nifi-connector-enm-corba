package org.omg.StateManagementIRPConstDefs;


/**
* org.omg.StateManagementIRPConstDefs/UsageStateOldNewValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPOptConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:32 AM CDT
*/

public final class UsageStateOldNewValue implements org.omg.CORBA.portable.IDLEntity
{
  public UsageState _new = null;
  public org.omg.StateManagementIRPOptConstDefs.UsageStateTypeOpt old = null;

  public UsageStateOldNewValue ()
  {
  } // ctor

  public UsageStateOldNewValue (UsageState __new, org.omg.StateManagementIRPOptConstDefs.UsageStateTypeOpt _old)
  {
    _new = __new;
    old = _old;
  } // ctor

} // class UsageStateOldNewValue