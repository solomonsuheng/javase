package DesignPattern.BridgePattern;

/**
 * Created by Suheng on 15/5/7.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
