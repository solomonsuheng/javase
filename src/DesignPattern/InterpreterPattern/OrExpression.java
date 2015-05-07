package DesignPattern.InterpreterPattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class OrExpression implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return this.expression1.interpret(context) || expression2.interpret(context);
    }
}
