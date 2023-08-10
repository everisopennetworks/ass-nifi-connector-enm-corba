package org.omg.CosNotifyChannelAdmin;


/**
* org.omg.CosNotifyChannelAdmin/EventChannelFactoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:17 AM CDT
*/

public interface EventChannelFactoryOperations 
{
  EventChannel create_channel(org.omg.CosNotification.Property[] initial_qos, org.omg.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.CosNotification.UnsupportedQoS, org.omg.CosNotification.UnsupportedAdmin;
  int[] get_all_channels();
  EventChannel get_event_channel(int id) throws ChannelNotFound;
} // interface EventChannelFactoryOperations