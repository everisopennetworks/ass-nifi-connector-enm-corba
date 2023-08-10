package org.omg.KernelCmConstDefs;


/**
* org.omg.KernelCmConstDefs/AttributeNameValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmConstDefs.idl
* jueves 5 de septiembre de 2019 02:19:33 AM CDT
*/


/*
   This block identifies attributes which are included as part of the Kernel
   CM IRP. These attribute values should not clash with those defined for the
   attributes of notification header (see IDL of Notification IRP).
   */
public interface AttributeNameValue extends AttributeNameValueOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
  public static final String SOURCE_INDICATOR = "SOURCE";
  public static final String ADDITIONAL_TEXT = "ADD_TEXT";
  public static final String CORRELATED_NOTIFICATIONS = "CORREL_NOTIFS";
  public static final String BASE_MO_CLASS = "BASE_MOC";
  public static final String BASE_MO_INSTANCE = "BASE_MOI";
  public static final String SCOPE = "SCOPE";
} // interface AttributeNameValue
