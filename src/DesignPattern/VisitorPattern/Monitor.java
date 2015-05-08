package DesignPattern.VisitorPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class Monitor implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
