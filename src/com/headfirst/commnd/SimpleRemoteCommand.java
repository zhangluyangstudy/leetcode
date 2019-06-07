package com.headfirst.commnd;

public class SimpleRemoteCommand {
   private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public  void buttonWasPressed(){
        command.excute();
    }
}
