package Test;

/**
 * Created by Suheng on 7/3/15.
 */
public class InsertionSort {
    public static void main(String[] args) {
        Comparable[] cc = insertionSort(2, 3, 4, 8, 7, 6, 5, 2, 1, 0, 9, 7, 3);
        for (Comparable c : cc) {
            System.out.print(c + " ");
        }
    }

    public static Comparable[] insertionSort(Comparable... arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(arrays[j], arrays[j - 1])) {
                    exch(j, j - 1, arrays);
                }else {
                    break;
                }
            }
        }
        return arrays;
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(int i, int j, Comparable... arrays) {
        Comparable swap = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = swap;
    }
}
