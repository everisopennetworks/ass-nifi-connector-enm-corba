package com.nttdata.nifi.processors.enm;

public interface Command {
    void invoke(Arguments paramArguments);
}