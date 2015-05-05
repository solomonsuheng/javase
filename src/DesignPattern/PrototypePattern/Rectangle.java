package DesignPattern.PrototypePattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
