package org.omg.AlarmIRPNotifications;


/**
* org.omg.AlarmIRPNotifications/NotifyNewAlarm.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPNotifications.idl
* jueves 5 de septiembre de 2019 01:10:29 AM CDT
*/

public interface NotifyNewAlarm extends NotifyNewAlarmOperations, org.omg.NotificationIRPNotifications.Notify, org.omg.CORBA.portable.IDLEntity
{
  public static final String EVENT_TYPE = "notifyNewAlarm";

  /**
       * This constant defines the name of the probableCause property. 
       * The data type for the value of this property
       * is short.
       */
  public static final String PROBABLE_CAUSE = org.omg.AlarmIRPConstDefs.AttributeNameValue.PROBABLE_CAUSE;

  /**
       * This constant defines the name of the 
       * perceivedSeverity property.
       * The data type for the value of this property
       * is short.
       */
  public static final String PERCEIVED_SEVERITY = org.omg.AlarmIRPConstDefs.AttributeNameValue.PERCEIVED_SEVERITY;

  /**
       * This constant defines the name of the specificProblem
       * property.  The data type for the value of this property
       * is string.
       */
  public static final String VENDOR_SPECIFIC_ALARM_TYPE = org.omg.AlarmIRPConstDefs.AttributeNameValue.VENDOR_SPECIFIC_ALARM_TYPE;

  /**
This constant identifies the NE alarm type or NE related alarm type.
The data type for the value of this property is string.
       */
  public static final String SPECIFIC_PROBLEM = org.omg.AlarmIRPConstDefs.AttributeNameValue.SPECIFIC_PROBLEM;

  /**
       * This constant defines the name of the 
       * correlatedNotifications property.
       * The data type for the value of this property
       * is org.omg.AlarmIRPConstDefs::CorrelatedNotificationSetType.
       */
  public static final String CORRELATED_NOTIFICATIONS = org.omg.AlarmIRPConstDefs.AttributeNameValue.CORRELATED_NOTIFICATIONS;

  /**
       * This constant defines the name of the 
       * backedUpStatus property.
       * The data type for the value of this property
       * is org.omg.AlarmIRPConstDefs::BackedUpStatusType.
       */
  public static final String BACKED_UP_STATUS = org.omg.AlarmIRPConstDefs.AttributeNameValue.BACKED_UP_STATUS;

  /**
       * This constant defines the name of the backUpObject property.
       * The data type for the value of this property
       * is a string carrying of DN of the back-up object.
       */
  public static final String BACK_UP_OBJECT = org.omg.AlarmIRPConstDefs.AttributeNameValue.BACK_UP_OBJECT;

  /**
       * This constant defines the name of the 
       * trendIndication property. 
       * The data type for the value of this property
       * is org.omg.AlarmIRPConstDefs::TrendIndicationType.
       */
  public static final String TREND_INDICATION = org.omg.AlarmIRPConstDefs.AttributeNameValue.TREND_INDICATION;

  /**
       * This constant defines the name of the thresholdInfo property.
       * The data type for the value of this property
       * is org.omg.AlarmIRPConstDefs::ThresholdInfoType.
       */
  public static final String THRESHOLD_INFO = org.omg.AlarmIRPConstDefs.AttributeNameValue.THRESHOLD_INFO;

  /**
       * This constant defines the name of the 
       * stateChangeDefinition property.
       * The data type for the value of this property
       * is org.omg.AlarmIRPConstDefs::AttributeChangeSetType.
       */
  public static final String STATE_CHANGE_DEFINITION = org.omg.AlarmIRPConstDefs.AttributeNameValue.STATE_CHANGE_DEFINITION;

  /**
       * This constant defines the name of the 
       * monitoredAttributes property.
       * The data type for the value of this property
       * is org.omg.AlarmIRPConstDefs::AttributeSetType.
       */
  public static final String MONITORED_ATTRIBUTES = org.omg.AlarmIRPConstDefs.AttributeNameValue.MONITORED_ATTRIBUTES;

  /**
       * This constant defines the name of the 
       * proposedRepairActions property.
       * The data type for the value of this property
       * is string.
       */
  public static final String PROPOSED_REPAIR_ACTIONS = org.omg.AlarmIRPConstDefs.AttributeNameValue.PROPOSED_REPAIR_ACTIONS;

  /**
       * This constant defines the name of the additiionalText
       * property.
       * The data type for the value of this property
       * is string.
       */
  public static final String ADDITIONAL_TEXT = org.omg.AlarmIRPConstDefs.AttributeNameValue.ADDITIONAL_TEXT;

  /**
       * This constant defines the name of the alarmId property.
       * The data type for the value of this property
       * is string.  If the string is a zero-length string or if 
       * this NV pair is absent, the default semantics is that 
       * alarmId is a concatenation of 
       * managedObjectInstance, eventType, probableCause and
       * specificProblem, if present, of this Structured Event. 
       * Since probableCause is encoded as a short, it shall be
       * converted into string before concatenation. 
       * The resultant string shall not contain spaces.
       */
  public static final String ALARM_ID = org.omg.AlarmIRPConstDefs.AttributeNameValue.ALARM_ID;

  /**
       * This constant defines the name of the serviceUser property.
       * The data type for the value of this property
       * is string.
       */
  public static final String SERVICE_USER = org.omg.AlarmIRPConstDefs.AttributeNameValue.SERVICE_USER;

  /**
       * This constant defines the name of the serviceProvider
       * property. 
       * The data type for the value of this property
       * is string.
       */
  public static final String SERVICE_PROVIDER = org.omg.AlarmIRPConstDefs.AttributeNameValue.SERVICE_PROVIDER;

  /**
       * This constant defines the name of the 
       * securityAlarmDetector property. 
       * The data type for the value of this property
       * is string.
       */
  public static final String SECURITY_ALARM_DETECTOR = org.omg.AlarmIRPConstDefs.AttributeNameValue.SECURITY_ALARM_DETECTOR;
} // interface NotifyNewAlarm
