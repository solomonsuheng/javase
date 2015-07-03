package Test;

/**
 * Created by Suheng on 7/3/15.
 */
public class ShellSort {
    public static void main(String[] args) {
        Comparable[] ss = shellSort(4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 8, 4);
        for (Comparable s : ss) {
            System.out.println(s + " ");
        }
    }


    public static Comparable[] shellSort(Comparable... a) {
        int N = a.length;

        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(j, j - h, a);
                }
            }
            h = h / 3;
        }

        return a;
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
