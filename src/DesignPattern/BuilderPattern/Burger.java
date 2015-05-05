package DesignPattern.BuilderPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
