package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suheng on 5/8/15.
 */
public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        this.observerList.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : this.observerList) {
            observer.update();
        }
    }

}
