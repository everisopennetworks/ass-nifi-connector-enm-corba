package org.omg.CosNotifyFilter;


/**
* org.omg.CosNotifyFilter/CallbackNotFound.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:37 AM CDT
*/

public final class CallbackNotFound extends org.omg.CORBA.UserException
{

  public CallbackNotFound ()
  {
    super(CallbackNotFoundHelper.id());
  } // ctor


  public CallbackNotFound (String $reason)
  {
    super(CallbackNotFoundHelper.id() + "  " + $reason);
  } // ctor

} // class CallbackNotFound
