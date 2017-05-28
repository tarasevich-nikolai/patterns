package com.tarasevich.nikolai.singleton;

import com.tarasevich.nikolai.generating.abstract_factory.AbstractFactory;
import com.tarasevich.nikolai.generating.abstract_factory.EnchantedMazeFactory;
import com.tarasevich.nikolai.generating.abstract_factory.MazeFactory;
import com.tarasevich.nikolai.generating.entity.Direction;
import com.tarasevich.nikolai.generating.entity.Door;
import com.tarasevich.nikolai.generating.entity.Maze;
import com.tarasevich.nikolai.generating.entity.Room;
import com.tarasevich.nikolai.generating.singleton.SingletonMazeFactory;
import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class CreateMazeTest {

    @Test
    public void createMazeThroughMazeFactory() {
        AbstractFactory factory = SingletonMazeFactory.getInstance();

        Maze maze = createMaze(factory);
    }

    @Test
    public void createMazeThroughEnchantedFactory() {
        AbstractFactory factory = new EnchantedMazeFactory();

        Maze maze = createMaze(factory);
    }

    private Maze createMaze(AbstractFactory factory) {
        Maze maze = factory.makeMaze();

        Room room1 = factory.makeRoom(1);
        Room room2 = factory.makeRoom(2);
        Door door = factory.makeDoor(room1, room2);

        room1.setSide(Direction.NORTH, factory.makeWall());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, factory.makeWall());
        room1.setSide(Direction.WEST, factory.makeWall());

        room2.setSide(Direction.NORTH, factory.makeWall());
        room2.setSide(Direction.EAST, factory.makeWall());
        room2.setSide(Direction.SOUTH, factory.makeWall());
        room2.setSide(Direction.WEST, door);

        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }
}
