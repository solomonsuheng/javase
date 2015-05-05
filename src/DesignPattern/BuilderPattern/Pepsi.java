package DesignPattern.BuilderPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
