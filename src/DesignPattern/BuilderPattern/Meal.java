package DesignPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suheng on 15/5/5.
 */
//Create a Meal class having item objects defined above
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item :" + item.name());
            System.out.print(",Packing :" + item.packing().pack());
            System.out.println(", Price :" + item.price());
        }
    }
}
