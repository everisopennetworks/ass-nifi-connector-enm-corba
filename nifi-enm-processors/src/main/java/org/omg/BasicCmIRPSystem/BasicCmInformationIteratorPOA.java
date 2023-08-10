package org.omg.BasicCmIRPSystem;


/**
* org.omg.BasicCmIRPSystem/BasicCmInformationIteratorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:11 AM CDT
*/


/**
     The BasicCmInformationIterator is used to iterate through a snapshot of 
      Managed Object Information when IRPManager invokes find_managed_objects.
      IRPManager uses it to pace the return of Managed Object Information.

     IRPAgent controls the life-cycle of the iterator. However, a destroy
      operation is provided to handle the case where IRPManager wants to stop
      the iteration procedure before reaching the last iteration.
     */
public abstract class BasicCmInformationIteratorPOA extends org.omg.PortableServer.Servant
 implements BasicCmInformationIteratorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("next_basicCmInformations", new Integer (0));
    _methods.put ("destroy", new Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    Integer __method = (Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /**
        This method returns between 1 and "how_many" Managed Object information.
         The IRPAgent may return less than "how_many" items even if there are
         more items to return. "how_many" must be non-zero. Return TRUE if there
         may be more Managed Object information to return. Return FALSE if there
         are no more Managed Object information to be returned. 

         If FALSE is returned, the IRPAgent will automatically destroy the
          iterator.

         @parm how_many how many elements to return in the "fetchedElements" out
          parameter.
         @parm fetchedElements the elements.
         @returns A boolean indicating if any elements are returned. 
          "fetchedElements" is empty when the BasicCmInformationIterator is
          empty.
        */
       case 0:  // org.omg.BasicCmIRPSystem/BasicCmInformationIterator/next_basicCmInformations
       {
         try {
           short how_many = in.read_ushort ();
           org.omg.BasicCMIRPConstDefs.ResultSetHolder fetchedElements = new org.omg.BasicCMIRPConstDefs.ResultSetHolder ();
           boolean $result = false;
           $result = this.next_basicCmInformations (how_many, fetchedElements);
           out = $rh.createReply();
           out.write_boolean ($result);
           org.omg.BasicCMIRPConstDefs.ResultSetHelper.write (out, fetchedElements.value);
         } catch (NextBasicCmInformations $ex) {
           out = $rh.createExceptionReply ();
           NextBasicCmInformationsHelper.write (out, $ex);
         } catch (org.omg.ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           org.omg.ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         } catch (org.omg.ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         }
         break;
       }


  /**
        This method destroys the iterator.
        */
       case 1:  // org.omg.BasicCmIRPSystem/BasicCmInformationIterator/destroy
       {
         try {
           this.destroy ();
           out = $rh.createReply();
         } catch (DestroyException $ex) {
           out = $rh.createExceptionReply ();
           DestroyExceptionHelper.write (out, $ex);
         } catch (org.omg.ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           org.omg.ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/BasicCmIRPSystem/BasicCmInformationIterator:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public BasicCmInformationIterator _this() 
  {
    return BasicCmInformationIteratorHelper.narrow(
    super._this_object());
  }

  public BasicCmInformationIterator _this(org.omg.CORBA.ORB orb) 
  {
    return BasicCmInformationIteratorHelper.narrow(
    super._this_object(orb));
  }


} // class BasicCmInformationIteratorPOA
