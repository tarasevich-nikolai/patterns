package com.tarasevich.nikolai.structure.decorator;

/**
 * @author nikolai.tarasevich
 */
public class BorderDecorator extends Decorator {

    public BorderDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    public void createBorder() {
        System.out.println("Create border");
    }
}
