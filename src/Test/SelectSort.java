package Test;

/**
 * Created by Suheng on 7/3/15.
 */
public class SelectSort {
    public static void main(String[] args) {
        Comparable[] nums = {1, 2, 8, 6, 5, 4, 3, 2, 4, 6, 7, 8};
        Comparable[] array = selectSort(nums);
        for (Comparable a : array) {
            System.out.print(a + " ");
        }
    }


    public static Comparable[] selectSort(Comparable... arrays) {
        for (int i = 0; i < arrays.length; i++) {
            int min = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (less(arrays[j], arrays[min])) {
                    min = j;
                }
            }
            exch(i, min, arrays);
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
