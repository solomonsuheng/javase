package DesignPattern.ChainOfResponsibilityPattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
