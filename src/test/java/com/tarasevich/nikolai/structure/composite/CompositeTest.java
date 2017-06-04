package com.tarasevich.nikolai.structure.composite;

import org.junit.Test;

/**
 * @author nikolai.tarasevich
 */
public class CompositeTest {

    @Test
    public void test() {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
