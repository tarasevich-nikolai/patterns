package com.tarasevich.nikolai.generating.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nikolai.tarasevich
 */
public class Room extends MapSite implements Cloneable<Room> {

    private Integer roomNumber;
    private Map<Direction, MapSite> sides = new HashMap<>();

    public Room() {

    }

    public Room(Room other) {
        this.roomNumber = other.roomNumber;
        this.sides = other.sides;
    }

    public Room(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public MapSite getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, MapSite mapSite) {
        sides.put(direction, mapSite);
    }

    @Override
    public void enter() {
        System.out.println("Open room");
    }

    @Override
    public Room clone() {
        return new Room(this);
    }

    public void initialize(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
}
