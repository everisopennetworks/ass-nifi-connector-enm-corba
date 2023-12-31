package org.omg.AlarmIRPSystem;


/**
* org.omg.AlarmIRPSystem/_AlarmIRPStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPSystem.idl
* jueves 5 de septiembre de 2019 01:52:14 AM CDT
*/

public class _AlarmIRPStub extends org.omg.CORBA.portable.ObjectImpl implements AlarmIRP
{


  /*
      Return the list of all supported Alarm IRP versions.
      Implementations are to provide a return value consisting of one or more
      IRPVersions.
      Each IRPVersion is defined by the rule in the clause titled
      "IRP document version number string"
      */
  public String[] get_alarm_IRP_versions () throws GetAlarmIRPVersions
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_alarm_IRP_versions", true);
                $in = _invoke ($out);
                String $result[] = org.omg.ManagedGenericIRPConstDefs.VersionNumberSetHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/GetAlarmIRPVersions:1.0"))
                    throw GetAlarmIRPVersionsHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_alarm_IRP_versions (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_alarm_IRP_versions


  /*
      Return the list of all supported operations and their supported
      parameters for a specific Alarm IRP version.
      */
  public org.omg.ManagedGenericIRPConstDefs.Method[] get_alarm_IRP_operations_profile (String alarm_irp_version) throws GetAlarmIRPOperationsProfile, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_alarm_IRP_operations_profile", true);
                org.omg.ManagedGenericIRPConstDefs.VersionNumberHelper.write ($out, alarm_irp_version);
                $in = _invoke ($out);
                org.omg.ManagedGenericIRPConstDefs.Method $result[] = org.omg.ManagedGenericIRPConstDefs.MethodListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/GetAlarmIRPOperationsProfile:1.0"))
                    throw GetAlarmIRPOperationsProfileHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_alarm_IRP_operations_profile (alarm_irp_version        );
            } finally {
                _releaseReply ($in);
            }
  } // get_alarm_IRP_operations_profile


  /*
      Return the list of all supported notifications and their supported
      parameters for a specific Alarm IRP version.
      */
  public org.omg.ManagedGenericIRPConstDefs.Method[] get_alarm_IRP_notification_profile (String alarm_irp_version) throws GetAlarmIRPNotificationProfile, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_alarm_IRP_notification_profile", true);
                org.omg.ManagedGenericIRPConstDefs.VersionNumberHelper.write ($out, alarm_irp_version);
                $in = _invoke ($out);
                org.omg.ManagedGenericIRPConstDefs.Method $result[] = org.omg.ManagedGenericIRPConstDefs.MethodListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/GetAlarmIRPNotificationProfile:1.0"))
                    throw GetAlarmIRPNotificationProfileHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_alarm_IRP_notification_profile (alarm_irp_version        );
            } finally {
                _releaseReply ($in);
            }
  } // get_alarm_IRP_notification_profile


  /*
      Request to acknowledge one or more alarms.
      */
  public org.omg.ManagedGenericIRPConstDefs.Signal acknowledge_alarms (org.omg.AlarmIRPConstDefs.AlarmInformationIdAndSev[] alarm_information_id_and_sev_list, String ack_user_id, org.omg.ManagedGenericIRPConstDefs.StringTypeOpt ack_system_id, org.omg.AlarmIRPConstDefs.BadAcknowledgeAlarmInfoSeqHolder bad_ack_alarm_info_list) throws AcknowledgeAlarms, org.omg.ManagedGenericIRPSystem.ParameterNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("acknowledge_alarms", true);
                org.omg.AlarmIRPConstDefs.AlarmInformationIdAndSevSeqHelper.write ($out, alarm_information_id_and_sev_list);
                $out.write_string (ack_user_id);
                org.omg.ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, ack_system_id);
                $in = _invoke ($out);
                org.omg.ManagedGenericIRPConstDefs.Signal $result = org.omg.ManagedGenericIRPConstDefs.SignalHelper.read ($in);
                bad_ack_alarm_info_list.value = org.omg.AlarmIRPConstDefs.BadAcknowledgeAlarmInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/AcknowledgeAlarms:1.0"))
                    throw AcknowledgeAlarmsHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return acknowledge_alarms (alarm_information_id_and_sev_list, ack_user_id, ack_system_id, bad_ack_alarm_info_list        );
            } finally {
                _releaseReply ($in);
            }
  } // acknowledge_alarms


  /*
      Request to remove acknowledgement information of one or more alarms.
      */
  public org.omg.ManagedGenericIRPConstDefs.Signal unacknowledge_alarms (String[] alarm_information_id_list, String ack_user_id, org.omg.ManagedGenericIRPConstDefs.StringTypeOpt ack_system_id, org.omg.AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder bad_alarm_information_id_list) throws UnacknowledgeAlarms, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.ParameterNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("unacknowledge_alarms", true);
                org.omg.AlarmIRPConstDefs.AlarmInformationIdSeqHelper.write ($out, alarm_information_id_list);
                $out.write_string (ack_user_id);
                org.omg.ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, ack_system_id);
                $in = _invoke ($out);
                org.omg.ManagedGenericIRPConstDefs.Signal $result = org.omg.ManagedGenericIRPConstDefs.SignalHelper.read ($in);
                bad_alarm_information_id_list.value = org.omg.AlarmIRPConstDefs.BadAlarmInformationIdSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/UnacknowledgeAlarms:1.0"))
                    throw UnacknowledgeAlarmsHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return unacknowledge_alarms (alarm_information_id_list, ack_user_id, ack_system_id, bad_alarm_information_id_list        );
            } finally {
                _releaseReply ($in);
            }
  } // unacknowledge_alarms


  /*
      Make comment to one or more alarms.
      */
  public org.omg.ManagedGenericIRPConstDefs.Signal comment_alarms (String[] alarm_information_id_list, String comment_user_id, org.omg.ManagedGenericIRPConstDefs.StringTypeOpt comment_system_id, String comment_text, org.omg.AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder bad_alarm_information_id_list) throws CommentAlarms, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.ParameterNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("comment_alarms", true);
                org.omg.AlarmIRPConstDefs.AlarmInformationIdSeqHelper.write ($out, alarm_information_id_list);
                $out.write_string (comment_user_id);
                org.omg.ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, comment_system_id);
                $out.write_string (comment_text);
                $in = _invoke ($out);
                org.omg.ManagedGenericIRPConstDefs.Signal $result = org.omg.ManagedGenericIRPConstDefs.SignalHelper.read ($in);
                bad_alarm_information_id_list.value = org.omg.AlarmIRPConstDefs.BadAlarmInformationIdSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/CommentAlarms:1.0"))
                    throw CommentAlarmsHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return comment_alarms (alarm_information_id_list, comment_user_id, comment_system_id, comment_text, bad_alarm_information_id_list        );
            } finally {
                _releaseReply ($in);
            }
  } // comment_alarms


  /*
      Request to clear one or more alarms.
      */
  public org.omg.ManagedGenericIRPConstDefs.Signal clear_alarms (String[] alarm_information_id_list, String clear_user_id, org.omg.ManagedGenericIRPConstDefs.StringTypeOpt clear_system_id, org.omg.AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder bad_alarm_information_id_list) throws ClearAlarms, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.ParameterNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("clear_alarms", true);
                org.omg.AlarmIRPConstDefs.AlarmInformationIdSeqHelper.write ($out, alarm_information_id_list);
                $out.write_string (clear_user_id);
                org.omg.ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, clear_system_id);
                $in = _invoke ($out);
                org.omg.ManagedGenericIRPConstDefs.Signal $result = org.omg.ManagedGenericIRPConstDefs.SignalHelper.read ($in);
                bad_alarm_information_id_list.value = org.omg.AlarmIRPConstDefs.BadAlarmInformationIdSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/ClearAlarms:1.0"))
                    throw ClearAlarmsHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return clear_alarms (alarm_information_id_list, clear_user_id, clear_system_id, bad_alarm_information_id_list        );
            } finally {
                _releaseReply ($in);
            }
  } // clear_alarms


  /*
      This method returns Alarm Informations.
      If flag is TRUE, all returned Alarm Informations shall be
      in AlarmInformationSeq that contains 0 or more Alarm Informations.
      Output parameter iter shall be useless.
      If flag is FALSE, no Alarm Informations shall be in AlarmInformationSeq.
      IRPAgent needs to use iter to retrieve them.
      org.omg.ManagedGenericIRPConstDefs.StringTypeOpt
      */
  public org.omg.CosNotification.StructuredEvent[] get_alarm_list (String filter, org.omg.CORBA.BooleanHolder flag, AlarmInformationIteratorHolder iter) throws GetAlarmList, org.omg.ManagedGenericIRPSystem.ParameterNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_alarm_list", true);
                //org.omg.ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, filter);
                $out.write_string(filter);
                $out.write_boolean(flag.value);
                //$out.write_Object(iter);
                $in = _invoke ($out);
                org.omg.CosNotification.StructuredEvent $result[] = org.omg.AlarmIRPConstDefs.AlarmInformationSeqHelper.read ($in);
                flag.value = $in.read_boolean ();
                iter.value = AlarmInformationIteratorHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/GetAlarmList:1.0"))
                    throw GetAlarmListHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_alarm_list (filter, flag, iter);
            } finally {
                _releaseReply ($in);
            }
  } // get_alarm_list


  /*
      This method returns the count of Alarm Informations.
      */
  public void get_alarm_count (org.omg.ManagedGenericIRPConstDefs.StringTypeOpt filter, org.omg.CORBA.IntHolder critical_count, org.omg.CORBA.IntHolder major_count, org.omg.CORBA.IntHolder minor_count, org.omg.CORBA.IntHolder warning_count, org.omg.CORBA.IntHolder indeterminate_count, org.omg.CORBA.IntHolder cleared_count) throws GetAlarmCount, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.ParameterNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_alarm_count", true);
                org.omg.ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, filter);
                $in = _invoke ($out);
                critical_count.value = $in.read_ulong ();
                major_count.value = $in.read_ulong ();
                minor_count.value = $in.read_ulong ();
                warning_count.value = $in.read_ulong ();
                indeterminate_count.value = $in.read_ulong ();
                cleared_count.value = $in.read_ulong ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/GetAlarmCount:1.0"))
                    throw GetAlarmCountHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                get_alarm_count (filter, critical_count, major_count, minor_count, warning_count, indeterminate_count, cleared_count        );
            } finally {
                _releaseReply ($in);
            }
  } // get_alarm_count

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/AlarmIRPSystem/AlarmIRP:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _AlarmIRPStub
