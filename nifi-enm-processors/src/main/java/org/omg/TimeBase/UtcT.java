package org.omg.TimeBase;


/**
* org.omg.TimeBase/UtcT.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.TimeBase.idl
* jueves 5 de septiembre de 2019 02:04:35 AM CDT
*/

public final class UtcT implements org.omg.CORBA.portable.IDLEntity
{
  public long time = (long)0;

  // 8 octets
  public int inacclo = (int)0;

  // 4 octets
  public short inacchi = (short)0;

  // 2 octets
  public short tdf = (short)0;

  public UtcT ()
  {
  } // ctor

  public UtcT (long _time, int _inacclo, short _inacchi, short _tdf)
  {
    time = _time;
    inacclo = _inacclo;
    inacchi = _inacchi;
    tdf = _tdf;
  } // ctor

} // class UtcT
