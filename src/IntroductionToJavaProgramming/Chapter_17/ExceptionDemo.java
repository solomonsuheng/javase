package IntroductionToJavaProgramming.Chapter_17;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Suheng on 6/26/15.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do {
            try {
                int number = sc.nextInt();
                System.out.println("The number entered is " + number);
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Try again:");
                sc.nextLine();
            }
        } while (flag);
    }
}
