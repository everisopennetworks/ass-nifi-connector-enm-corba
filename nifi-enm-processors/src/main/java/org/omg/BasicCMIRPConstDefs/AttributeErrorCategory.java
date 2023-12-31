package org.omg.BasicCMIRPConstDefs;


/**
* org.omg.BasicCMIRPConstDefs/AttributeErrorCategory.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.BasicCMIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:15:01 AM CDT
*/


/**
     * AttributeErrorCategory defines the categories of errors, related to
     * attributes, that can occur during creation or modification of MOs.
     *
     * NO_SUCH_ATTRIBUTE: The specified attribute does not exist.
     * INVALID_ATTRIBUTE_VALUE: The specified attribute value is not valid.
     * MISSING_ATTRIBUTE_VALUE: An attribute value is required but none was
     *   provided and no default value is defined for the attribute.
     * INVALID_MODIFY_OPERATOR: The specified modify operator is not valid
     *   (e.g. operator ADD_VALUES applied to a non multi-valued attribute
     *   or operator SET_TO_DEFAULT applied where no default value is defined).
     * MODIFY_NOT_ALLOWED: The modification of the attribute is not allowed.
     * MODIFY_FAILED: The modification failed because of an unspecified reason.
     */
public class AttributeErrorCategory implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 6;
  private static AttributeErrorCategory[] __array = new AttributeErrorCategory [__size];

  public static final int _NO_SUCH_ATTRIBUTE = 0;
  public static final AttributeErrorCategory NO_SUCH_ATTRIBUTE = new AttributeErrorCategory(_NO_SUCH_ATTRIBUTE);
  public static final int _INVALID_ATTRIBUTE_VALUE = 1;
  public static final AttributeErrorCategory INVALID_ATTRIBUTE_VALUE = new AttributeErrorCategory(_INVALID_ATTRIBUTE_VALUE);
  public static final int _MISSING_ATTRIBUTE_VALUE = 2;
  public static final AttributeErrorCategory MISSING_ATTRIBUTE_VALUE = new AttributeErrorCategory(_MISSING_ATTRIBUTE_VALUE);
  public static final int _INVALID_MODIFY_OPERATOR = 3;
  public static final AttributeErrorCategory INVALID_MODIFY_OPERATOR = new AttributeErrorCategory(_INVALID_MODIFY_OPERATOR);
  public static final int _MODIFY_NOT_ALLOWED = 4;
  public static final AttributeErrorCategory MODIFY_NOT_ALLOWED = new AttributeErrorCategory(_MODIFY_NOT_ALLOWED);
  public static final int _MODIFY_FAILED = 5;
  public static final AttributeErrorCategory MODIFY_FAILED = new AttributeErrorCategory(_MODIFY_FAILED);

  public int value ()
  {
    return __value;
  }

  public static AttributeErrorCategory from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected AttributeErrorCategory (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class AttributeErrorCategory
