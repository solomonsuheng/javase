package Test;

/**
 * Created by Suheng on 7/3/15.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Comparable[] ss = bubbleSort(5, 4, 3, 2, 6, 7, 8, 4, 3);
        for (Comparable s : ss) {
            System.out.print(s + " ");
        }
    }

    public static Comparable[] bubbleSort(Comparable... a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[i])) {
                    exch(i, j, a);
                }
            }
        }
        return a;
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(int i, int j, Comparable... a) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
