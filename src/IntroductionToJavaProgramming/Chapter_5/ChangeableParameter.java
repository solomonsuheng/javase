package IntroductionToJavaProgramming.Chapter_5;

/**
 * Created by Suheng on 6/26/15.
 */
public class ChangeableParameter {
    public static void main(String[] args) {
        double[] d = {1, 2, 3, 4};
        printMax(d);
    }

    public static void printMax(double... num) {
        double max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }

        System.out.println("The max is : " + max);
    }
}
