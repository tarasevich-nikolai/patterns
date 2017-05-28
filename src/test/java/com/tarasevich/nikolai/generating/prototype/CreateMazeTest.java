package com.tarasevich.nikolai.generating.prototype;

import com.tarasevich.nikolai.generating.abstract_factory.AbstractFactory;
import com.tarasevich.nikolai.generating.entity.Door;
import com.tarasevich.nikolai.generating.entity.Maze;
import com.tarasevich.nikolai.generating.entity.Room;
import com.tarasevich.nikolai.generating.entity.Wall;
import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class CreateMazeTest {

    @Test
    public void createMazeThroughMazePrototypeFactory() {
        AbstractFactory factory = new MazePrototypeFactory(new Maze(), new Wall(), new Room(), new Door());
        Maze maze = factory.makeMaze();
    }
}
