package DesignPattern.BridgePattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + "," + y + "]");
    }
}
