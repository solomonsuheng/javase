package DesignPattern.PrototypePattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class Square extends Shape {
    public Square() {
        this.type = "Square";
    }


    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
