package org.omg.BasicCmIRPSystem;


/**
* org.omg.BasicCmIRPSystem/NoSuchObjectClass.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:11 AM CDT
*/

public final class NoSuchObjectClass extends org.omg.CORBA.UserException
{
  public String objectClass = null;

  public NoSuchObjectClass ()
  {
    super(NoSuchObjectClassHelper.id());
  } // ctor

  public NoSuchObjectClass (String _objectClass)
  {
    super(NoSuchObjectClassHelper.id());
    objectClass = _objectClass;
  } // ctor


  public NoSuchObjectClass (String $reason, String _objectClass)
  {
    super(NoSuchObjectClassHelper.id() + "  " + $reason);
    objectClass = _objectClass;
  } // ctor

} // class NoSuchObjectClass
