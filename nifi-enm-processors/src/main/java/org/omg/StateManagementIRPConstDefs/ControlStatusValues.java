package org.omg.StateManagementIRPConstDefs;


/**
* org.omg.StateManagementIRPConstDefs/ControlStatusValues.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.StateManagementIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:21:20 AM CDT
*/


/*
   Definition of Control Status based on X.721 [3], if mandatory.
   */
public class ControlStatusValues implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 4;
  private static ControlStatusValues[] __array = new ControlStatusValues [__size];

  public static final int _SubjectToTest = 0;
  public static final ControlStatusValues SubjectToTest = new ControlStatusValues(_SubjectToTest);
  public static final int _PartOfServicesLocked = 1;
  public static final ControlStatusValues PartOfServicesLocked = new ControlStatusValues(_PartOfServicesLocked);
  public static final int _ReservedForTest = 2;
  public static final ControlStatusValues ReservedForTest = new ControlStatusValues(_ReservedForTest);
  public static final int _Suspended = 3;
  public static final ControlStatusValues Suspended = new ControlStatusValues(_Suspended);

  public int value ()
  {
    return __value;
  }

  public static ControlStatusValues from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ControlStatusValues (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ControlStatusValues
