package Test;

/**
 * Created by Suheng on 5/17/15.
 */
public class B extends A {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    swap(num, i, j);
                }
            }
        }
    }

    private static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[i] = temp;
    }
}
