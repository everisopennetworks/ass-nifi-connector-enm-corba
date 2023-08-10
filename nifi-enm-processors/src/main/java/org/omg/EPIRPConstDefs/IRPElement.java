package org.omg.EPIRPConstDefs;


/**
* org.omg.EPIRPConstDefs/IRPElement.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.EPIRPConstDefs.idl
* jueves 5 de septiembre de 2019 02:17:10 AM CDT
*/

public final class IRPElement implements org.omg.CORBA.portable.IDLEntity
{
  public String irpId = null;
  public String irpVersions[] = null;
  public IRPManagementScopeOpt irpManagementScope = null;

  public IRPElement ()
  {
  } // ctor

  public IRPElement (String _irpId, String[] _irpVersions, IRPManagementScopeOpt _irpManagementScope)
  {
    irpId = _irpId;
    irpVersions = _irpVersions;
    irpManagementScope = _irpManagementScope;
  } // ctor

} // class IRPElement