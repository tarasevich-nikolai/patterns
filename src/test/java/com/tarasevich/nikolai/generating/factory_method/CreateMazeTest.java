package com.tarasevich.nikolai.generating.factory_method;

import com.tarasevich.nikolai.generating.entity.Maze;
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
