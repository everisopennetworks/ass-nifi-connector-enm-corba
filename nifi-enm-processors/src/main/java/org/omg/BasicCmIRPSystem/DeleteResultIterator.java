package org.omg.BasicCmIRPSystem;


/**
* org.omg.BasicCmIRPSystem/DeleteResultIterator.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:11 AM CDT
*/


/**
     The DeleteResultIterator is used to iterate through the list of deleted MOs
      when IRPManager invokes method "delete_managed_objects".
      IRPManager uses it to pace the return of Managed Object Information.

     IRPAgent controls the life-cycle of the iterator. However, a destroy
      operation is provided to handle the case where IRPManager wants to stop
      the iteration procedure before reaching the last iteration.
     */
public interface DeleteResultIterator extends DeleteResultIteratorOperations, BasicCmInformationIterator, org.omg.CORBA.portable.IDLEntity
{
} // interface DeleteResultIterator
