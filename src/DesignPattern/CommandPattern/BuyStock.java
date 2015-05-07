package DesignPattern.CommandPattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        this.abcStock.buy();
    }
}
