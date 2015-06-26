package IntroductionToJavaProgramming.Chapter_9;

/**
 * Created by Suheng on 6/26/15.
 */
public class Demo {
    //当对象变成垃圾时候，finalize方法会被该对象的垃圾回收程序所调用。如果一个对象
    //不再能被访问，那么就变成了垃圾，默认情况下finalize
    public static void main(String[] args) {
        Cake a1 = new Cake(1);
        Cake a2 = new Cake(2);
        Cake a3 = new Cake(3);

        a2 = a3 = null;
        System.gc();
    }
}


