package IntroductionToJavaProgramming.Chapter_9;

/**
 * Created by Suheng on 6/26/15.
 */
public class Cake {
    private int id;

    public Cake(int id) {
        this.id = id;
        System.out.println("Cake object " + this.id + " is created");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cake obeject " + this.id + " is disposed");
    }
}
