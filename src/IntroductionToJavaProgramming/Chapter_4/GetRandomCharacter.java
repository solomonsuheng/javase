package IntroductionToJavaProgramming.Chapter_4;

/**
 * Created by Suheng on 6/26/15.
 */
public class GetRandomCharacter {
    public static void main(String[] args) {
        System.out.println(getRandomCharacter());
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }


    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
