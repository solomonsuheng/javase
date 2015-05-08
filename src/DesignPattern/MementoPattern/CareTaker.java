package DesignPattern.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suheng on 5/8/15.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        this.mementoList.add(state);
    }

    public Memento get(int index) {
        return this.mementoList.get(index);
    }
}
