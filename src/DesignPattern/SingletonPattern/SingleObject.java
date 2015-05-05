package DesignPattern.SingletonPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject() {
    }

    //Get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, World!");
    }
}
