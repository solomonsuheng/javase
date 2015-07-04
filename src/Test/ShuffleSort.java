package Test;

/**
 * Created by Suheng on 7/3/15.
 */
public class ShuffleSort {
    public static void main(String[] args) {
        int[] card = new int[52];
        for (int i = 0; i < card.length; i++) {
            card[i] = i + 1;
        }
        for (int i : card) {
            System.out.print(i + " \t");
        }


        System.out.println();
        card = knuthShuffle(card);
        for (int i : card) {
            System.out.print(i + " \t");
        }
    }

    public static int[] knuthShuffle(int... nums) {

        for (int i = 0; i < nums.length; i++) {
            int r = (int) (Math.random() * i);
            exch(nums, i, r);
        }

        return nums;
    }

    public static void exch(int[] a, int i, int r) {
        int swap = a[i];
        a[i] = a[r];
        a[r] = swap;
    }
}

