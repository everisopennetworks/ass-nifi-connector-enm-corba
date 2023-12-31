package org.omg.StateManagementIRPOptConstDefs;


/**
* org.omg.StateManagementIRPOptConstDefs/AdministrativeStateTypeOpt.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPOptConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:32 AM CDT
*/

public final class AdministrativeStateTypeOpt implements org.omg.CORBA.portable.IDLEntity
{
  private org.omg.StateManagementIRPConstDefs.AdministrativeState ___administrative_state;
  private boolean __discriminator;
  private boolean __uninitialized = true;

  public AdministrativeStateTypeOpt ()
  {
  }

  public boolean discriminator ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    return __discriminator;
  }

  public org.omg.StateManagementIRPConstDefs.AdministrativeState administrative_state ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyadministrative_state (__discriminator);
    return ___administrative_state;
  }

  public void administrative_state (org.omg.StateManagementIRPConstDefs.AdministrativeState value)
  {
    __discriminator = true;
    ___administrative_state = value;
    __uninitialized = false;
  }

  public void administrative_state (boolean discriminator, org.omg.StateManagementIRPConstDefs.AdministrativeState value)
  {
    verifyadministrative_state (discriminator);
    __discriminator = discriminator;
    ___administrative_state = value;
    __uninitialized = false;
  }

  private void verifyadministrative_state (boolean discriminator)
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

} // class AdministrativeStateTypeOpt
