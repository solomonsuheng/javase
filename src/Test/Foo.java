package Test;

/**
 * Created by Suheng on 5/17/15.
 */
public class Foo {
    String s = "abc";

    public Foo() {
        System.out.println("3");
    }

    static {
        System.out.println("1");
    }

    {

        System.out.println("2");
    }

    public static void main(String[] args) {
        new Foo();
        new Foo();
    }
}
