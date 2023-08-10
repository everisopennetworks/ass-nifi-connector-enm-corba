package org.omg.CosNotifyComm;


/**
* org.omg.CosNotifyComm/SequencePullSupplierPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyComm.idl
* jueves 5 de septiembre de 2019 02:16:25 AM CDT
*/


// SequencePullConsumer
public abstract class SequencePullSupplierPOA extends org.omg.PortableServer.Servant
 implements SequencePullSupplierOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("pull_structured_events", new Integer (0));
    _methods.put ("try_pull_structured_events", new Integer (1));
    _methods.put ("disconnect_sequence_pull_supplier", new Integer (2));
    _methods.put ("subscription_change", new Integer (3));
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
       case 0:  // org.omg.CosNotifyComm/SequencePullSupplier/pull_structured_events
       {
         try {
           int max_number = in.read_long ();
           org.omg.CosNotification.StructuredEvent $result[] = null;
           $result = this.pull_structured_events (max_number);
           out = $rh.createReply();
           org.omg.CosNotification.EventBatchHelper.write (out, $result);
         } catch (org.omg.CosEventComm.Disconnected $ex) {
           out = $rh.createExceptionReply ();
           org.omg.CosEventComm.DisconnectedHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // org.omg.CosNotifyComm/SequencePullSupplier/try_pull_structured_events
       {
         try {
           int max_number = in.read_long ();
           org.omg.CORBA.BooleanHolder has_event = new org.omg.CORBA.BooleanHolder ();
           org.omg.CosNotification.StructuredEvent $result[] = null;
           $result = this.try_pull_structured_events (max_number, has_event);
           out = $rh.createReply();
           org.omg.CosNotification.EventBatchHelper.write (out, $result);
           out.write_boolean (has_event.value);
         } catch (org.omg.CosEventComm.Disconnected $ex) {
           out = $rh.createExceptionReply ();
           org.omg.CosEventComm.DisconnectedHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // org.omg.CosNotifyComm/SequencePullSupplier/disconnect_sequence_pull_supplier
       {
         this.disconnect_sequence_pull_supplier ();
         out = $rh.createReply();
         break;
       }

       case 3:  // org.omg.CosNotifyComm/NotifySubscribe/subscription_change
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
    "IDL:omg.org/CosNotifyComm/SequencePullSupplier:1.0",
    "IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public SequencePullSupplier _this() 
  {
    return SequencePullSupplierHelper.narrow(
    super._this_object());
  }

  public SequencePullSupplier _this(org.omg.CORBA.ORB orb) 
  {
    return SequencePullSupplierHelper.narrow(
    super._this_object(orb));
  }


} // class SequencePullSupplierPOA