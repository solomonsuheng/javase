package DesignPattern.NullObjectPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
