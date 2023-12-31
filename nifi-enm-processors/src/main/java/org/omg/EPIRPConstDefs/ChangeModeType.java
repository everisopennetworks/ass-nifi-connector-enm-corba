package org.omg.EPIRPConstDefs;


/**
* org.omg.EPIRPConstDefs/ChangeModeType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.EPIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:17:10 AM CDT
*/

public class ChangeModeType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static ChangeModeType[] __array = new ChangeModeType [__size];

  public static final int _REGISTER = 0;
  public static final ChangeModeType REGISTER = new ChangeModeType(_REGISTER);
  public static final int _DEREGISTER = 1;
  public static final ChangeModeType DEREGISTER = new ChangeModeType(_DEREGISTER);
  public static final int _MODIFY = 2;
  public static final ChangeModeType MODIFY = new ChangeModeType(_MODIFY);

  public int value ()
  {
    return __value;
  }

  public static ChangeModeType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ChangeModeType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ChangeModeType
