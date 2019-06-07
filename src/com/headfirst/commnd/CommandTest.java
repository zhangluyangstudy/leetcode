package com.headfirst.commnd;

import org.junit.Test;

public class CommandTest {


    @Test
    public  void  test1(){
        Light light=new Light("test");
        LightCommand lightCommand=new LightCommand(light);

        SimpleRemoteCommand simpleRemoteCommand=new SimpleRemoteCommand();
        simpleRemoteCommand.setCommand(lightCommand);
        simpleRemoteCommand.buttonWasPressed();
    }

}
