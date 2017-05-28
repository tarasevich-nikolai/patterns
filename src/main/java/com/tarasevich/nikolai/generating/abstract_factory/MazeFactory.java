package com.tarasevich.nikolai.generating.abstract_factory;

import com.tarasevich.nikolai.generating.entity.Door;
import com.tarasevich.nikolai.generating.entity.Maze;
import com.tarasevich.nikolai.generating.entity.Room;
import com.tarasevich.nikolai.generating.entity.Wall;

/**
 * @author nikolai.tarasevich
 */
public class MazeFactory extends AbstractFactory {

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }

    @Override
    public Room makeRoom(Integer roomNumber) {
        return new Room(roomNumber);
    }

    @Override
    public Wall makeWall() {
        return new Wall();
    }

    @Override
    public Maze makeMaze() {
        return new Maze();
    }
}
