package DesignPattern.VisitorPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
