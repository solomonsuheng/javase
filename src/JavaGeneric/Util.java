package JavaGeneric;

/**
 * Created by Suheng on 15/5/5.
 */

/**
 * Generic Methods
 * The Util class includes a generic method, compare, which compares two Pair objects:
 */
public class Util {
    public static <K, V> boolean compare(PairClass<K, V> p1, PairClass<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {
        PairClass<Integer, String> p1 = new PairClass<Integer, String>(1, "apple");
        PairClass<Integer, String> p2 = new PairClass<Integer, String>(1, "apple");
        boolean same = Util.compare(p1, p2);
        System.out.println(same);

    }
}
