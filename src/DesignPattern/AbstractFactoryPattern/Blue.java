package DesignPattern.AbstractFactoryPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
