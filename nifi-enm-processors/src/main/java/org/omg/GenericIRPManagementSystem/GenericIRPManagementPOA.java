package org.omg.GenericIRPManagementSystem;


/**
* org.omg.GenericIRPManagementSystem/GenericIRPManagementPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementSystem.idl
* jueves 5 de septiembre de 2019 02:18:50 AM CDT
*/

public abstract class GenericIRPManagementPOA extends org.omg.PortableServer.Servant
 implements GenericIRPManagementOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("get_irp_versions", new Integer (0));
    _methods.put ("get_interface_irp_operation_profile", new Integer (1));
    _methods.put ("get_interface_irp_notification_profile", new Integer (2));
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
      Return the list of all supported Interface IRP versions
      Each IRPVersion is defined by the rule in the definition
      "IRP document version number string" or "IRPVersion"
      (see subclause 3.1).
      */
       case 0:  // org.omg.GenericIRPManagementSystem/GenericIRPManagement/get_irp_versions
       {
         try {
           String $result[] = null;
           $result = this.get_irp_versions ();
           out = $rh.createReply();
           org.omg.GenericIRPManagementConstDefs.VersionNumberSetHelper.write (out, $result);
         } catch (GetIRPVersions $ex) {
           out = $rh.createExceptionReply ();
           GetIRPVersionsHelper.write (out, $ex);
         }
         break;
       }


  /*
      Return the list of all supported methods and their supported
      parameters for this Interface IRPVersion.
      */
       case 1:  // org.omg.GenericIRPManagementSystem/GenericIRPManagement/get_interface_irp_operation_profile
       {
         try {
           String this_irp_version = org.omg.GenericIRPManagementConstDefs.VersionNumberHelper.read (in);
           org.omg.GenericIRPManagementConstDefs.Method $result[] = null;
           $result = this.get_interface_irp_operation_profile (this_irp_version);
           out = $rh.createReply();
           org.omg.GenericIRPManagementConstDefs.MethodListHelper.write (out, $result);
         } catch (GetInterfaceIRPOperationProfile $ex) {
           out = $rh.createExceptionReply ();
           GetInterfaceIRPOperationProfileHelper.write (out, $ex);
         } catch (OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           OperationNotSupportedHelper.write (out, $ex);
         } catch (InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           InvalidParameterHelper.write (out, $ex);
         } catch (ValueNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ValueNotSupportedHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // org.omg.GenericIRPManagementSystem/GenericIRPManagement/get_interface_irp_notification_profile
       {
         try {
           String this_irp_version = org.omg.GenericIRPManagementConstDefs.VersionNumberHelper.read (in);
           org.omg.GenericIRPManagementConstDefs.Notification $result[] = null;
           $result = this.get_interface_irp_notification_profile (this_irp_version);
           out = $rh.createReply();
           org.omg.GenericIRPManagementConstDefs.NotificationListHelper.write (out, $result);
         } catch (GetInterfaceIRPNotificationProfile $ex) {
           out = $rh.createExceptionReply ();
           GetInterfaceIRPNotificationProfileHelper.write (out, $ex);
         } catch (OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           OperationNotSupportedHelper.write (out, $ex);
         } catch (InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           InvalidParameterHelper.write (out, $ex);
         } catch (ValueNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ValueNotSupportedHelper.write (out, $ex);
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
    "IDL:3gppsa5.org/GenericIRPManagementSystem/GenericIRPManagement:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public GenericIRPManagement _this() 
  {
    return GenericIRPManagementHelper.narrow(
    super._this_object());
  }

  public GenericIRPManagement _this(org.omg.CORBA.ORB orb) 
  {
    return GenericIRPManagementHelper.narrow(
    super._this_object(orb));
  }


} // class GenericIRPManagementPOA
