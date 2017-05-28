package com.tarasevich.nikolai.generating.factory_method;

import com.tarasevich.nikolai.generating.entity.Room;
import com.tarasevich.nikolai.generating.entity.Wall;
import com.tarasevich.nikolai.generating.entity.bombed.BombedWall;
import com.tarasevich.nikolai.generating.entity.bombed.RoomWithABomb;

/**
 * @author nikolai.tarasevich
 */
public class BombedMazeGame extends MazeGame {

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(Integer roomNumber) {
        return new RoomWithABomb(roomNumber);
    }
}
