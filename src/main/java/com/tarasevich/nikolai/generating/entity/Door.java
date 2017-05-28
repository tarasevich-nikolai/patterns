package com.tarasevich.nikolai.generating.entity;

/**
 * @author nikolai.tarasevich
 */
public class Door extends MapSite {

    private Room room1;
    private Room room2;
    private boolean isOpen = false;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    @Override
    public void enter() {
        System.out.println("Open door");
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
