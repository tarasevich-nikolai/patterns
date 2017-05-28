package com.tarasevich.nikolai.generating.builder;

import com.tarasevich.nikolai.generating.entity.*;

/**
 * @author nikolai.tarasevich
 */
public class StandardMazeBuilder implements MazeBuilder {

    private Maze currentMaze;

    @Override
    public void buildMaze() {
        currentMaze = new Maze();
    }

    @Override
    public void buildRoom(Integer roomNumber) {
        Room room = new Room(roomNumber);

        room.setSide(Direction.NORTH, new Wall());
        room.setSide(Direction.SOUTH, new Wall());
        room.setSide(Direction.EAST, new Wall());
        room.setSide(Direction.WEST, new Wall());

        currentMaze.addRoom(room);
    }

    @Override
    public void buildDoor(Integer roomFrom, Integer roomTo) {
        Room room1 = currentMaze.getRoom(roomFrom);
        Room room2 = currentMaze.getRoom(roomTo);
        Door door = new Door(room1, room2);
        room1.setSide(commonWall(room1, room2), door);
    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    private Direction commonWall(Room room1, Room room2) {
        return Direction.EAST;//Not implemented
    }
}
