package org.omg.CosNotifyFilter;


/**
* org.omg.CosNotifyFilter/ConstraintNotFound.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:37 AM CDT
*/

public final class ConstraintNotFound extends org.omg.CORBA.UserException
{
  public int id = (int)0;

  public ConstraintNotFound ()
  {
    super(ConstraintNotFoundHelper.id());
  } // ctor

  public ConstraintNotFound (int _id)
  {
    super(ConstraintNotFoundHelper.id());
    id = _id;
  } // ctor


  public ConstraintNotFound (String $reason, int _id)
  {
    super(ConstraintNotFoundHelper.id() + "  " + $reason);
    id = _id;
  } // ctor

} // class ConstraintNotFound
