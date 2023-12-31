package org.omg.FileTransferIRPNotifications;


/**
* org.omg.FileTransferIRPNotifications/NotifyFileReady.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPNotifications.idl
* jueves 5 de septiembre de 2019 02:17:39 AM CDT
*/


/**
   * Constant definitions for the FileReady notification
   */
public interface NotifyFileReady extends NotifyFileReadyOperations, org.omg.NotificationIRPNotifications.Notify, org.omg.CORBA.portable.IDLEntity
{
  public static final String EVENT_TYPE = "notifyFileReady";

  /**
      * This constant defines the name of the fileInfoList property,
      * which is transported in the filterable_body fields.
      * The data type for the value of this property is
      * org.omg.FileTransferIRPConstDefs::FileInfoList.
      */
  public static final String FILE_INFO_LIST = org.omg.FileTransferIRPConstDefs.AttributeNameValue.FILE_INFO_LIST;

  /**
      * This constant defines the name of the additionalText property,
      * which is transported in the filterable_body fields.
      * The data type for the value of this property is string.
      */
  public static final String ADDITIONAL_TEXT = org.omg.FileTransferIRPConstDefs.AttributeNameValue.ADDITIONAL_TEXT;
} // interface NotifyFileReady
