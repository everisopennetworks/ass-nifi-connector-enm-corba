package org.omg.StateManagementIRPOptConstDefs;


/**
* org.omg.StateManagementIRPOptConstDefs/StandbyStatusTypeOpt.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPOptConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:32 AM CDT
*/

public final class StandbyStatusTypeOpt implements org.omg.CORBA.portable.IDLEntity
{
  private org.omg.StateManagementIRPConstDefs.StandbyStatus ___standby_status;
  private boolean __discriminator;
  private boolean __uninitialized = true;

  public StandbyStatusTypeOpt ()
  {
  }

  public boolean discriminator ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    return __discriminator;
  }

  public org.omg.StateManagementIRPConstDefs.StandbyStatus standby_status ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifystandby_status (__discriminator);
    return ___standby_status;
  }

  public void standby_status (org.omg.StateManagementIRPConstDefs.StandbyStatus value)
  {
    __discriminator = true;
    ___standby_status = value;
    __uninitialized = false;
  }

  public void standby_status (boolean discriminator, org.omg.StateManagementIRPConstDefs.StandbyStatus value)
  {
    verifystandby_status (discriminator);
    __discriminator = discriminator;
    ___standby_status = value;
    __uninitialized = false;
  }

  private void verifystandby_status (boolean discriminator)
  {
    if (discriminator != true)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public void _default ()
  {
    __discriminator = false;
    __uninitialized = false;
  }

  public void _default (boolean discriminator)
  {
    verifyDefault( discriminator ) ;
    __discriminator = discriminator ;
    __uninitialized = false;
  }

  private void verifyDefault (boolean discriminator)
  {
    if ( discriminator )
        throw new org.omg.CORBA.BAD_OPERATION();
  }

} // class StandbyStatusTypeOpt