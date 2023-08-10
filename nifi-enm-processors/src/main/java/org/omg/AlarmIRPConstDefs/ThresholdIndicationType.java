package org.omg.AlarmIRPConstDefs;


/**
* org.omg.AlarmIRPConstDefs/ThresholdIndicationType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPConstDefs.idl
* jueves 5 de septiembre de 2019 01:59:43 AM CDT
*/


/*
   It indicates if the threshold crossed was in the up or down direction.
   */
public class ThresholdIndicationType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static ThresholdIndicationType[] __array = new ThresholdIndicationType [__size];

  public static final int _UP = 0;
  public static final ThresholdIndicationType UP = new ThresholdIndicationType(_UP);
  public static final int _DOWN = 1;
  public static final ThresholdIndicationType DOWN = new ThresholdIndicationType(_DOWN);

  public int value ()
  {
    return __value;
  }

  public static ThresholdIndicationType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ThresholdIndicationType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ThresholdIndicationType
