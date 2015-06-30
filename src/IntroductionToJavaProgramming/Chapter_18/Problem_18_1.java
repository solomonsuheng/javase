package IntroductionToJavaProgramming.Chapter_18;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Suheng on 6/30/15.
 */

//创建一个文本
public class Problem_18_1 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage a parameter to the outputFile");
            System.exit(0);
        }

        File targetFile = new File(args[0]);

        PrintWriter output = new PrintWriter(targetFile);

        for (int i = 1; i <= 10000; i++) {
            output.print((int) (Math.random() * (Integer.MAX_VALUE - 0)) + " ");
            if (i % 10 == 0) {
                output.print("\n");
            }
        }

        output.close();
    }
}
