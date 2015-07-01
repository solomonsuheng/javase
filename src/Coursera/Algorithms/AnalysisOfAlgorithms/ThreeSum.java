package Coursera.Algorithms.AnalysisOfAlgorithms;

/**
 * Created by Suheng on 6/30/15.
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {30, -40, -20, -10, 40, 0, 10, 5};

        System.out.println(count(nums));

        long start = System.nanoTime();
        int b = 10 + 100;
        long end = System.nanoTime();
        System.out.println(end - start);
        char c = '个';
        System.out.println(c);
    }

    public static int count(int... nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        count++;
                    }
                }
            }
        }


        return count;
    }
}