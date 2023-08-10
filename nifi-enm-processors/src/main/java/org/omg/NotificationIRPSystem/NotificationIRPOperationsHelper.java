package org.omg.NotificationIRPSystem;

abstract public class NotificationIRPOperationsHelper
{
    private static String  _id = "IDL:3gppsa5.org/NotificationIRPSystem/NotificationIRPOperations:1.0";

    public static void insert (org.omg.CORBA.Any a, NotificationIRPOperations that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
        a.type (type ());
        write (out, that);
        a.read_value (out.create_input_stream (), type ());
    }

    public static NotificationIRPOperations extract (org.omg.CORBA.Any a)
    {
        return read (a.create_input_stream ());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    synchronized public static org.omg.CORBA.TypeCode type ()
    {
        if (__typeCode == null)
        {
            __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (NotificationIRPOperationsHelper.id (), "NotificationIRPOperations");
        }
        return __typeCode;
    }

    public static String id ()
    {
        return _id;
    }

    public static NotificationIRPOperations read (org.omg.CORBA.portable.InputStream istream)
    {
        return narrow (istream.read_Object (_NotificationIRPStub.class));
    }

    public static void write (org.omg.CORBA.portable.OutputStream ostream, NotificationIRPOperations value)
    {
        ostream.write_Object ((org.omg.CORBA.Object) value);
    }

    public static NotificationIRPOperations narrow (org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        else if (obj instanceof NotificationIRPOperations){
            return (NotificationIRPOperations)obj;
        }
        else if (!obj._is_a (id ())){
            System.out.println(obj);
            throw new org.omg.CORBA.BAD_PARAM ();
        }
        else
        {
            org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
            _NotificationIRPOperationsStub stub = new _NotificationIRPOperationsStub ();
            stub._set_delegate(delegate);
            return stub;
        }
    }

    public static NotificationIRPOperations unchecked_narrow (org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        else if (obj instanceof NotificationIRPOperations)
            return (NotificationIRPOperations)obj;
        else
        {
            org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
            _NotificationIRPOperationsStub stub = new _NotificationIRPOperationsStub ();
            stub._set_delegate(delegate);
            return stub;
        }
    }

}