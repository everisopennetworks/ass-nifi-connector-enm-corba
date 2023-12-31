package org.omg.GenericIRPManagementConstDefs;


/**
* org.omg.GenericIRPManagementConstDefs/Result.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementConstDefs.idl
* jueves 5 de septiembre de 2019 02:18:40 AM CDT
*/

public class Result implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static Result[] __array = new Result [__size];

  public static final int _SUCCESS = 0;
  public static final Result SUCCESS = new Result(_SUCCESS);
  public static final int _FAILURE = 1;
  public static final Result FAILURE = new Result(_FAILURE);

  public int value ()
  {
    return __value;
  }

  public static Result from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected Result (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class Result
