package org.omg.CosEventChannelAdmin;


/**
* org.omg.CosEventChannelAdmin/_ProxyPushConsumerStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosEventChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:15:22 AM CDT
*/

public class _ProxyPushConsumerStub extends org.omg.CORBA.portable.ObjectImpl implements ProxyPushConsumer
{

  public void connect_push_supplier (org.omg.CosEventComm.PushSupplier push_supplier) throws AlreadyConnected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("connect_push_supplier", true);
                org.omg.CosEventComm.PushSupplierHelper.write ($out, push_supplier);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosEventChannelAdmin/AlreadyConnected:1.0"))
                    throw AlreadyConnectedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                connect_push_supplier (push_supplier        );
            } finally {
                _releaseReply ($in);
            }
  } // connect_push_supplier

  public void push (org.omg.CORBA.Any data) throws org.omg.CosEventComm.Disconnected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("push", true);
                $out.write_any (data);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosEventComm/Disconnected:1.0"))
                    throw org.omg.CosEventComm.DisconnectedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                push (data        );
            } finally {
                _releaseReply ($in);
            }
  } // push

  public void disconnect_push_consumer ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("disconnect_push_consumer", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                disconnect_push_consumer (        );
            } finally {
                _releaseReply ($in);
            }
  } // disconnect_push_consumer

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosEventChannelAdmin/ProxyPushConsumer:1.0",
    "IDL:omg.org/CosEventComm/PushConsumer:1.0"};

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
} // class _ProxyPushConsumerStub
