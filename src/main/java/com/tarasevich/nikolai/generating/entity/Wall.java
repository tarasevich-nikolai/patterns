package com.tarasevich.nikolai.generating.entity;

/**
 * @author nikolai.tarasevich
 */
public class Wall extends MapSite implements Cloneable<Wall> {

    public Wall() {

    }

    public Wall(Wall other) {

    }

    @Override
    public void enter() {
        System.out.println("You cant go, this is wall");
    }

    @Override
    public Wall clone() {
        return new Wall(this);
    }
}
