package org.omg.CosNotifyComm;


/**
* org.omg.CosNotifyComm/SequencePushConsumerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyComm.idl
* jueves 5 de septiembre de 2019 02:16:25 AM CDT
*/


// StructuredPushSupplier
public interface SequencePushConsumerOperations  extends NotifyPublishOperations
{
  void push_structured_events(org.omg.CosNotification.StructuredEvent[] notifications) throws org.omg.CosEventComm.Disconnected;
  void disconnect_sequence_push_consumer();
} // interface SequencePushConsumerOperations