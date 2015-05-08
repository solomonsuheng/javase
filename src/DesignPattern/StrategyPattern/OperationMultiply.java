package DesignPattern.StrategyPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
