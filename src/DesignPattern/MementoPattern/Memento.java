package DesignPattern.MementoPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
