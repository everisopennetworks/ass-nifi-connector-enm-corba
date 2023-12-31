package org.omg.BasicCMIRPConstDefs;


/**
* org.omg.BasicCMIRPConstDefs/DeleteErrorCategory.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.BasicCMIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:15:01 AM CDT
*/


/**
     * DeleteErrorCategory defines the categories of errors that can occur
     * during deletion of MOs.
     *
     * SUBORDINATE_OBJECT: The MO cannot be deleted due to subordinate MOs.
     * DELETE_NOT_ALLOWED: The deletion of the MO is not allowed.
     * DELETE_FAILED: The deletion failed because of an unspecified reason.
     */
public class DeleteErrorCategory implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static DeleteErrorCategory[] __array = new DeleteErrorCategory [__size];

  public static final int _SUBORDINATE_OBJECT = 0;
  public static final DeleteErrorCategory SUBORDINATE_OBJECT = new DeleteErrorCategory(_SUBORDINATE_OBJECT);
  public static final int _DELETE_NOT_ALLOWED = 1;
  public static final DeleteErrorCategory DELETE_NOT_ALLOWED = new DeleteErrorCategory(_DELETE_NOT_ALLOWED);
  public static final int _DELETE_FAILED = 2;
  public static final DeleteErrorCategory DELETE_FAILED = new DeleteErrorCategory(_DELETE_FAILED);

  public int value ()
  {
    return __value;
  }

  public static DeleteErrorCategory from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected DeleteErrorCategory (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class DeleteErrorCategory
