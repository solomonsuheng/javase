package DesignPattern.BuilderPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
