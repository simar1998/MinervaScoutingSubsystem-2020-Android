package com.example.minervascoutingsubsystemandroid.communications.command;

public interface Command {
    public void executeCommand();
    public void processCommand(String cmdStr);
}
