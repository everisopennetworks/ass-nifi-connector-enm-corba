package org.omg.AlarmIRPNotifications;


/**
* org.omg.AlarmIRPNotifications/NotifyComments.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPNotifications.idl
* jueves 5 de septiembre de 2019 01:10:29 AM CDT
*/

public interface NotifyComments extends NotifyCommentsOperations, org.omg.NotificationIRPNotifications.Notify, org.omg.CORBA.portable.IDLEntity
{
  public static final String EVENT_TYPE = "notifyComments";
  public static final String PROBABLE_CAUSE = org.omg.AlarmIRPConstDefs.AttributeNameValue.PROBABLE_CAUSE;
  public static final String PERCEIVED_SEVERITY = org.omg.AlarmIRPConstDefs.AttributeNameValue.PERCEIVED_SEVERITY;
  public static final String ALARM_ID = org.omg.AlarmIRPConstDefs.AttributeNameValue.ALARM_ID;

  /**
       * This constant defines the name of the comments property. 
       * The data type for the value of this property
       * is org.omg.AlarmIRPConstDefs::CommentSet.
       */
  public static final String COMMENTS = org.omg.AlarmIRPConstDefs.AttributeNameValue.COMMENTS;
} // interface NotifyComments
