package IntroductionToJavaProgramming.Chapter_8;

/**
 * Created by Suheng on 6/26/15.
 */
public class Demo1 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd'};
        String message = new String(charArray);
        String message2 = "abcd";
        System.out.println(message.equals(message2));
        String str1 = "asd";
        String str2 = "asd";

        System.out.println(str1 == str2);

        String str3 = new String("asd");

        String str4 = str2.intern();
        System.out.println(str3 == str1);
        System.out.println(str1 == str4);
        System.out.println(message);

        System.out.println("\n---分割线---");
        String strA = new String("ppp");
        String strB = "ppp";
        System.out.println(strA.intern() == strB);
    }
}
