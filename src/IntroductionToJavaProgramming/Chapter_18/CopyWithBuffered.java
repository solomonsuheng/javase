package IntroductionToJavaProgramming.Chapter_18;

import java.io.*;

/**
 * Created by Suheng on 6/30/15.
 */
public class CopyWithBuffered {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage two parameter");
            System.exit(0);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("The source File not exists");
            System.exit(0);
        }

        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("The target File is exists");
            System.exit(0);
        }

        //Create buffered
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(targetFile));


        byte[] readByte = new byte[1024];
        int length = -1;

        while ((length = inputStream.read(readByte, 0, readByte.length)) != -1) {
            outputStream.write(readByte, 0, length);
            outputStream.flush();
        }

        inputStream.close();
        outputStream.close();
        System.out.println("Copy done");
    }
}
