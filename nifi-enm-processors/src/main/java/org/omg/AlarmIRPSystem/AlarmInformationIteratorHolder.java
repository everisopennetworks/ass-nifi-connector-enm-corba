package org.omg.AlarmIRPSystem;

/**
* org.omg.AlarmIRPSystem/AlarmInformationIteratorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.AlarmIRPSystem.idl
* jueves 5 de septiembre de 2019 01:52:14 AM CDT
*/


/*
   The AlarmInformationIterator is used to iterate through a snapshot of
   Alarm Informations taken from the Alarm List when IRPManager invokes
   get_alarm_list. IRPManager uses it to pace the return of Alarm
   Informations.
   IRPAgent controls the life-cycle of the iterator. However, a destroy
   operation is provided to handle the case where IRPManager wants to stop
   the iteration procedure before reaching the last iteration.
   */
public final class AlarmInformationIteratorHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmInformationIterator value = null;

  public AlarmInformationIteratorHolder ()
  {
  }

  public AlarmInformationIteratorHolder (AlarmInformationIterator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmInformationIteratorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmInformationIteratorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmInformationIteratorHelper.type ();
  }

}
