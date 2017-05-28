package com.tarasevich.nikolai.structure.adapter;

/**
 * @author nikolai.tarasevich
 */
public class TextShape extends TextView implements Shape {

    public TextShape() {
    }

    @Override
    public void boundingBox(Point bottomLeft, Point bottomRight) {
        Coord x = new Coord(), y = new Coord(), width = new Coord(), heigth = new Coord();
        getOrigin(x, y);
        getExtent(width, heigth);
    }

    @Override
    public Manipulator createManipulator() {
        return new Manipulator(this);
    }
}
