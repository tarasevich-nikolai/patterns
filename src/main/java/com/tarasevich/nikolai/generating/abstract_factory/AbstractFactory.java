package com.tarasevich.nikolai.generating.abstract_factory;

import com.tarasevich.nikolai.generating.entity.Door;
import com.tarasevich.nikolai.generating.entity.Maze;
import com.tarasevich.nikolai.generating.entity.Room;
import com.tarasevich.nikolai.generating.entity.Wall;

/**
 * @author nikolai.tarasevich
 */
public abstract class AbstractFactory {

    public abstract Door makeDoor(Room room1, Room room2);

    public abstract Room makeRoom(Integer roomNumber);

    public abstract Wall makeWall();

    public abstract Maze makeMaze();
}
