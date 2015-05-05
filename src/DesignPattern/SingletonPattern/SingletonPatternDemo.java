package DesignPattern.SingletonPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal construct
        //Compile Time error
        SingleObject object = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();
        //show the message;
        object.showMessage();
        //they are same
        System.out.println(object == object2);
    }
}
