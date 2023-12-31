package org.omg.CSIRPConstDefs;


/**
* org.omg.CSIRPConstDefs/TriggerFlagType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CSIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:16:49 AM CDT
*/


/*
  If notifyHeartbeat is triggered by NM positively by invoking 
  triggerHeartbeat operation, the value of this parameter shall be IRPManager,
  otherwise, it shall be IRPAgent.
  */
public class TriggerFlagType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static TriggerFlagType[] __array = new TriggerFlagType [__size];

  public static final int _IRPManager = 0;
  public static final TriggerFlagType IRPManager = new TriggerFlagType(_IRPManager);
  public static final int _IRPAgent = 1;
  public static final TriggerFlagType IRPAgent = new TriggerFlagType(_IRPAgent);

  public int value ()
  {
    return __value;
  }

  public static TriggerFlagType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected TriggerFlagType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class TriggerFlagType
