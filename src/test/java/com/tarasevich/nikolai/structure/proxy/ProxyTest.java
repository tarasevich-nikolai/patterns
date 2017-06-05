package com.tarasevich.nikolai.structure.proxy;

import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class ProxyTest {

    @Test
    public void test() {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }
}
