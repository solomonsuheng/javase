package IntroductionToJavaProgramming.Chapter_6;

import java.util.Arrays;

/**
 * Created by Suheng on 6/26/15.
 */
public class ArraysDemo {
    public static void main(String[] args) {
        double[] numbers = {1, 3, 7, 6, 3, 9, 5, 4, 99};
        Arrays.sort(numbers);
        for (double i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + Arrays.binarySearch(numbers, 99));


        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};

        System.out.println(Arrays.equals(list1, list2));
        Arrays.fill(list1,1,1,10);
        for (double i : list1) {
            System.out.print(i + " ");
        }
    }
}
