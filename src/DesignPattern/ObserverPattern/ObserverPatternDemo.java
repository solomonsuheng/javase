package DesignPattern.ObserverPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Second state chage: 10");
        subject.setState(10);
    }
}
