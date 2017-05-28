package com.tarasevich.nikolai.generating.factory_method;

import com.tarasevich.nikolai.generating.entity.*;

/**
 * @author nikolai.tarasevich
 */
public class MazeGame {

    public Maze makeMaze() {
        return new Maze();
    }

    public Room makeRoom(Integer roomNumber) {
        return new Room(roomNumber);
    }

    public Door makeDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Maze createNewMaze() {
        Maze maze = makeMaze();

        Room room1 = makeRoom(1);
        Room room2 = makeRoom(2);
        Door door = makeDoor(room1, room2);

        room1.setSide(Direction.NORTH, makeWall());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, makeWall());
        room1.setSide(Direction.WEST, makeWall());

        room2.setSide(Direction.NORTH, makeWall());
        room2.setSide(Direction.EAST, makeWall());
        room2.setSide(Direction.SOUTH, makeWall());
        room2.setSide(Direction.WEST, door);

        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }
}
