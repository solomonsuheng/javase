package DesignPattern.BridgePattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        this.drawAPI.drawCircle(radius, x, y);
    }
}
