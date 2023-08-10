package com.nttdata.nifi.processors.enm;

import org.omg.CORBA.Object;
import org.omg.CORBA.*;
import org.omg.DynamicAny.*;
import org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode;
import org.omg.DynamicAny.DynArray;
import org.omg.DynamicAny.DynEnum;
import org.omg.DynamicAny.DynSequence;
import org.omg.DynamicAny.DynStruct;
import org.omg.DynamicAny.DynUnion;
import org.omg.DynamicAny.NameValuePair;
import org.omg.DynamicAny.DynAnyPackage.InvalidValue;
import org.omg.TimeBase.UtcT;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class CorbaFacility {
    private static final Logger LOG = Logger.getLogger(CorbaFacility.class.getName());

    public static DynAnyFactory factory;

    public static ORB orb = null;

    static {
        try {
            orb = ORB.init(new String[0], null);
            factory = DynAnyFactoryHelper.narrow(orb.resolve_initial_references("DynAnyFactory"));
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public Logger getLogger() {
        return LOG;
    }


    private static String printAny(Any a, boolean includedId) {
        String ret = "";

        try {
            TypeCode tc = a.type();
            while (tc.kind() == TCKind.tk_alias) {
                tc = tc.content_type();
            }

            switch (tc.kind().value()) {
                case 0:
                    return ret + "null";

                case 1:
                    return ret + "void";


                case 2:
                    return printShort(a, ret, includedId);


                case 3:
                    return printLong(a, ret, includedId);


                case 4:
                    return printUShort(a, ret, includedId);

                case 5:
                    return printULong(a, ret, includedId);

                case 6:
                    return printFloat(a, ret, includedId);


                case 7:
                    return printDouble(a, ret, includedId);


                case 8:
                    return printBoolean(a, ret, includedId);


                case 9:
                    return printChar(a, ret, includedId);


                case 10:
                    return printOctet(a, ret, includedId);


                case 11:
                    return ret + printAny(a.extract_any(), includedId);


                case 12:
                    return printTypeCode(a, ret, includedId);


                case 13:
                    return printPrincipal(a, ret, includedId);


                case 14:
                    return printObjref(a, ret, includedId);


                case 15:
                    return printStruct(a, ret, includedId);


                case 16:
                    return printUnion(a, ret, includedId);


                case 17:
                    return printEnum(a, ret, includedId);


                case 18:
                    return printString(a, ret, includedId);


                case 19:
                    return printSequence(a, ret, includedId);


                case 20:
                    return printArray(a, ret, includedId);


                case 21:
                    return ret + "alias";


                case 22:
                    return printException(a, ret, includedId);


                case 23:
                    return printLonglong(a, ret, includedId);


                case 24:
                    return printUlonglong(a, ret, includedId);


                case 25:
                    return printLongdouble(a, ret, includedId);


                case 26:
                    return printWchar(a, ret, includedId);


                case 27:
                    return printWstring(a, ret, includedId);


                case 28:
                    return printFixed(a, ret, includedId);

                case 29:
                    return printValue(a, ret, includedId);

                case 30:
                    return ret + "value_box";

                case 31:
                    return ret + "native";

                case 32:
                    return ret + "abstract_interface";
            }


            return ret + "<null,kind=" + a.type().kind().value() + ">";


        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage(), e);
            return ret;
        }
    }

    private static String printValueAny(Any a) {
        return printAny(a, false);
    }

    public String toString() {
        return super.toString();
    }

    public static String toString(Any any, boolean verbose) {
        return printAny(any, verbose);
    }

    public static String toValueString(Any any) {
        return printValueAny(any);
    }

    private static String printShort(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Short: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_short();
    }

    private static String printLong(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Long: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_long();
    }

    private static String printUShort(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "UShort: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_ushort();
    }

    private static String printULong(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "ULong: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_ulong();
    }

    private static String printFloat(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Float: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_float();
    }

    private static String printDouble(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Double: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_double();
    }

    private static String printBoolean(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Boolean: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_boolean();
    }

    private static String printChar(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Char: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_char();
    }

    private static String printOctet(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Octet: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_octet();
    }

    private static String printTypeCode(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "TypeCode: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_TypeCode();
    }

    private static String printPrincipal(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Principal: ";
            }
        } else {
            id = "";
        }
        return ret + id + "Deprecated by CORBA 2.2.";
    }

    private static String printObjref(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Objref: ";
            }
        } else {
            id = "";
        }
        Object obj = a.create_input_stream().read_Object();
        if (obj != null) {
            return ret + id + orb.object_to_string(obj);
        }
        return ret + id + "null";
    }

    private static String printStruct(Any a, String ret, boolean includedId) throws InconsistentTypeCode {
        String id;
        DynStruct dynstruct = (DynStruct) factory.create_dyn_any(a);
        NameValuePair[] members = dynstruct.get_members();
        if (includedId) {
            try {
                id = a.type().id();
            } catch (Throwable e) {
                id = "Struct";
            }
        } else {
            id = "";
        }
        String str = ret + id + "{";
        for (int i = 0; i < members.length; i++) {
            str = str + "";
            if (includedId) {
                str = str + (members[i]).id + " : ";
            }
            str = str + printAny((members[i]).value, includedId);
            if (i < members.length - 1) {
                str = str + " , ";
            }
        }
        return str + "}";
    }

    private static String printUnion(Any a, String ret, boolean includedId) throws InconsistentTypeCode {
        String id;
        try {
            id = a.type().id();
        } catch (Throwable e) {
            id = "Union";
        }
        String str = ret + id + " ( ";
        DynUnion dynunion = (DynUnion) factory.create_dyn_any(a);
        try {
            if (includedId) {
                str = str + dynunion.member_name() + " : ";
            }
            str = str + printAny(dynunion.member().to_any(), includedId);
        } catch (InvalidValue e) {
            str = str + "No Active Member";
        }
        return str + " ) ";
    }

    private static String printEnum(Any a, String ret, boolean includedId) throws InconsistentTypeCode {
        String id;
        DynEnum dynEnum = (DynEnum) factory.create_dyn_any(a);
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Enum: ";
            }
        } else {
            id = "";
        }
        return ret + id + dynEnum.get_as_string();
    }

    private static String printException(Any a, String ret, boolean includedId) throws InconsistentTypeCode {
        String id;
        DynStruct dynstruct = (DynStruct) factory.create_dyn_any(a);
        NameValuePair[] members = dynstruct.get_members();
        if (includedId) {
            try {
                id = a.type().id();
            } catch (Throwable e) {
                id = "IdlExcept";
            }
        } else {
            id = "";
        }
        String str = ret + id + "{\n";
        for (int i = 0; i < members.length; i++) {
            str = str + "\t";
            if (includedId) {
                str = str + (members[i]).id + " : ";
            }
            str = str + printAny((members[i]).value, includedId);
            if (i < members.length - 1) {
                str = str + " , \n";
            }
        }
        return str + "\n}";
    }

    private static String printString(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "String: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_string();
    }

    private static String printSequence(Any a, String ret, boolean includedId) throws InconsistentTypeCode {
        String id;
        DynSequence dynseq = (DynSequence) factory.create_dyn_any(a);
        Any[] contents = dynseq.get_elements();
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Sequence: ";
            }
        } else {
            id = "";
        }
        String str = ret + id + "Sequence of length: " + contents.length + " ( \n";
        for (int i = 0; i < contents.length; i++) {
            str = str + "\t";
            str = str + printAny(contents[i], includedId);
            if (i < contents.length - 1) {
                str = str + " ; \n";
            }
        }
        return str + " \n) ";
    }

    private static String printArray(Any a, String ret, boolean includedId) throws InconsistentTypeCode {
        String id;
        DynArray dynarray = (DynArray) factory.create_dyn_any(a);
        Any[] arrayContents = dynarray.get_elements();
        try {
            id = a.type().id();
        } catch (Throwable e) {
            id = "Array";
        }
        String str = ret + id + " ( \n";
        for (int i = 0; i < arrayContents.length; i++) {
            str = str + "\t";
            str = str + printAny(arrayContents[i], includedId);
            if (i < arrayContents.length - 1) {
                str = str + " ; \n";
            }
        }
        return str + " \n) ";
    }

    private static String printLonglong(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "LongLong: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_longlong();
    }

    private static String printUlonglong(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "ULongLong: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_ulonglong();
    }


    private static String printLongdouble(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "LongDouble: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_double();
    }


    private static String printWchar(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "WChar: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_wchar();
    }


    private static String printWstring(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "WString: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_wstring();
    }


    private static String printFixed(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Fixed: ";
            }
        } else {
            id = "";
        }
        return ret + id + a.create_input_stream().read_fixed();
    }


    private static String printValue(Any a, String ret, boolean includedId) {
        String id;
        if (includedId) {
            try {
                id = a.type().id() + ": ";
            } catch (Throwable e) {
                id = "Value: ";
            }
        } else {
            id = "";
        }

        return ret + id + a.extract_Value();
    }

    public static long unixTime(UtcT corbaTime) {
        long _unixTime = (corbaTime.time - 122192928000000000L) / 10000L;

        if (corbaTime.tdf != 0) {
            _unixTime -= (corbaTime.tdf * 60000);
        }

        return _unixTime;
    }
}

