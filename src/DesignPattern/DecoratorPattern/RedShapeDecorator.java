package DesignPattern.DecoratorPattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class RedShapeDecorator extends ShapeDecorator {
    //create concrete decorator class extending the ShapeDecorator class
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        setRedBorder(this.decoratedShape);
    }

    public void setRedBorder(Shape redBorder) {
        System.out.println("Border Color:red");
    }
}
