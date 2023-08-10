package org.omg.BasicCMIRPConstDefs;


/**
* org.omg.BasicCMIRPConstDefs/ResultContents.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.BasicCMIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:15:01 AM CDT
*/


/**
     * ResultContents is used to tell how much information to get back
     * from the find_managed_objects operation.
     *
     * NAMES: Used to get only Distinguished Name 
     *        for MOs. 
     *        The name contains both the MO class 
     *        and the names of all superior objects in the naming
     *        tree.
     *
     * NAMES_AND_ATTRIBUTES: Used to get both NAMES plus  
     *    MO attributes (all or selected).
     */
public class ResultContents implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static ResultContents[] __array = new ResultContents [__size];

  public static final int _NAMES = 0;
  public static final ResultContents NAMES = new ResultContents(_NAMES);
  public static final int _NAMES_AND_ATTRIBUTES = 1;
  public static final ResultContents NAMES_AND_ATTRIBUTES = new ResultContents(_NAMES_AND_ATTRIBUTES);

  public int value ()
  {
    return __value;
  }

  public static ResultContents from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ResultContents (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ResultContents
