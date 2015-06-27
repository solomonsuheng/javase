package LeetCode;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Suheng on 6/27/15.
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 5, 6, 6, 7, 7};
        singleNumber(nums);
    }

    public static int singleNumber(int... nums) {
        int singleNum = -1;
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            int temp = nums[i];
            if (ht.containsKey(nums[i])) {
                int count = ht.get(nums[i]);
                ht.put(nums[i], ++count);
            } else {
                ht.put(nums[i], 1);
            }
        }


        Set<Integer> ks = ht.keySet();
        Iterator<Integer> it = ks.iterator();
        while (it.hasNext()) {
            int key = it.next();
            System.out.print(key + " ");
            int c = ht.get(key);
            if (c == 1) {
                return key;
            }
        }

        return singleNum;
    }
}
