package com.tarasevich.nikolai.structure.decorator;

import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class DecoratorTest {

    @Test
    public void test() {
        BorderDecorator borderDecorator = new BorderDecorator(new ScrollDecorator(new TextView()));
    }
}
