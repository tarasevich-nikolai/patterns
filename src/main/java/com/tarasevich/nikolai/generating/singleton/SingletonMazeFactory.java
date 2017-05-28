package com.tarasevich.nikolai.generating.singleton;

import com.tarasevich.nikolai.generating.abstract_factory.AbstractFactory;
import com.tarasevich.nikolai.generating.abstract_factory.MazeFactory;
import com.tarasevich.nikolai.generating.entity.Door;
import com.tarasevich.nikolai.generating.entity.Maze;
import com.tarasevich.nikolai.generating.entity.Room;
import com.tarasevich.nikolai.generating.entity.Wall;

/**
 * @author nikolai.tarasevich
 */
public class SingletonMazeFactory extends MazeFactory {

    private static SingletonMazeFactory instance;

    private SingletonMazeFactory() {

    }

    public static SingletonMazeFactory getInstance() {
        if (instance == null) {
            instance = new SingletonMazeFactory();
        }
        return instance;
    }
}
