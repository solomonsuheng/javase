package JavaGeneric;

/**
 * Created by Suheng on 15/5/5.
 */
public class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }


    @Override
    public K getKey() {
        return this.key;

    }

    @Override
    public V getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Event", 8);
        Pair<String, BoxWithGeneric<Integer>> p = new OrderedPair<String, BoxWithGeneric<Integer>>("S", new BoxWithGeneric<Integer>());

    }
}
