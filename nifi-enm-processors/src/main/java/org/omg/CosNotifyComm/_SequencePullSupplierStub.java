package org.omg.CosNotifyComm;


/**
* org.omg.CosNotifyComm/_SequencePullSupplierStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyComm.idl
* jueves 5 de septiembre de 2019 02:16:25 AM CDT
*/


// SequencePullConsumer
public class _SequencePullSupplierStub extends org.omg.CORBA.portable.ObjectImpl implements SequencePullSupplier
{

  public org.omg.CosNotification.StructuredEvent[] pull_structured_events (int max_number) throws org.omg.CosEventComm.Disconnected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("pull_structured_events", true);
                $out.write_long (max_number);
                $in = _invoke ($out);
                org.omg.CosNotification.StructuredEvent $result[] = org.omg.CosNotification.EventBatchHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosEventComm/Disconnected:1.0"))
                    throw org.omg.CosEventComm.DisconnectedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return pull_structured_events (max_number        );
            } finally {
                _releaseReply ($in);
            }
  } // pull_structured_events

  public org.omg.CosNotification.StructuredEvent[] try_pull_structured_events (int max_number, org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("try_pull_structured_events", true);
                $out.write_long (max_number);
                $in = _invoke ($out);
                org.omg.CosNotification.StructuredEvent $result[] = org.omg.CosNotification.EventBatchHelper.read ($in);
                has_event.value = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosEventComm/Disconnected:1.0"))
                    throw org.omg.CosEventComm.DisconnectedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return try_pull_structured_events (max_number, has_event        );
            } finally {
                _releaseReply ($in);
            }
  } // try_pull_structured_events

  public void disconnect_sequence_pull_supplier ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("disconnect_sequence_pull_supplier", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                disconnect_sequence_pull_supplier (        );
            } finally {
                _releaseReply ($in);
            }
  } // disconnect_sequence_pull_supplier

  public void subscription_change (org.omg.CosNotification._EventType[] added, org.omg.CosNotification._EventType[] removed) throws InvalidEventType
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("subscription_change", true);
                org.omg.CosNotification.EventTypeSeqHelper.write ($out, added);
                org.omg.CosNotification.EventTypeSeqHelper.write ($out, removed);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyComm/InvalidEventType:1.0"))
                    throw InvalidEventTypeHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                subscription_change (added, removed        );
            } finally {
                _releaseReply ($in);
            }
  } // subscription_change

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyComm/SequencePullSupplier:1.0",
    "IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0"};

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
} // class _SequencePullSupplierStub
