package org.omg.CosNotifyChannelAdmin;


/**
* org.omg.CosNotifyChannelAdmin/ClientType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyChannelAdmin.idl
* jueves 5 de septiembre de 2019 02:16:16 AM CDT
*/

public class ClientType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static ClientType[] __array = new ClientType [__size];

  public static final int _ANY_EVENT = 0;
  public static final ClientType ANY_EVENT = new ClientType(_ANY_EVENT);
  public static final int _STRUCTURED_EVENT = 1;
  public static final ClientType STRUCTURED_EVENT = new ClientType(_STRUCTURED_EVENT);
  public static final int _SEQUENCE_EVENT = 2;
  public static final ClientType SEQUENCE_EVENT = new ClientType(_SEQUENCE_EVENT);

  public int value ()
  {
    return __value;
  }

  public static ClientType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ClientType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ClientType
