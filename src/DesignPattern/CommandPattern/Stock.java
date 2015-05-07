package DesignPattern.CommandPattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock Name" + name + ",Quantity: " + quantity + " Bought");
    }

    public void sell() {
        System.out.println("Stock Name" + name + ",Quantity: " + quantity + " Sold");
    }
}
