package com.tarasevich.nikolai.generating.abstract_factory.entity;

import com.tarasevich.nikolai.generating.entity.Door;
import com.tarasevich.nikolai.generating.entity.Room;

/**
 * @author nikolai.tarasevich
 */
public class EnchantedDoor extends Door{

    public EnchantedDoor(Room room1, Room room2) {
        super(room1, room2);
    }

    @Override
    public void enter() {
        System.out.println("Open enchanted door");
    }
}
