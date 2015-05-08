package DesignPattern.NullObjectPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
