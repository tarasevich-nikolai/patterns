package com.tarasevich.nikolai.generating.builder;

import com.tarasevich.nikolai.generating.entity.Maze;

/**
 * @author nikolai.tarasevich
 */
public interface MazeBuilder {

    void buildMaze();

    void buildRoom(Integer roomNumber);

    void buildDoor(Integer roomFrom, Integer roomTo);

    Maze getMaze();
}
