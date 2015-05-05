package DesignPattern.BuilderPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
