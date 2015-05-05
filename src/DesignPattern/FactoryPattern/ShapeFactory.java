package DesignPattern.FactoryPattern;

/**
 * Created by Suheng on 15/5/5.
 */

/**
 * Create a Factory to generate object of concrete class based on given information
 */
public class ShapeFactory {
    //use get Shape method to the object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}