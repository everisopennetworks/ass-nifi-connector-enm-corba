package com.nttdata.nifi.processors.enm;

public class CorbaException extends RuntimeException {

    public CorbaException() {
    }

    public CorbaException(String message) {
        super(message);
    }

    public CorbaException(String message, Throwable cause) {
        super(message, cause);
    }
}
