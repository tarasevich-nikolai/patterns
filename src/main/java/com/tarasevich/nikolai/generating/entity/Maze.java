package com.tarasevich.nikolai.generating.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nikolai.tarasevich
 */
public class Maze {

    List<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public Room getRoom(Integer roomNumber) {
        return roomList.get(roomNumber);
    }
}
