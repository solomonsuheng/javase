package DesignPattern.ProxyPattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + this.fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading..." + this.fileName);
    }
}
