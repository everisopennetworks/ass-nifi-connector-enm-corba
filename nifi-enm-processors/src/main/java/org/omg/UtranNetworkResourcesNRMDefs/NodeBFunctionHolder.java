package org.omg.UtranNetworkResourcesNRMDefs;

/**
* org.omg.UtranNetworkResourcesNRMDefs/NodeBFunctionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.UtranNetworkResourcesNRMDefs.idl
* jueves 5 de septiembre de 2019 02:21:43 AM CDT
*/


/**
       *  Definitions for MO class NodeBFunction
       */
public final class NodeBFunctionHolder implements org.omg.CORBA.portable.Streamable
{
  public NodeBFunction value = null;

  public NodeBFunctionHolder ()
  {
  }

  public NodeBFunctionHolder (NodeBFunction initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NodeBFunctionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NodeBFunctionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NodeBFunctionHelper.type ();
  }

}
