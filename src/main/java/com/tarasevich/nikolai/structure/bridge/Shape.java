package com.tarasevich.nikolai.structure.bridge;

/**
 * @author nikolai.tarasevich
 */
public class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
        this.color.applyColor();
    }
}
