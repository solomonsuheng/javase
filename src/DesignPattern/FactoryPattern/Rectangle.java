package DesignPattern.FactoryPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
