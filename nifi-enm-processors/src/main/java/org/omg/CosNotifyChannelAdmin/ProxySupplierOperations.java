package org.omg.CosNotifyChannelAdmin;


/**
* org.omg.CosNotifyChannelAdmin/ProxySupplierOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:15 AM CDT
*/


// ProxyConsumer
public interface ProxySupplierOperations  extends org.omg.CosNotification.QoSAdminOperations, org.omg.CosNotifyFilter.FilterAdminOperations
{
  ProxyType MyType();
  ConsumerAdmin MyAdmin();
  org.omg.CosNotifyFilter.MappingFilter priority_filter();
  void priority_filter(org.omg.CosNotifyFilter.MappingFilter newPriority_filter);
  org.omg.CosNotifyFilter.MappingFilter lifetime_filter();
  void lifetime_filter(org.omg.CosNotifyFilter.MappingFilter newLifetime_filter);
  org.omg.CosNotification._EventType[] obtain_offered_types(ObtainInfoMode mode);
  void validate_event_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS;
} // interface ProxySupplierOperations
