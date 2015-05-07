package DesignPattern.ChainOfResponsibilityPattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class Consolelogger extends AbstractLogger {
    public Consolelogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
