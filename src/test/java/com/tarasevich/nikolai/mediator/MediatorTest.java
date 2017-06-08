package com.tarasevich.nikolai.mediator;

import com.tarasevich.nikolai.behaviour.mediator.ChatMediator;
import com.tarasevich.nikolai.behaviour.mediator.ChatMediatorImpl;
import com.tarasevich.nikolai.behaviour.mediator.User;
import com.tarasevich.nikolai.behaviour.mediator.UserImpl;
import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class MediatorTest {

    @Test
    public void test() {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Pankaj");
        User user2 = new UserImpl(mediator, "Lisa");
        User user3 = new UserImpl(mediator, "Saurabh");
        User user4 = new UserImpl(mediator, "David");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
