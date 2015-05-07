package DesignPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suheng on 15/5/7.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        this.orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : this.orderList) {
            order.execute();
        }
        this.orderList.clear();
    }

}
