package DesignPattern.AbstractFactoryPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
