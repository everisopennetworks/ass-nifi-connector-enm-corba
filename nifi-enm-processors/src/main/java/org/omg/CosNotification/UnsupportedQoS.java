package org.omg.CosNotification;


/**
* org.omg.CosNotification/UnsupportedQoS.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotification.idl
* jueves 5 de septiembre de 2019 01:57:52 AM CDT
*/

public final class UnsupportedQoS extends org.omg.CORBA.UserException
{
  public PropertyError qos_err[] = null;

  public UnsupportedQoS ()
  {
    super(UnsupportedQoSHelper.id());
  } // ctor

  public UnsupportedQoS (PropertyError[] _qos_err)
  {
    super(UnsupportedQoSHelper.id());
    qos_err = _qos_err;
  } // ctor


  public UnsupportedQoS (String $reason, PropertyError[] _qos_err)
  {
    super(UnsupportedQoSHelper.id() + "  " + $reason);
    qos_err = _qos_err;
  } // ctor

} // class UnsupportedQoS