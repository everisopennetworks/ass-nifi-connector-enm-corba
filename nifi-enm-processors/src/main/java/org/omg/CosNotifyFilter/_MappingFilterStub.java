package org.omg.CosNotifyFilter;


/**
* org.omg.CosNotifyFilter/_MappingFilterStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from org.omg.CosNotifyFilter.idl
* jueves 5 de septiembre de 2019 02:16:37 AM CDT
*/


// Filter
public class _MappingFilterStub extends org.omg.CORBA.portable.ObjectImpl implements MappingFilter
{

  public String constraint_grammar ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_constraint_grammar", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return constraint_grammar (        );
            } finally {
                _releaseReply ($in);
            }
  } // constraint_grammar

  public org.omg.CORBA.TypeCode value_type ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_value_type", true);
                $in = _invoke ($out);
                org.omg.CORBA.TypeCode $result = $in.read_TypeCode ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return value_type (        );
            } finally {
                _releaseReply ($in);
            }
  } // value_type

  public org.omg.CORBA.Any default_value ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_default_value", true);
                $in = _invoke ($out);
                org.omg.CORBA.Any $result = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return default_value (        );
            } finally {
                _releaseReply ($in);
            }
  } // default_value

  public MappingConstraintInfo[] add_mapping_constraints (MappingConstraintPair[] pair_list) throws InvalidConstraint, InvalidValue
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("add_mapping_constraints", true);
                MappingConstraintPairSeqHelper.write ($out, pair_list);
                $in = _invoke ($out);
                MappingConstraintInfo $result[] = MappingConstraintInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidConstraint:1.0"))
                    throw InvalidConstraintHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidValue:1.0"))
                    throw InvalidValueHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return add_mapping_constraints (pair_list        );
            } finally {
                _releaseReply ($in);
            }
  } // add_mapping_constraints

  public void modify_mapping_constraints (int[] del_list, MappingConstraintInfo[] modify_list) throws InvalidConstraint, InvalidValue, ConstraintNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("modify_mapping_constraints", true);
                ConstraintIDSeqHelper.write ($out, del_list);
                MappingConstraintInfoSeqHelper.write ($out, modify_list);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidConstraint:1.0"))
                    throw InvalidConstraintHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidValue:1.0"))
                    throw InvalidValueHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotifyFilter/ConstraintNotFound:1.0"))
                    throw ConstraintNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                modify_mapping_constraints (del_list, modify_list        );
            } finally {
                _releaseReply ($in);
            }
  } // modify_mapping_constraints

  public MappingConstraintInfo[] get_mapping_constraints (int[] id_list) throws ConstraintNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_mapping_constraints", true);
                ConstraintIDSeqHelper.write ($out, id_list);
                $in = _invoke ($out);
                MappingConstraintInfo $result[] = MappingConstraintInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/ConstraintNotFound:1.0"))
                    throw ConstraintNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_mapping_constraints (id_list        );
            } finally {
                _releaseReply ($in);
            }
  } // get_mapping_constraints

  public MappingConstraintInfo[] get_all_mapping_constraints ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_all_mapping_constraints", true);
                $in = _invoke ($out);
                MappingConstraintInfo $result[] = MappingConstraintInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_all_mapping_constraints (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_all_mapping_constraints

  public void remove_all_mapping_constraints ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("remove_all_mapping_constraints", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                remove_all_mapping_constraints (        );
            } finally {
                _releaseReply ($in);
            }
  } // remove_all_mapping_constraints

  public void destroy ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("destroy", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                destroy (        );
            } finally {
                _releaseReply ($in);
            }
  } // destroy

  public boolean match (org.omg.CORBA.Any filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws UnsupportedFilterableData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match", true);
                $out.write_any (filterable_data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                result_to_set.value = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
                    throw UnsupportedFilterableDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match (filterable_data, result_to_set        );
            } finally {
                _releaseReply ($in);
            }
  } // match

  public boolean match_structured (org.omg.CosNotification.StructuredEvent filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws UnsupportedFilterableData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match_structured", true);
                org.omg.CosNotification.StructuredEventHelper.write ($out, filterable_data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                result_to_set.value = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
                    throw UnsupportedFilterableDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match_structured (filterable_data, result_to_set        );
            } finally {
                _releaseReply ($in);
            }
  } // match_structured

  public boolean match_typed (org.omg.CosNotification.Property[] filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws UnsupportedFilterableData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match_typed", true);
                org.omg.CosNotification.PropertySeqHelper.write ($out, filterable_data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                result_to_set.value = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
                    throw UnsupportedFilterableDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match_typed (filterable_data, result_to_set        );
            } finally {
                _releaseReply ($in);
            }
  } // match_typed

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyFilter/MappingFilter:1.0"};

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
} // class _MappingFilterStub