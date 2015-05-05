package DesignPattern.BuilderPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
