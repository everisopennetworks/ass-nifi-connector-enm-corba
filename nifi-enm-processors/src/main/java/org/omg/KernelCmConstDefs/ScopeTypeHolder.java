package org.omg.KernelCmConstDefs;

/**
* org.omg.KernelCmConstDefs/ScopeTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmConstDefs.idl
* jueves 5 de septiembre de 2019 02:19:32 AM CDT
*/


/**
     * ScopeType defines the kind of scope to use in a CM synchronization
     * request together with ScopePara.level, in the SCOPE field.
     *
     * ScopePara.level is always >= 0. If a level is bigger than the
     * depth of the tree there will be no exceptions thrown.
     * BASE_ONLY: level ignored, just return the base object.
     * BASE_NTH_LEVEL: return all subordinate objects that are on "level"
     * distance from the base object, where 0 is the base object.
     * BASE_SUBTREE: return the base object and all of its subordinates
     * down to and including the nth level.
     * BASE_ALL: level ignored, return the base object and all of it's
     * subordinates.
     */
public final class ScopeTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public ScopeType value = null;

  public ScopeTypeHolder ()
  {
  }

  public ScopeTypeHolder (ScopeType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ScopeTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ScopeTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ScopeTypeHelper.type ();
  }

}
