package org.omg.BasicCmIRPSystem;


/**
* org.omg.BasicCmIRPSystem/DeleteManagedObjects.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:11 AM CDT
*/

public final class DeleteManagedObjects extends org.omg.CORBA.UserException
{
  public String reason = null;

  public DeleteManagedObjects ()
  {
    super(DeleteManagedObjectsHelper.id());
  } // ctor

  public DeleteManagedObjects (String _reason)
  {
    super(DeleteManagedObjectsHelper.id());
    reason = _reason;
  } // ctor


  public DeleteManagedObjects (String $reason, String _reason)
  {
    super(DeleteManagedObjectsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class DeleteManagedObjects
