package IntroductionToJavaProgramming.Chapter_24;

/**
 * Created by Suheng on 6/7/15.
 */
public class TaskThreadDemo {
    public static void main(String[] args) {
        //Create task
        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);
        Runnable print100 = new PrintNum(100);

        //Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        //start threads
        thread1.start();
        thread2.start();
        thread3.start();

    }
}


class PrintChar implements Runnable {
    //Data field
    private char charToPrint;
    private int times;

    //Construct a task with specified character and number of times to print the character
    public PrintChar(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    /**
     * Override the run() method to tell the system
     * what the task to perform
     */
    @Override
    public void run() {
        for (int i = 0; i < this.times; i++) {
            System.out.println(this.charToPrint);
        }
    }
}

class PrintNum implements Runnable {
    //Data fields
    private int lastNum;

    //Construct a task with times
    public PrintNum(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= this.lastNum; i++) {
            System.out.println(" " + i);
        }
    }
}