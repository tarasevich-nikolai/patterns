package com.tarasevich.nikolai.generating.abstract_factory;

import com.tarasevich.nikolai.generating.entity.*;
import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class CreateMazeTest {

    @Test
    public void createMazeThroughMazeFactory() {
        AbstractFactory factory = new MazeFactory();

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
