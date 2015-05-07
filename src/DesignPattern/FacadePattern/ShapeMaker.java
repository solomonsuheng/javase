package DesignPattern.FacadePattern;

/**
 * Created by Suheng on 15/5/7.
 */

//create a facade class
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;


    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        this.circle.draw();
    }

    public void drawRectangle() {
        this.circle.draw();
    }

    public void drawSquare() {
        this.square.draw();
    }
}
