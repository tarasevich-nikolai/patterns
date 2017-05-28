package com.tarasevich.nikolai.structure.adapter;

/**
 * @author nikolai.tarasevich
 */
public interface Shape {

    void boundingBox(Point bottomLeft, Point bottomRight);

    Manipulator createManipulator();
}
