package com.tarasevich.nikolai.behaviour.command;

import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class CommandTest {

    @Test
    public void test() {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        //switch on
        control.setCommand(lightsOn);
        control.pressButton();
        //switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}
