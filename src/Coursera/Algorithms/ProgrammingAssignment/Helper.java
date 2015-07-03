package Coursera.Algorithms.ProgrammingAssignment;

/**
 * Created by Suheng on 7/2/15.
 */
public class Helper {
    public static void main(String[] args) {
        System.out.println(isSorted(12, 3, 4, 5, 4, 3));
        System.out.println(isSorted(1, 3, 4, 5, 6, 13));
        System.out.println(isSorted(12, 3, 4, 5, 4, 13));
    }


    public static boolean isSorted(Comparable... a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

}

