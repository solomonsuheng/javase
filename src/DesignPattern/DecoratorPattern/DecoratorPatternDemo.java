package DesignPattern.DecoratorPattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");

        circle.draw();

        System.out.println("\nCircle of red border");

        redCircle.draw();
    }
}
