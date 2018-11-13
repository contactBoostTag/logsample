package log;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(Class clazz,int level) {
        this.level = level;
        this.clazz = clazz.getSimpleName();
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::"+clazz+"::Logger: " + message);
    }
}