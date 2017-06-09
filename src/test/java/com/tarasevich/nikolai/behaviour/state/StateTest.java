package com.tarasevich.nikolai.behaviour.state;

import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class StateTest {

    @Test
    public void test() {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();


        context.setState(tvStopState);
        context.doAction();
    }
}
