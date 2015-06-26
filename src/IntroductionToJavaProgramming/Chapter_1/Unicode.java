package IntroductionToJavaProgramming.Chapter_1;

/**
 * Created by Suheng on 6/26/15.
 */
public class Unicode {
    public static void main(String[] args) {
        for (int i = 0; i <= Integer.parseInt("FFFF", 16); i++) {
            StringBuffer str = new StringBuffer();
            str.append("\\u" + Integer.toHexString(i));
            System.out.print(unicode2String(str.toString()));
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static String unicode2String(String unicode) {
        StringBuffer str = new StringBuffer();
        String[] hex = unicode.split("\\\\u");

        for (int i = 1; i < hex.length; i++) {
            int data = Integer.parseInt(hex[i], 16);
            str.append((char) data);
        }

        return str.toString();
    }

    public static String string2Unicode(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append("\\u" + Integer.toHexString(c));
        }

        return sb.toString();
    }
}
