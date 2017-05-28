package com.tarasevich.nikolai.generating.entity;

/**
 * @author nikolai.tarasevich
 */
public class Door extends MapSite implements Cloneable<Door> {

    private Room room1;
    private Room room2;
    private boolean isOpen = false;

    public Door() {

    }

    public Door(Door other) {
        this.room1 = other.getRoom1();
        this.room2 = other.getRoom2();
    }
    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    @Override
    public void enter() {
        System.out.println("Open door");
    }

    public Door clone() {
        return new Door(this);
    }

    public void initialize(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public Room getRoom1() {
        return room1;
    }

    public void setRoom1(Room room1) {
        this.room1 = room1;
    }

    public Room getRoom2() {
        return room2;
    }

    public void setRoom2(Room room2) {
        this.room2 = room2;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
