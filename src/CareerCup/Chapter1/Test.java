package CareerCup.Chapter1;

/**
 * Created by Suheng on 15/5/1.
 */
public class Test {
    public static void main(String[] args) {
        String str = "Hela";
        System.out.println(check(str));

    }

    private static boolean check(String str) {
        int[] check = new int[256];

        for (int i = 0; i < str.length(); i++) {
            if(check[((int)str.charAt(i))]++!=0){
                return false;
            }
        }

        return true;
    }
}
