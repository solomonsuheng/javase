package IntroductionToJavaProgramming.Chapter_18;

import java.io.*;


/**
 * Created by Suheng on 6/30/15.
 */
public class Copy {
    /**
     * Main Method
     *
     * @param args[0] for source file
     * @param args[1] for target file
     */

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage: java CopyFile sourceFile targetfile");
            System.exit(0);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file" + args[0] + " not exists");
            System.exit(0);
        }

        //Check if the target file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("target file " + args[1] + " exists");
            System.exit(0);
        }

        //Create an inputStream
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));

        //Create an outputStream
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));

        //Display the file size
        System.out.println("The file" + args[0] + " has " + input.available() + " bytes");


        //Continuously read a byte from input and write it to output
        int r = -1;
        while ((r = input.read()) != -1) {
            output.write((byte) r);
        }
        input.close();
        output.close();

        System.out.println("Copy Done");
    }
}
