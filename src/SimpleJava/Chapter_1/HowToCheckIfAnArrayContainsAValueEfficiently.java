package SimpleJava.Chapter_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * Created by Suheng on 5/10/15.
 */

/**
 * Four Different Ways to Check if an Array Contains A Value
 * <p/>
 * Actually, if you really need to check if a value is contained in some array/collection efficiently
 * A sorted list or three can do it in O(log(n)) or hashset can do it in O(1).
 */
public class HowToCheckIfAnArrayContainsAValueEfficiently {
    //Using List:
    public static boolean useList(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }

    //Using Set:
    public static boolean useSet(String[] arr, String targetValue) {
        return new HashSet<String>(Arrays.asList(arr)).contains(targetValue);
    }

    //Using a simple loop:
    public static boolean useLoop(String[] arr, String targetValue) {
        for (String s : arr) {
            if (s.equals(targetValue)) {
                return true;
            }
        }
        return false;
    }

    //Using Arrays.binarySearch():

    /**
     * The code below is wrong, it is listed here for completeness.
     * binarySearch() can ONLY be used on sorted arrays
     */
    public static boolean useArraysBinarySearch(String[] arr, String targetValue) {
        int a = Arrays.binarySearch(arr, targetValue);
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The approximate time cost can be measured by using the following code.
     * The basic idea is to search an array of size 5, 1K, 10K.
     * The approach may not be precise, but the idea is clear and simple.
     */
    public static void main(String[] args) {
        String[] arr2 = new String[]{"CD", "BC", "EF", "DE", "AB"};
        String[] arr = new String[1000];

        Random s = new Random();
        for (int i = 0; i < 1000; i++) {
            arr[i] = String.valueOf(s.nextInt());
        }

        //use list
        long startTime = System.nanoTime();//nanoTime for calculator times
        for (int i = 0; i < 100000; i++) {
            useList(arr, "A");
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("useList:" + duration / 1000000);

        //use set
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            useSet(arr, "A");
        }

        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useSet:" + duration / 1000000);

        //use loop
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            useLoop(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useLoop:" + duration / 1000000);

        //use Arrays.binarySearch()
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            useArraysBinarySearch(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useArrayBinary: " + duration / 1000000);
    }

}
