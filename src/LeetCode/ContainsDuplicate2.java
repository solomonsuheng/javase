package LeetCode;

/**
 * Created by Suheng on 6/27/15.
 */
public class ContainsDuplicate2 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(1, 1, 1, 1, 6, 5, 0, 9, 1));
    }

    public static boolean containsNearbyDuplicate(int k, int... nums) {


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && (j - i) <= k; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }

        }
        return false;
    }

}
