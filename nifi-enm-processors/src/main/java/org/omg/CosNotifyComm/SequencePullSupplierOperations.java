package org.omg.CosNotifyComm;


/**
* org.omg.CosNotifyComm/SequencePullSupplierOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyComm.idl
* jueves 5 de septiembre de 2019 02:16:25 AM CDT
*/


// SequencePullConsumer
public interface SequencePullSupplierOperations  extends NotifySubscribeOperations
{
  org.omg.CosNotification.StructuredEvent[] pull_structured_events(int max_number) throws org.omg.CosEventComm.Disconnected;
  org.omg.CosNotification.StructuredEvent[] try_pull_structured_events(int max_number, org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected;
  void disconnect_sequence_pull_supplier();
} // interface SequencePullSupplierOperations
