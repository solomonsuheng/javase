package DesignPattern.StatePattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class Context {
    private State state;


    public Context() {
        this.state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}
