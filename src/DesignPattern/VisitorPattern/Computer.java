package DesignPattern.VisitorPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;


    public Computer() {
        this.parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
