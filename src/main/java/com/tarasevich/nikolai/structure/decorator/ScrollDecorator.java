package com.tarasevich.nikolai.structure.decorator;

/**
 * @author nikolai.tarasevich
 */
public class ScrollDecorator extends Decorator {
    public ScrollDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    public void createScroll() {
        System.out.println("Create scroll");
    }
}
