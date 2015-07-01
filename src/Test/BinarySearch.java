package Test;

/**
 * Created by Suheng on 7/1/15.
 */
public class BinarySearch {
    public static int binarySearch(int key, int... nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (key < nums[mid]) {
                high = mid - 1;
            } else if (key > nums[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

}
