package DesignPattern.VisitorPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
