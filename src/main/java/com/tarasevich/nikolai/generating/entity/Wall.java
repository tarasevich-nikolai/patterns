package com.tarasevich.nikolai.generating.entity;

/**
 * @author nikolai.tarasevich
 */
public class Wall extends MapSite {

    @Override
    public void enter() {
        System.out.println("You cant go, this is wall");
    }

}
