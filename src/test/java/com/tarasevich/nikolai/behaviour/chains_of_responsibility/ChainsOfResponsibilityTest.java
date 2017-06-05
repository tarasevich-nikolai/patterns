package com.tarasevich.nikolai.behaviour.chains_of_responsibility;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author nikolai.tarasevich
 */
public class ChainsOfResponsibilityTest {

    @Test
    public void test() {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
            int amount = 530;
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }

}
