package org.omg.CosNotifyComm;


/**
* org.omg.CosNotifyComm/StructuredPushConsumerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyComm.idl
* jueves 5 de septiembre de 2019 02:16:24 AM CDT
*/

public interface StructuredPushConsumerOperations  extends NotifyPublishOperations
{
  void push_structured_event(org.omg.CosNotification.StructuredEvent notification) throws org.omg.CosEventComm.Disconnected;
  void disconnect_structured_push_consumer();
} // interface StructuredPushConsumerOperations