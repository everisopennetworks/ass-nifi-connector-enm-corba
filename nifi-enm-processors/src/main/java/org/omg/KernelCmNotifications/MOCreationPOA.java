package org.omg.KernelCmNotifications;


/**
* org.omg.KernelCmNotifications/MOCreationPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmNotifications.idl
* jueves 5 de septiembre de 2019 02:20:05 AM CDT
*/


/**
       *  Constant definitions for the MO created notification
       */
public abstract class MOCreationPOA extends org.omg.PortableServer.Servant
 implements MOCreationOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    Integer __method = (Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/KernelCmNotifications/MOCreation:1.0",
    "IDL:3gppsa5.org/KernelCmNotifications/NotificationCommon:1.0",
    "IDL:3gppsa5.org/NotificationIRPNotifications/Notify:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public MOCreation _this() 
  {
    return MOCreationHelper.narrow(
    super._this_object());
  }

  public MOCreation _this(org.omg.CORBA.ORB orb) 
  {
    return MOCreationHelper.narrow(
    super._this_object(orb));
  }


} // class MOCreationPOA
