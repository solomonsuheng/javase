package DesignPattern.VisitorPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
