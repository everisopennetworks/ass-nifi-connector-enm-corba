package org.omg.BasicCmIRPSystem;


/**
* org.omg.BasicCmIRPSystem/ModifyResultIterator.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:12 AM CDT
*/


/**
     The ModifyResultIterator is used to iterate through the list of modified
      MOs when IRPManager invokes method "modify_managed_objects".
      IRPManager uses it to pace the return of Managed Object Information.

     IRPAgent controls the life-cycle of the iterator. However, a destroy
      operation is provided to handle the case where IRPManager wants to stop
      the iteration procedure before reaching the last iteration.
     */
public interface ModifyResultIterator extends ModifyResultIteratorOperations, BasicCmInformationIterator, org.omg.CORBA.portable.IDLEntity
{
} // interface ModifyResultIterator
