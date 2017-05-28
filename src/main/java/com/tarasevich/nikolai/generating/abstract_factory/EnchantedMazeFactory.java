package com.tarasevich.nikolai.generating.abstract_factory;

import com.tarasevich.nikolai.generating.abstract_factory.entity.EnchantedDoor;
import com.tarasevich.nikolai.generating.abstract_factory.entity.EnchantedWall;
import com.tarasevich.nikolai.generating.entity.Door;
import com.tarasevich.nikolai.generating.entity.Room;
import com.tarasevich.nikolai.generating.entity.Wall;

/**
 * @author nikolai.tarasevich
 */
public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new EnchantedDoor(room1, room2);
    }

    @Override
    public Wall makeWall() {
        return new EnchantedWall();
    }
}
