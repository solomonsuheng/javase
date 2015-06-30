package IntroductionToJavaProgramming.Chapter_18;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Suheng on 6/30/15.
 */
public class Problem_18_3 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage parameter for InputFile");
            System.exit(0);
        }

        double sum = 0;
        File sourceFile = new File(args[0]);

        DataInputStream inputStream = new DataInputStream(new FileInputStream(sourceFile));

        int r = 0;
        try {
            while ((r = inputStream.readInt()) != -1) {
                sum += r;
            }
        } catch (EOFException e) {

        }

        inputStream.close();
        System.out.println("The Sum of the numbers: " + sum);
    }
}
