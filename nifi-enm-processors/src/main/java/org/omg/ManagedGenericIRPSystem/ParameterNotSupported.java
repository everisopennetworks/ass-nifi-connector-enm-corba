package org.omg.ManagedGenericIRPSystem;


/**
* org.omg.ManagedGenericIRPSystem/ParameterNotSupported.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.ManagedGenericIRPSystem.idl
* jueves 5 de septiembre de 2019 01:58:56 AM CDT
*/


/*
   Exception thrown when an unsupported optional parameter 
   is passed with information.
   The parameter shall be the actual unsupported parameter name.
   */
public final class ParameterNotSupported extends org.omg.CORBA.UserException
{
  public String parameter = null;

  public ParameterNotSupported ()
  {
    super(ParameterNotSupportedHelper.id());
  } // ctor

  public ParameterNotSupported (String _parameter)
  {
    super(ParameterNotSupportedHelper.id());
    parameter = _parameter;
  } // ctor


  public ParameterNotSupported (String $reason, String _parameter)
  {
    super(ParameterNotSupportedHelper.id() + "  " + $reason);
    parameter = _parameter;
  } // ctor

} // class ParameterNotSupported
