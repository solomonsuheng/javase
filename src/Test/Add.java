package Test;

/**
 * Created by Suheng on 5/17/15.
 */
public class Add extends Thread {
    int value;

    public void run() {
        this.value = 1 + 2;
    }

}
