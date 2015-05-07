package DesignPattern.FlyweightPattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class FlyweightPatternDemo {
    //Use the factory to get object of concrete class by passing an information such as color
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};
    private static int randomX;
    private static String randomColor;

    public static void main(String[] args) {
        /**
         * We will demonstrate this pattern by drawing 20 circles of different locations but we will create only 5 objects
         * Only 5 colos are available so color property is used to check already existing Circle objects
         * */

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
