package LeetCode;

import java.util.HashSet;

/**
 * Created by Suheng on 6/27/15.
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        containsDuplicate(1, 2, 3, 4, 5, 6, 6);
    }

    public static boolean containsDuplicate(int... nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) {
                return true;
            } else {
                hs.add(nums[i]);
            }
        }

        return false;
    }
}
