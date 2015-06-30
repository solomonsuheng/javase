package IntroductionToJavaProgramming.Chapter_18;

import java.io.*;

/**
 * Created by Suheng on 6/30/15.
 */
public class Problem_18_2 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage parameter for the output filename");
            System.exit(0);
        }

        File targetFile = new File(args[0]);
        DataOutputStream dataOutputStream = null;
        //check the file is exists

        if (targetFile.exists()) {
            //append
            dataOutputStream = new DataOutputStream(new FileOutputStream(targetFile, true));
        } else {
            dataOutputStream = new DataOutputStream(new FileOutputStream(targetFile));
        }


        for (int i = 0; i < 10; i++) {
            dataOutputStream.writeInt((int) (Math.random() * Integer.MAX_VALUE));
        }


        dataOutputStream.close();
        DataInputStream inputStream = new DataInputStream(new FileInputStream(targetFile));

        int r = 0;
        while ((r = inputStream.readInt()) != -1) {
            System.out.println(r);
        }
        inputStream.close();
    }
}
