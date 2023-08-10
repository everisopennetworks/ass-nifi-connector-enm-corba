package org.omg.CosNotifyChannelAdmin;


/**
* org.omg.CosNotifyChannelAdmin/StructuredProxyPushConsumerPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:15 AM CDT
*/


// ProxyPushConsumer
public abstract class StructuredProxyPushConsumerPOA extends org.omg.PortableServer.Servant
 implements StructuredProxyPushConsumerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("connect_structured_push_supplier", new Integer (0));
    _methods.put ("_get_MyType", new Integer (1));
    _methods.put ("_get_MyAdmin", new Integer (2));
    _methods.put ("obtain_subscription_types", new Integer (3));
    _methods.put ("validate_event_qos", new Integer (4));
    _methods.put ("get_qos", new Integer (5));
    _methods.put ("set_qos", new Integer (6));
    _methods.put ("validate_qos", new Integer (7));
    _methods.put ("add_filter", new Integer (8));
    _methods.put ("remove_filter", new Integer (9));
    _methods.put ("get_filter", new Integer (10));
    _methods.put ("get_all_filters", new Integer (11));
    _methods.put ("remove_all_filters", new Integer (12));
    _methods.put ("push_structured_event", new Integer (13));
    _methods.put ("disconnect_structured_push_consumer", new Integer (14));
    _methods.put ("offer_change", new Integer (15));
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
       case 0:  // org.omg.CosNotifyChannelAdmin/StructuredProxyPushConsumer/connect_structured_push_supplier
       {
         try {
           org.omg.CosNotifyComm.StructuredPushSupplier push_supplier = org.omg.CosNotifyComm.StructuredPushSupplierHelper.read (in);
           this.connect_structured_push_supplier (push_supplier);
           out = $rh.createReply();
         } catch (org.omg.CosEventChannelAdmin.AlreadyConnected $ex) {
           out = $rh.createExceptionReply ();
           org.omg.CosEventChannelAdmin.AlreadyConnectedHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // org.omg.CosNotifyChannelAdmin/ProxyConsumer/_get_MyType
       {
         ProxyType $result = null;
         $result = this.MyType ();
         out = $rh.createReply();
         ProxyTypeHelper.write (out, $result);
         break;
       }

       case 2:  // org.omg.CosNotifyChannelAdmin/ProxyConsumer/_get_MyAdmin
       {
         SupplierAdmin $result = null;
         $result = this.MyAdmin ();
         out = $rh.createReply();
         SupplierAdminHelper.write (out, $result);
         break;
       }

       case 3:  // org.omg.CosNotifyChannelAdmin/ProxyConsumer/obtain_subscription_types
       {
         ObtainInfoMode mode = ObtainInfoModeHelper.read (in);
         org.omg.CosNotification._EventType $result[] = null;
         $result = this.obtain_subscription_types (mode);
         out = $rh.createReply();
         org.omg.CosNotification.EventTypeSeqHelper.write (out, $result);
         break;
       }

       case 4:  // org.omg.CosNotifyChannelAdmin/ProxyConsumer/validate_event_qos
       {
         try {
           org.omg.CosNotification.Property required_qos[] = org.omg.CosNotification.QoSPropertiesHelper.read (in);
           org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos = new org.omg.CosNotification.NamedPropertyRangeSeqHolder ();
           this.validate_event_qos (required_qos, available_qos);
           out = $rh.createReply();
           org.omg.CosNotification.NamedPropertyRangeSeqHelper.write (out, available_qos.value);
         } catch (org.omg.CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           org.omg.CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }

       case 5:  // org.omg.CosNotification/QoSAdmin/get_qos
       {
         org.omg.CosNotification.Property $result[] = null;
         $result = this.get_qos ();
         out = $rh.createReply();
         org.omg.CosNotification.PropertySeqHelper.write (out, $result);
         break;
       }

       case 6:  // org.omg.CosNotification/QoSAdmin/set_qos
       {
         try {
           org.omg.CosNotification.Property qos[] = org.omg.CosNotification.QoSPropertiesHelper.read (in);
           this.set_qos (qos);
           out = $rh.createReply();
         } catch (org.omg.CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           org.omg.CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }

       case 7:  // org.omg.CosNotification/QoSAdmin/validate_qos
       {
         try {
           org.omg.CosNotification.Property required_qos[] = org.omg.CosNotification.QoSPropertiesHelper.read (in);
           org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos = new org.omg.CosNotification.NamedPropertyRangeSeqHolder ();
           this.validate_qos (required_qos, available_qos);
           out = $rh.createReply();
           org.omg.CosNotification.NamedPropertyRangeSeqHelper.write (out, available_qos.value);
         } catch (org.omg.CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           org.omg.CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }

       case 8:  // org.omg.CosNotifyFilter/FilterAdmin/add_filter
       {
         org.omg.CosNotifyFilter.Filter new_filter = org.omg.CosNotifyFilter.FilterHelper.read (in);
         int $result = (int)0;
         $result = this.add_filter (new_filter);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 9:  // org.omg.CosNotifyFilter/FilterAdmin/remove_filter
       {
         try {
           int filter = org.omg.CosNotifyFilter.FilterIDHelper.read (in);
           this.remove_filter (filter);
           out = $rh.createReply();
         } catch (org.omg.CosNotifyFilter.FilterNotFound $ex) {
           out = $rh.createExceptionReply ();
           org.omg.CosNotifyFilter.FilterNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 10:  // org.omg.CosNotifyFilter/FilterAdmin/get_filter
       {
         try {
           int filter = org.omg.CosNotifyFilter.FilterIDHelper.read (in);
           org.omg.CosNotifyFilter.Filter $result = null;
           $result = this.get_filter (filter);
           out = $rh.createReply();
           org.omg.CosNotifyFilter.FilterHelper.write (out, $result);
         } catch (org.omg.CosNotifyFilter.FilterNotFound $ex) {
           out = $rh.createExceptionReply ();
           org.omg.CosNotifyFilter.FilterNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 11:  // org.omg.CosNotifyFilter/FilterAdmin/get_all_filters
       {
         int $result[] = null;
         $result = this.get_all_filters ();
         out = $rh.createReply();
         org.omg.CosNotifyFilter.FilterIDSeqHelper.write (out, $result);
         break;
       }

       case 12:  // org.omg.CosNotifyFilter/FilterAdmin/remove_all_filters
       {
         this.remove_all_filters ();
         out = $rh.createReply();
         break;
       }

       case 13:  // org.omg.CosNotifyComm/StructuredPushConsumer/push_structured_event
       {
         try {
           org.omg.CosNotification.StructuredEvent notification = org.omg.CosNotification.StructuredEventHelper.read (in);
           this.push_structured_event (notification);
           out = $rh.createReply();
         } catch (org.omg.CosEventComm.Disconnected $ex) {
           out = $rh.createExceptionReply ();
           org.omg.CosEventComm.DisconnectedHelper.write (out, $ex);
         }
         break;
       }

       case 14:  // org.omg.CosNotifyComm/StructuredPushConsumer/disconnect_structured_push_consumer
       {
         this.disconnect_structured_push_consumer ();
         out = $rh.createReply();
         break;
       }

       case 15:  // org.omg.CosNotifyComm/NotifyPublish/offer_change
       {
         try {
           org.omg.CosNotification._EventType added[] = org.omg.CosNotification.EventTypeSeqHelper.read (in);
           org.omg.CosNotification._EventType removed[] = org.omg.CosNotification.EventTypeSeqHelper.read (in);
           this.offer_change (added, removed);
           out = $rh.createReply();
         } catch (org.omg.CosNotifyComm.InvalidEventType $ex) {
           out = $rh.createExceptionReply ();
           org.omg.CosNotifyComm.InvalidEventTypeHelper.write (out, $ex);
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
    "IDL:omg.org/CosNotifyChannelAdmin/StructuredProxyPushConsumer:1.0",
    "IDL:omg.org/CosNotifyChannelAdmin/ProxyConsumer:1.0",
    "IDL:omg.org/CosNotification/QoSAdmin:1.0",
    "IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0",
    "IDL:omg.org/CosNotifyComm/StructuredPushConsumer:1.0",
    "IDL:omg.org/CosNotifyComm/NotifyPublish:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public StructuredProxyPushConsumer _this() 
  {
    return StructuredProxyPushConsumerHelper.narrow(
    super._this_object());
  }

  public StructuredProxyPushConsumer _this(org.omg.CORBA.ORB orb) 
  {
    return StructuredProxyPushConsumerHelper.narrow(
    super._this_object(orb));
  }


} // class StructuredProxyPushConsumerPOA
