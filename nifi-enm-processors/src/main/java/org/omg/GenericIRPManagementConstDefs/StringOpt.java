package org.omg.GenericIRPManagementConstDefs;


/**
* org.omg.GenericIRPManagementConstDefs/StringOpt.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.GenericIRPManagementConstDefs.idl
* jueves 5 de septiembre de 2019 02:18:41 AM CDT
*/

public final class StringOpt implements org.omg.CORBA.portable.IDLEntity
{
  private String ___value;
  private boolean __discriminator;
  private boolean __uninitialized = true;

  public StringOpt ()
  {
  }

  public boolean discriminator ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    return __discriminator;
  }

  public String value ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyvalue (__discriminator);
    return ___value;
  }

  public void value (String value)
  {
    __discriminator = true;
    ___value = value;
    __uninitialized = false;
  }

  public void value (boolean discriminator, String value)
  {
    verifyvalue (discriminator);
    __discriminator = discriminator;
    ___value = value;
    __uninitialized = false;
  }

  private void verifyvalue (boolean discriminator)
  {
    if (discriminator != true)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public void _default ()
  {
    __discriminator = false;
    __uninitialized = false;
  }

  public void _default (boolean discriminator)
  {
    verifyDefault( discriminator ) ;
    __discriminator = discriminator ;
    __uninitialized = false;
  }

  private void verifyDefault (boolean discriminator)
  {
    if ( discriminator )
        throw new org.omg.CORBA.BAD_OPERATION();
  }

} // class StringOpt
