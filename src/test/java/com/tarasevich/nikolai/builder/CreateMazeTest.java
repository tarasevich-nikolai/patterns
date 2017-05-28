package com.tarasevich.nikolai.builder;

import com.tarasevich.nikolai.generating.builder.MazeBuilder;
import com.tarasevich.nikolai.generating.builder.StandardMazeBuilder;
import com.tarasevich.nikolai.generating.entity.*;
import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class CreateMazeTest {

    @Test
    public void createMaze() {
        MazeBuilder mazeBuilder = new StandardMazeBuilder();

        mazeBuilder.buildMaze();
        mazeBuilder.buildRoom(0);
        mazeBuilder.buildRoom(1);
        mazeBuilder.buildDoor(0, 1);

        Maze maze = mazeBuilder.getMaze();
    }
}
