package org.omg.CosNotifyComm;


/**
* org.omg.CosNotifyComm/StructuredPushSupplierPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyComm.idl
* jueves 5 de septiembre de 2019 02:16:25 AM CDT
*/


// StructuredPullSupplier
public abstract class StructuredPushSupplierPOA extends org.omg.PortableServer.Servant
 implements StructuredPushSupplierOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("disconnect_structured_push_supplier", new Integer (0));
    _methods.put ("subscription_change", new Integer (1));
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
       case 0:  // org.omg.CosNotifyComm/StructuredPushSupplier/disconnect_structured_push_supplier
       {
         this.disconnect_structured_push_supplier ();
         out = $rh.createReply();
         break;
       }

       case 1:  // org.omg.CosNotifyComm/NotifySubscribe/subscription_change
       {
         try {
           org.omg.CosNotification._EventType added[] = org.omg.CosNotification.EventTypeSeqHelper.read (in);
           org.omg.CosNotification._EventType removed[] = org.omg.CosNotification.EventTypeSeqHelper.read (in);
           this.subscription_change (added, removed);
           out = $rh.createReply();
         } catch (InvalidEventType $ex) {
           out = $rh.createExceptionReply ();
           InvalidEventTypeHelper.write (out, $ex);
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
    "IDL:omg.org/CosNotifyComm/StructuredPushSupplier:1.0",
    "IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public StructuredPushSupplier _this() 
  {
    return StructuredPushSupplierHelper.narrow(
    super._this_object());
  }

  public StructuredPushSupplier _this(org.omg.CORBA.ORB orb) 
  {
    return StructuredPushSupplierHelper.narrow(
    super._this_object(orb));
  }


} // class StructuredPushSupplierPOA