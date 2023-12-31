package org.omg.BasicCmIRPSystem;


/**
* org.omg.BasicCmIRPSystem/BasicCmIrpOperationsOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BasicCMIRPSystem.idl
* jueves 5 de septiembre de 2019 02:15:12 AM CDT
*/


/**
     * The BasicCmIrpOperations interface.
     * Supports a number of Resource Model versions.
     */
public interface BasicCmIrpOperationsOperations 
{

  /**
        * Get the version(s) of the interface 
        *
        * @raises GetBasicCmIRPVersion when the system for some reason 
        *   can not return the supported versions. 
        * @returns all supported versions.
        */
  String[] get_basicCm_IRP_version() throws GetBasicCmIRPVersion;

  /**
        * Return the operation profile for a specific Basic CM IRP version.
        *
        * @raises GetBasicCmIRPOperationProfile when the system for some reason
        *   cannot return the supported operations and parameters.
        * @returns the list of all supported operations and their supported
        *   parameters for the specified version.
        */
  org.omg.ManagedGenericIRPConstDefs.Method[] get_basicCm_IRP_operation_profile(String basicCm_IRP_version) throws GetBasicCmIRPOperationProfile, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter;

  /**
        * Return the notification profile for a specific Basic CM IRP version.
        *
        * @raises GetBasicCmIRPNotificationProfile when the system for some
        *   reason cannot return the supported notifications and parameters.
        * @returns the list of all supported notifications and their supported
        *   parameters for the specified version.
        */
  org.omg.ManagedGenericIRPConstDefs.Method[] get_basicCm_IRP_notification_profile(String basicCm_IRP_version) throws GetBasicCmIRPNotificationProfile, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter;

  /**
        * Performs a containment search, using a SearchControl to
        * control the search and the returned results.
        *
        * All MOs in the scope constitute a set that the filter works on.
        * The result BasicCmInformationIterator contains all matched MOs,
        * with the amount of detail specified in the SearchControl.
        * For the special case when no managed objects are matched in 
        * find_managed_objects, the BasicCmInformationIterator will be returned.
        * Executing the next_basicCmInformations in the 
        * BasicCmInformationIterator will return FALSE for 
        * completion.
        *
        * @parm baseObject The start MO in the containment tree.
        * @parm searchControl the SearchControl to use.
        * @parm requestedAttributes defines which attributes to get.
        *   If this parameter is empty (""),  all attributes shall 
        *   be returned. In this version this is the only supported semantics.
        *   Note that this argument is only
        *   relevant if ResultContents in the search control is 
        *   specifed to NAMES_AND_ATTRIBUTES.
        *  
        * 
        * @raises org.omg.ManagedGenericIRPSystem::ValueNotSupported if a valid but
        * unsupported parameter value is passed. E.g. the contents
        * field in the searchcontrol parameter contains the value NAMES and
        * the optional getContainment IS operation is not supported.
        * @raises UndefinedMOException The MO does not exist.
        * @raises IllegalDNFormatException The dn syntax string is
        * malformed.
        * @raises IllegalScopeTypeException The ScopeType in scope contains
        * an illegal value.
        * @raises IllegalScopeLevelException The scope level is negative
        * (<0).
        * @raises IllegalFilterFormatException The filter string is
        * malformed.
        * @raises FilterComplexityLimit if the filter syntax is correct,
        *   but the filter is too complex to be processed by the IRP agent.
        * @see SearchControl
        * @see BasicCmInformationIterator
        */
  BasicCmInformationIterator find_managed_objects(String baseObject, org.omg.BasicCMIRPConstDefs.SearchControl searchControl, String[] requestedAttributes) throws FindManagedObjects, org.omg.ManagedGenericIRPSystem.ParameterNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter, org.omg.ManagedGenericIRPSystem.ValueNotSupported, org.omg.ManagedGenericIRPSystem.OperationNotSupported, UndefinedMOException, IllegalDNFormatException, UndefinedScopeException, IllegalScopeTypeException, IllegalScopeLevelException, IllegalFilterFormatException, FilterComplexityLimit;

  /**
        * Performs the creation of a MO instance in the MIB maintained
        * by the IRPAgent.
        *
        * @parm objectName: the distinguished name of the MO to create.
        * @parm referenceObject: the distinguished name of a reference MO.
        * @parm attributes: in input, initial attribute values for the MO to
        *   create; in output, actual attribute values of the created MO.
        * @parm attributeErrors: errors, related to attributes, that caused the
        *   creation of the MO to fail.
        *
        * @raises org.omg.ManagedGenericIRPSystem::OperationNotSupported: The operation
        *   is not supported.
        * @raises org.omg.ManagedGenericIRPSystem::ParameterNotSupported: An optional
        *   parameter is not supported.
        * @raises org.omg.ManagedGenericIRPSystem::InvalidParameter: An invalid
        *   parameter value has been provided.
        * @raises UndefinedMOException: The MO does not exist.
        * @raises IllegalDNFormatException: The DN syntax string is malformed.
        * @raises DuplicateMO: A MO already exist with the same DN as the one
        *   to create.
        * @raises CreateNotAllowed: The creation of the MO is not allowed.
        * @raises ObjectClassMismatch: The object class of the MO to create does
        *   not match with the object class of the provided reference MO.
        * @raises NoSuchObjectClass: The class of the object to create is not
        *   recognized.
        * @raises ParentObjectDoesNotExist: The parent MO instance of the
        *  ManagedEntity specified to be created does not exist.
        */
  void create_managed_object(String objectName, String referenceObject, org.omg.BasicCMIRPConstDefs.MOAttributeSetHolder attributes, org.omg.BasicCMIRPConstDefs.AttributeErrorSeqHolder attributeErrors) throws CreateManagedObject, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.ParameterNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter, UndefinedMOException, IllegalDNFormatException, DuplicateMO, CreateNotAllowed, ObjectClassMismatch, NoSuchObjectClass, ParentObjectDoesNotExist;

  /**
        * Performs the deletion of one or more MO instances from the MIB
        * maintained by the IRPAgent, using a SearchControl to control the
        * instances to be deleted.
        *
        * All MOs in the scope constitute a set that the filter works on.
        * All matched MOs will be deleted by this operation.
        * The returned DeleteResultIterator is used to retrieve the DNs of the
        * MOs deleted and the errors that may have occurred preventing deletion
        * of some MOs.
        * For the special case when no managed objects are matched in 
        * delete_managed_objects, the DeleteResultIterator will be returned.
        * Executing the next_basicCmInformations in the DeleteResultIterator
        * will return FALSE for completion.
        *
        * @parm baseObject: the start MO in the containment tree.
        * @parm searchControl: the SearchControl to use; field "contents" has no
        *   meaning here and shall be ignored.
         @returns: a DeleteResultIterator (see above).
        *
        * @raises org.omg.ManagedGenericIRPSystem::OperationNotSupported: The operation
        *   is not supported.
        * @raises org.omg.ManagedGenericIRPSystem::InvalidParameter: An invalid
        *   parameter value has been provided.
        * @raises UndefinedMOException: The MO does not exist.
        * @raises IllegalDNFormatException: The DN syntax string is malformed.
        * @raises IllegalScopeTypeException: The ScopeType in scope contains
        *   an illegal value.
        * @raises IllegalScopeLevelException: The scope level is negative (<0).
        * @raises IllegalFilterFormatException: The filter string is malformed.
        * @raises FilterComplexityLimit: The filter syntax is correct,
        *   but the filter is too complex to be processed by the IRPAgent.
        */
  DeleteResultIterator delete_managed_objects(String baseObject, org.omg.BasicCMIRPConstDefs.SearchControl searchControl) throws DeleteManagedObjects, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter, UndefinedMOException, IllegalDNFormatException, UndefinedScopeException, IllegalScopeTypeException, IllegalScopeLevelException, IllegalFilterFormatException, FilterComplexityLimit;

  /**
        * Performs the modification of MO attributes. One or more MOs attributes
        * may be modified according to a SearchControl.
        *
        * All MOs in the scope constitute a set that the filter works on.
        * All matched MOs will have their attributes modified by this operation.
        * The returned ModifyResultIterator is used to retrieve the DNs of the
        * modified MOs together with the values of the modified attributes, and
        * the errors that may have occurred preventing modification of some
        * attributes.
        * For the special case when no managed objects are matched in 
        * modify_managed_objects, the ModifyResultIterator will be returned.
        * Executing the next_basicCmInformations in the ModifyResultIterator
        * will return FALSE for completion.
        *
        * @parm baseObject: the start MO in the containment tree.
        * @parm searchControl: the SearchControl to use; field "contents" has no
            meaning here and shall be ignored.
        * @parm modifications: the values for the attributes to modify and
            the way those values are to be applied to the attributes.
         @returns: a ModifyResultIterator (see above).
        *
        * @raises org.omg.ManagedGenericIRPSystem::OperationNotSupported: The operation
        *   is not supported
        * @raises org.omg.ManagedGenericIRPSystem::InvalidParameter: An invalid
        *   parameter value has been provided
        * @raises UndefinedMOException: The MO does not exist.
        * @raises IllegalDNFormatException: The DN syntax string is malformed.
        * @raises IllegalScopeTypeException: The ScopeType in scope contains
        *   an illegal value.
        * @raises IllegalScopeLevelException: The scope level is negative (<0).
        * @raises IllegalFilterFormatException: The filter string is malformed.
        * @raises FilterComplexityLimit: The filter syntax is correct,
        *   but the filter is too complex to be processed by the IRPAgent.
        */
  ModifyResultIterator modify_managed_objects(String baseObject, org.omg.BasicCMIRPConstDefs.SearchControl searchControl, org.omg.BasicCMIRPConstDefs.AttributeModification[] modifications) throws ModifyManagedObjects, org.omg.ManagedGenericIRPSystem.OperationNotSupported, org.omg.ManagedGenericIRPSystem.InvalidParameter, UndefinedMOException, IllegalDNFormatException, UndefinedScopeException, IllegalScopeTypeException, IllegalScopeLevelException, IllegalFilterFormatException, FilterComplexityLimit;
} // interface BasicCmIrpOperationsOperations
