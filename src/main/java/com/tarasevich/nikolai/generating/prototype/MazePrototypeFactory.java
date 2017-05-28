package com.tarasevich.nikolai.generating.prototype;

import com.tarasevich.nikolai.generating.abstract_factory.AbstractFactory;
import com.tarasevich.nikolai.generating.abstract_factory.MazeFactory;
import com.tarasevich.nikolai.generating.entity.Door;
import com.tarasevich.nikolai.generating.entity.Maze;
import com.tarasevich.nikolai.generating.entity.Room;
import com.tarasevich.nikolai.generating.entity.Wall;

/**
 * @author nikolai.tarasevich
 */
public class MazePrototypeFactory extends AbstractFactory {

    private Maze prototypeMaze;
    private Wall prototypeWall;
    private Room prototypeRoom;
    private Door prototypeDoor;

    public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
        this.prototypeMaze = maze;
        this.prototypeWall = wall;
        this.prototypeRoom = room;
        this.prototypeDoor = door;
    }

    @Override
    public Door makeDoor(Room room1, Room room2) {
        Door door = this.prototypeDoor.clone();
        door.initialize(room1, room2);
        return door;
    }

    @Override
    public Room makeRoom(Integer roomNumber) {
        Room room = prototypeRoom.clone();
        room.initialize(roomNumber);
        return room;
    }

    @Override
    public Wall makeWall() {
        return this.prototypeWall.clone();
    }

    @Override
    public Maze makeMaze() {
        return this.prototypeMaze.clone();
    }
}
