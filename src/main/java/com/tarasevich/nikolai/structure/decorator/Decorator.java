package com.tarasevich.nikolai.structure.decorator;

/**
 * @author nikolai.tarasevich
 */
public class Decorator implements VisualComponent {

    private VisualComponent visualComponent;

    public Decorator(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    @Override
    public void draw() {
        visualComponent.draw();
    }

    @Override
    public void resize() {
        visualComponent.resize();
    }
}
