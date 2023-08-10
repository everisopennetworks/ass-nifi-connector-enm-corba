package org.omg.AlarmIRPConstDefs;


/**
* org.omg.AlarmIRPConstDefs/AlarmListAlignmentRequirementType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:43 AM CDT
*/


/*
   It indicates if the AlarmList alignment is required.
   */
public class AlarmListAlignmentRequirementType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static AlarmListAlignmentRequirementType[] __array = new AlarmListAlignmentRequirementType [__size];

  public static final int _REQUIRED = 0;
  public static final AlarmListAlignmentRequirementType REQUIRED = new AlarmListAlignmentRequirementType(_REQUIRED);
  public static final int _NOTREQUIRED = 1;
  public static final AlarmListAlignmentRequirementType NOTREQUIRED = new AlarmListAlignmentRequirementType(_NOTREQUIRED);

  public int value ()
  {
    return __value;
  }

  public static AlarmListAlignmentRequirementType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected AlarmListAlignmentRequirementType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class AlarmListAlignmentRequirementType