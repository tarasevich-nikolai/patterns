package com.tarasevich.nikolai.factory_method;

import com.tarasevich.nikolai.generating.abstract_factory.AbstractFactory;
import com.tarasevich.nikolai.generating.abstract_factory.EnchantedMazeFactory;
import com.tarasevich.nikolai.generating.abstract_factory.MazeFactory;
import com.tarasevich.nikolai.generating.entity.Direction;
import com.tarasevich.nikolai.generating.entity.Door;
import com.tarasevich.nikolai.generating.entity.Maze;
import com.tarasevich.nikolai.generating.entity.Room;
import com.tarasevich.nikolai.generating.factory_method.BombedMazeGame;
import com.tarasevich.nikolai.generating.factory_method.EnchantedMazeGame;
import com.tarasevich.nikolai.generating.factory_method.MazeGame;
import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class CreateMazeTest {

    @Test
    public void createMazeThroughMazeGamey() {
        MazeGame mazeGame = new MazeGame();
        Maze maze = mazeGame.createNewMaze();
    }

    @Test
    public void createMazeThroughEnchantedMazeGame() {
        MazeGame mazeGame = new EnchantedMazeGame();
        Maze maze = mazeGame.createNewMaze();
    }

    @Test
    public void createMazeThroughBombedMazeGame() {
        MazeGame mazeGame = new BombedMazeGame();
        Maze maze = mazeGame.createNewMaze();
    }
}
