package com.tarasevich.nikolai.structure.bridge;

import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class BridgeTest {

    @Test
    public void test() {
        Triangle triangle = new Triangle(new BlueColor());
        Pentagram pentagram = new Pentagram(new RedColor());
    }
}
