package org.omg.FileTransferIRPSystem;


import org.omg.TimeBase.UtcT;

/**
* org.omg.FileTransferIRPSystem/_FileTransferIRPStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPSystem.idl
* jueves 5 de septiembre de 2019 02:18:30 AM CDT
*/

public class _FileTransferIRPStub extends org.omg.CORBA.portable.ObjectImpl implements FileTransferIRP
{


  /*
      * IRPManager invoke this operation to get the files information
      */
  public org.omg.FileTransferIRPConstDefs.Result list_available_files (short management_data_type, UtcT begin_time, UtcT end_time, org.omg.FileTransferIRPConstDefs.FileInfoListHolder file_info_list) throws ListAvailableFiles, InvalidTimes, org.omg.ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("list_available_files", true);
                $out.write_short (management_data_type);
                org.omg.FileTransferIRPConstDefs.UTCTimeHelper.write ($out, begin_time);
                org.omg.FileTransferIRPConstDefs.UTCTimeHelper.write ($out, end_time);
                $in = _invoke ($out);
                org.omg.FileTransferIRPConstDefs.Result $result = org.omg.FileTransferIRPConstDefs.ResultHelper.read ($in);
                file_info_list.value = org.omg.FileTransferIRPConstDefs.FileInfoListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/FileTransferIRPSystem/ListAvailableFiles:1.0"))
                    throw ListAvailableFilesHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/FileTransferIRPSystem/InvalidTimes:1.0"))
                    throw InvalidTimesHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return list_available_files (management_data_type, begin_time, end_time, file_info_list        );
            } finally {
                _releaseReply ($in);
            }
  } // list_available_files


  /*
      * IRPManager invoke this operation to indicate completion of downloading files to IRPAgent
      */
  public org.omg.FileTransferIRPConstDefs.Result file_download_indication (org.omg.FileTransferIRPConstDefs.FileInfo[] file_info_list) throws FileDownloadIndication, InvalidFileInfoList, org.omg.ManagedGenericIRPSystem.OperationNotSupported
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("file_download_indication", true);
                org.omg.FileTransferIRPConstDefs.FileInfoListHelper.write ($out, file_info_list);
                $in = _invoke ($out);
                org.omg.FileTransferIRPConstDefs.Result $result = org.omg.FileTransferIRPConstDefs.ResultHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/FileTransferIRPSystem/FileDownloadIndication:1.0"))
                    throw FileDownloadIndicationHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/FileTransferIRPSystem/InvalidFileInfoList:1.0"))
                    throw InvalidFileInfoListHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return file_download_indication (file_info_list        );
            } finally {
                _releaseReply ($in);
            }
  } // file_download_indication


  /**
      * Return the list of all supported FileTransferIRP versions.
      */
  public String[] get_file_transfer_irp_versions () throws GetFileTransferIRPVersions
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_file_transfer_irp_versions", true);
                $in = _invoke ($out);
                String $result[] = org.omg.ManagedGenericIRPConstDefs.VersionNumberSetHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/FileTransferIRPSystem/GetFileTransferIRPVersions:1.0"))
                    throw GetFileTransferIRPVersionsHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_file_transfer_irp_versions (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_file_transfer_irp_versions


  /**
      * Return the list of all supported operations and their supported
      * parameters for a specific FileTransferIRP version.
      */
  public org.omg.ManagedGenericIRPConstDefs.Method[] get_file_transfer_irp_operations_profile (String irp_version) throws GetFileTransferIRPOperationsProfile, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_file_transfer_irp_operations_profile", true);
                org.omg.ManagedGenericIRPConstDefs.VersionNumberHelper.write ($out, irp_version);
                $in = _invoke ($out);
                org.omg.ManagedGenericIRPConstDefs.Method $result[] = org.omg.ManagedGenericIRPConstDefs.MethodListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/FileTransferIRPSystem/GetFileTransferIRPOperationsProfile:1.0"))
                    throw GetFileTransferIRPOperationsProfileHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_file_transfer_irp_operations_profile (irp_version        );
            } finally {
                _releaseReply ($in);
            }
  } // get_file_transfer_irp_operations_profile


  /**
      * Return the list of all supported notifications and their supported
      * parameters for a specific FileTransferIRP version.
      */
  public org.omg.ManagedGenericIRPConstDefs.Method[] get_file_transfer_irp_notifications_profile (String irp_version) throws GetFileTransferIRPNotificationsProfile, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_file_transfer_irp_notifications_profile", true);
                org.omg.ManagedGenericIRPConstDefs.VersionNumberHelper.write ($out, irp_version);
                $in = _invoke ($out);
                org.omg.ManagedGenericIRPConstDefs.Method $result[] = org.omg.ManagedGenericIRPConstDefs.MethodListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/FileTransferIRPSystem/GetFileTransferIRPNotificationsProfile:1.0"))
                    throw GetFileTransferIRPNotificationsProfileHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_file_transfer_irp_notifications_profile (irp_version        );
            } finally {
                _releaseReply ($in);
            }
  } // get_file_transfer_irp_notifications_profile

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/FileTransferIRPSystem/FileTransferIRP:1.0"};

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
} // class _FileTransferIRPStub
