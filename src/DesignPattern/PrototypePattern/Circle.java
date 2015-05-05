package DesignPattern.PrototypePattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class Circle extends Shape {

    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
