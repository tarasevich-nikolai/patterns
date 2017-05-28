package com.tarasevich.nikolai.generating.factory_method;

import com.tarasevich.nikolai.generating.entity.Door;
import com.tarasevich.nikolai.generating.entity.Room;
import com.tarasevich.nikolai.generating.entity.enchanted.DoorNeedingSpell;
import com.tarasevich.nikolai.generating.entity.enchanted.EnchantedRoom;

/**
 * @author nikolai.tarasevich
 */
public class EnchantedMazeGame extends MazeGame {

    @Override
    public Room makeRoom(Integer roomNumber) {
        return new EnchantedRoom(roomNumber);
    };

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1, room2);
    };
}
