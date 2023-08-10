package org.omg.CosEventChannelAdmin;


/**
* org.omg.CosEventChannelAdmin/ProxyPullConsumerPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosEventChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:15:22 AM CDT
*/

public abstract class ProxyPullConsumerPOA extends org.omg.PortableServer.Servant
 implements ProxyPullConsumerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("connect_pull_supplier", new Integer (0));
    _methods.put ("disconnect_pull_consumer", new Integer (1));
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
       case 0:  // org.omg.CosEventChannelAdmin/ProxyPullConsumer/connect_pull_supplier
       {
         try {
           org.omg.CosEventComm.PullSupplier pull_supplier = org.omg.CosEventComm.PullSupplierHelper.read (in);
           this.connect_pull_supplier (pull_supplier);
           out = $rh.createReply();
         } catch (AlreadyConnected $ex) {
           out = $rh.createExceptionReply ();
           AlreadyConnectedHelper.write (out, $ex);
         } catch (TypeError $ex) {
           out = $rh.createExceptionReply ();
           TypeErrorHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // org.omg.CosEventComm/PullConsumer/disconnect_pull_consumer
       {
         this.disconnect_pull_consumer ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosEventChannelAdmin/ProxyPullConsumer:1.0",
    "IDL:omg.org/CosEventComm/PullConsumer:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ProxyPullConsumer _this() 
  {
    return ProxyPullConsumerHelper.narrow(
    super._this_object());
  }

  public ProxyPullConsumer _this(org.omg.CORBA.ORB orb) 
  {
    return ProxyPullConsumerHelper.narrow(
    super._this_object(orb));
  }


} // class ProxyPullConsumerPOA