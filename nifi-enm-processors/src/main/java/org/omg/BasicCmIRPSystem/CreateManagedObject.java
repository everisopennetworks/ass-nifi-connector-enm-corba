package org.omg.BasicCmIRPSystem;


/**
* org.omg.BasicCmIRPSystem/CreateManagedObject.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:11 AM CDT
*/

public final class CreateManagedObject extends org.omg.CORBA.UserException
{
  public String reason = null;

  public CreateManagedObject ()
  {
    super(CreateManagedObjectHelper.id());
  } // ctor

  public CreateManagedObject (String _reason)
  {
    super(CreateManagedObjectHelper.id());
    reason = _reason;
  } // ctor


  public CreateManagedObject (String $reason, String _reason)
  {
    super(CreateManagedObjectHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class CreateManagedObject
