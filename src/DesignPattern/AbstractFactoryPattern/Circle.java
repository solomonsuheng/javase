package DesignPattern.AbstractFactoryPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
