package org.omg.CosNotifyChannelAdmin;


/**
* org.omg.CosNotifyChannelAdmin/SequenceProxyPushSupplierOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:16 AM CDT
*/


// StructuredProxyPushSupplier
public interface SequenceProxyPushSupplierOperations  extends ProxySupplierOperations, org.omg.CosNotifyComm.SequencePushSupplierOperations
{
  void connect_sequence_push_consumer(org.omg.CosNotifyComm.SequencePushConsumer push_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected, org.omg.CosEventChannelAdmin.TypeError;
  void suspend_connection() throws ConnectionAlreadyInactive, NotConnected;
  void resume_connection() throws ConnectionAlreadyActive, NotConnected;
} // interface SequenceProxyPushSupplierOperations
