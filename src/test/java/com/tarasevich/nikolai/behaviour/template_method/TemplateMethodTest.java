package com.tarasevich.nikolai.behaviour.template_method;

import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class TemplateMethodTest {

    @Test
    public void test() {
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
