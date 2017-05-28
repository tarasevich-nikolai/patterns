package com.tarasevich.nikolai.generating.entity.bombed;

import com.tarasevich.nikolai.generating.entity.Wall;

/**
 * @author nikolai.tarasevich
 */
public class EnchantedWall extends Wall {

    @Override
    public void enter() {
        System.out.println("Open enchanted wall");
    }
}
