package DesignPattern.AbstractFactoryPattern;

/**
 * Created by Suheng on 15/5/5.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
