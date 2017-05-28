package com.tarasevich.nikolai.structure.adapter;

/**
 * @author nikolai.tarasevich
 */
public class Manipulator {

    private TextShape textShape;

    public Manipulator(TextShape textShape) {
        this.textShape = textShape;
    }

    public TextShape getTextShape() {
        return textShape;
    }
}
