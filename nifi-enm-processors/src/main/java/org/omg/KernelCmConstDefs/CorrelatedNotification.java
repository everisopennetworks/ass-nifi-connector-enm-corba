package org.omg.KernelCmConstDefs;


/**
* org.omg.KernelCmConstDefs/CorrelatedNotification.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmConstDefs.idl
* jueves 5 de septiembre de 2019 02:19:33 AM CDT
*/

public final class CorrelatedNotification implements org.omg.CORBA.portable.IDLEntity
{
  public String source = null;

  // of the Structured Event, i.e., the notification.
  public int notif_id_set[] = null;

  public CorrelatedNotification ()
  {
  } // ctor

  public CorrelatedNotification (String _source, int[] _notif_id_set)
  {
    source = _source;
    notif_id_set = _notif_id_set;
  } // ctor

} // class CorrelatedNotification