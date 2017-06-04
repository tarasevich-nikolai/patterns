package com.tarasevich.nikolai.structure.decorator;

/**
 * @author nikolai.tarasevich
 */
public class TextView implements VisualComponent {
    @Override
    public void draw() {
        System.out.println("text view draw");
    }

    @Override
    public void resize() {
        System.out.println("text view resize");
    }
}
