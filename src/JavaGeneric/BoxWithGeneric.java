package JavaGeneric;

/**
 * Created by Suheng on 15/5/5.
 * <p/>
 * Generic version of the Box class.
 *
 * @param <T> the type of the value being boxed
 * <p/>
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */

/**
 * Generic version of the Box class.
 *
 * @param <T> the type of the value being boxed
 */

/**
 * By convention, type parameter names are single, uppercase letters.
 * This is stands in sharp contrast to the variable naming conentions that you already know about,
 * The most commonly used type parameter names are:
 * E - Element
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 * S,U,V etc. - 2nd,3rd,4th types
 * */
public class BoxWithGeneric<T> {
    //T stands for "Type"
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        BoxWithGeneric<Integer> b = new BoxWithGeneric<Integer>();
        b.setT(1);
        System.out.println(b.getT());
    }
}
