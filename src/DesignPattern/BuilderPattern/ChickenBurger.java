package DesignPattern.BuilderPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
