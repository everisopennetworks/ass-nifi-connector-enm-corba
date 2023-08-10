package com.nttdata.nifi.processors.enm.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;


public class EventProperty {
    private String value;

    private long longValue;

    @JsonIgnore
    private String type;

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public void setType(int type_id) {
        switch (type_id) {
            case 0:
                type = "null";
                return;
            case 1:
                type = "void";
                return;
            case 2:
                type = "Short";
                return;
            case 3:
                type = "Long";
                return;
            case 4:
                type = "UShort";
                return;

            case 5:
                type = "SLong";
                return;
            case 6:
                type = "Float";
                return;
            case 7:
                type = "Double";
                return;
            case 8:
                type = "Boolean";
                return;
            case 9:
                type = "Char";
                return;
            case 10:
                type = "Octet";
                return;
            case 11:
                type = "Any";
                return;
            case 12:
                type = "TypeCode";
                return;
            case 13:
                type = "Principal";
                return;
            case 14:
                type = "ObjRef";
                return;
            case 15:
                type = "Struct";
                return;
            case 16:
                type = "Union";
                return;
            case 17:
                type = "Enum";
                return;
            case 18:
                type = "String";
                return;
            case 19:
                type = "Sequence";
                return;
            case 20:
                type = "Array";
                return;
            case 21:
                type = "Alias";
                return;
            case 22:
                type = "Exception";
                return;
            case 23:
                type = "LongLong";
                return;
            case 24:
                type = "UlongLong";
                return;
            case 25:
                type = "LongDouble";
                return;
            case 26:
                type = "WChar";
                return;
            case 27:
                type = "WString";
                return;
            case 28:
                type = "Fixed";
                return;
            case 29:
                type = "Value";
                return;

            case 30:
                type = "ValueBox";
                return;
            case 31:
                type = "Native";
                return;
            case 32:
                type = "AbstractInterface";
        }
    }

    public void setValue(String value) {
        this.value = value;
    }

    public EventProperty() {
    }

    @Override
    @JsonValue
    public String toString() {
        return value;
    }


}
