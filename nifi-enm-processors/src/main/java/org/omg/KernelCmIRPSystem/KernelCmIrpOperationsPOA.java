package org.omg.KernelCmIRPSystem;


/**
* org.omg.KernelCmIRPSystem/KernelCmIrpOperationsPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmIRPSystem.idl
* jueves 5 de septiembre de 2019 02:19:42 AM CDT
*/


/**
     * The KernelCmIrpOperations interface.
     * Supports a number of Resource Model versions.
     */
public abstract class KernelCmIrpOperationsPOA extends org.omg.PortableServer.Servant
 implements KernelCmIrpOperationsOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("get_kernel_CM_IRP_versions", new Integer (0));
    _methods.put ("get_NRM_IRP_version", new Integer (1));
    _methods.put ("get_kernel_CM_IRP_operation_profile", new Integer (2));
    _methods.put ("get_kernel_CM_IRP_notification_profile", new Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    Integer __method = (Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /*
      Return the list of all supported Kernel CM IRP versions.
      */
       case 0:  // org.omg.KernelCmIRPSystem/KernelCmIrpOperations/get_kernel_CM_IRP_versions
       {
         try {
           String $result[] = null;
           $result = this.get_kernel_CM_IRP_versions ();
           out = $rh.createReply();
           org.omg.ManagedGenericIRPConstDefs.VersionNumberSetHelper.write (out, $result);
         } catch (GetKernelCMIRPVersionsException $ex) {
           out = $rh.createExceptionReply ();
           GetKernelCMIRPVersionsExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
      * Get the version(s) of the interface 
      *
      * @raises GetNRMIRPVersion when the system for some reason 
      *   can not return the supported versions. 
      * @returns all supported versions.
      */
       case 1:  // org.omg.KernelCmIRPSystem/KernelCmIrpOperations/get_NRM_IRP_version
       {
         try {
           org.omg.ManagedGenericIRPConstDefs.VersionNumberSetHolder versionNumberList = new org.omg.ManagedGenericIRPConstDefs.VersionNumberSetHolder ();
           org.omg.ManagedGenericIRPConstDefs.VersionNumberSetHolder vSEVersionNumberList = new org.omg.ManagedGenericIRPConstDefs.VersionNumberSetHolder ();
           this.get_NRM_IRP_version (versionNumberList, vSEVersionNumberList);
           out = $rh.createReply();
           org.omg.ManagedGenericIRPConstDefs.VersionNumberSetHelper.write (out, versionNumberList.value);
           org.omg.ManagedGenericIRPConstDefs.VersionNumberSetHelper.write (out, vSEVersionNumberList.value);
         } catch (GetNRMIRPVersion $ex) {
           out = $rh.createExceptionReply ();
           GetNRMIRPVersionHelper.write (out, $ex);
         }
         break;
       }


  /*
      Return the list of all supported operations and their supported
      parameters for a specific KernelCM IRP version.
      */
       case 2:  // org.omg.KernelCmIRPSystem/KernelCmIrpOperations/get_kernel_CM_IRP_operation_profile
       {
         try {
           String kernel_CM_IRP_version = org.omg.ManagedGenericIRPConstDefs.VersionNumberHelper.read (in);
           org.omg.ManagedGenericIRPConstDefs.Method $result[] = null;
           $result = this.get_kernel_CM_IRP_operation_profile (kernel_CM_IRP_version);
           out = $rh.createReply();
           org.omg.ManagedGenericIRPConstDefs.MethodListHelper.write (out, $result);
         } catch (GetKernelCMIRPOperationProfileException $ex) {
           out = $rh.createExceptionReply ();
           GetKernelCMIRPOperationProfileExceptionHelper.write (out, $ex);
         } catch (org.omg.ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (org.omg.ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }


  /*
      Return the list of all supported notifications and their supported
      parameters for a specific KernelCM IRP version.
      */
       case 3:  // org.omg.KernelCmIRPSystem/KernelCmIrpOperations/get_kernel_CM_IRP_notification_profile
       {
         try {
           String kernel_CM_IRP_version = org.omg.ManagedGenericIRPConstDefs.VersionNumberHelper.read (in);
           org.omg.ManagedGenericIRPConstDefs.Method $result[] = null;
           $result = this.get_kernel_CM_IRP_notification_profile (kernel_CM_IRP_version);
           out = $rh.createReply();
           org.omg.ManagedGenericIRPConstDefs.MethodListHelper.write (out, $result);
         } catch (GetKernelCMIRPNotificationProfileException $ex) {
           out = $rh.createExceptionReply ();
           GetKernelCMIRPNotificationProfileExceptionHelper.write (out, $ex);
         } catch (org.omg.ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (org.omg.ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/KernelCmIRPSystem/KernelCmIrpOperations:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public KernelCmIrpOperations _this() 
  {
    return KernelCmIrpOperationsHelper.narrow(
    super._this_object());
  }

  public KernelCmIrpOperations _this(org.omg.CORBA.ORB orb) 
  {
    return KernelCmIrpOperationsHelper.narrow(
    super._this_object(orb));
  }


} // class KernelCmIrpOperationsPOA