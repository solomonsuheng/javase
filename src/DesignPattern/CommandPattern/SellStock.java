package DesignPattern.CommandPattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        this.abcStock.sell();
    }
}
