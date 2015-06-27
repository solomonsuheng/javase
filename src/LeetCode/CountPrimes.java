package LeetCode;

/**
 * Created by Suheng on 6/27/15.
 */
public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(1500000));
    }

    public static int countPrimes2(int num) {
        int count = 0;

        for (int i = 2; i < num; i++) {
            if (isPrimes(i)) {
                System.out.print(i + " ");
                count++;
            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        return count;
    }

    public static int countPrimes(int num) {
        int count = 0;
        boolean[] flag = new boolean[num];
        for (int i = 2; i < num; i++) {
            if (isPrimes(i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrimes(int num) {
        boolean flag = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return flag;
    }
}
