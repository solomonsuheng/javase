package DesignPattern.TemplatePattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
