package com.headfirst.commnd;

public class LightCommand implements  Command {
    private  Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.on();
    }
}
