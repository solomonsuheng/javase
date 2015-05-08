package DesignPattern.ObserverPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(this.subject.getState()));
    }
}
