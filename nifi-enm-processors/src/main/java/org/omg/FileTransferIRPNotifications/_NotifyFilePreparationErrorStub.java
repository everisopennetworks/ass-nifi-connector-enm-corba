package org.omg.FileTransferIRPNotifications;


/**
* org.omg.FileTransferIRPNotifications/_NotifyFilePreparationErrorStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.FileTransferIRPNotifications.idl
* jueves 5 de septiembre de 2019 02:17:39 AM CDT
*/


/**
   * Constant definitions for the FilePreparationError notification
   */
public class _NotifyFilePreparationErrorStub extends org.omg.CORBA.portable.ObjectImpl implements NotifyFilePreparationError
{

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/FileTransferIRPNotifications/NotifyFilePreparationError:1.0",
    "IDL:3gppsa5.org/NotificationIRPNotifications/Notify:1.0"};

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
} // class _NotifyFilePreparationErrorStub
