package DesignPattern.DecoratorPattern;

/**
 * Created by Suheng on 15/5/7.
 */

//Create abstract decorator class implementing the Shape interface
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
    }
}
