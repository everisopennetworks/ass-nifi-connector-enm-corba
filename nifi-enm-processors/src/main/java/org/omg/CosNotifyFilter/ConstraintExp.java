package org.omg.CosNotifyFilter;


/**
* org.omg.CosNotifyFilter/ConstraintExp.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:36 AM CDT
*/

public final class ConstraintExp implements org.omg.CORBA.portable.IDLEntity
{
  public org.omg.CosNotification._EventType event_types[] = null;
  public String constraint_expr = null;

  public ConstraintExp ()
  {
  } // ctor

  public ConstraintExp (org.omg.CosNotification._EventType[] _event_types, String _constraint_expr)
  {
    event_types = _event_types;
    constraint_expr = _constraint_expr;
  } // ctor

} // class ConstraintExp
