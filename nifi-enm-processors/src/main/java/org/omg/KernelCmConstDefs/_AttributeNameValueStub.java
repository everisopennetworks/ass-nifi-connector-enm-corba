package org.omg.KernelCmConstDefs;


/**
* org.omg.KernelCmConstDefs/_AttributeNameValueStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.KernelCmConstDefs.idl
* jueves 5 de septiembre de 2019 02:19:33 AM CDT
*/


/*
   This block identifies attributes which are included as part of the Kernel
   CM IRP. These attribute values should not clash with those defined for the
   attributes of notification header (see IDL of Notification IRP).
   */
public class _AttributeNameValueStub extends org.omg.CORBA.portable.ObjectImpl implements AttributeNameValue
{

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/KernelCmConstDefs/AttributeNameValue:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _AttributeNameValueStub
