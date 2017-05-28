package com.tarasevich.nikolai.generating.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nikolai.tarasevich
 */
public class Maze implements Cloneable<Maze> {

    private List<Room> roomList = new ArrayList<>();

    public Maze() {

    }

    public Maze(Maze other) {
        this.roomList = other.roomList;
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public Room getRoom(Integer roomNumber) {
        return roomList.get(roomNumber);
    }

    @Override
    public Maze clone() {
        return new Maze(this);
    }
}
