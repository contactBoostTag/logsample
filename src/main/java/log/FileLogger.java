package log;

public class FileLogger extends AbstractLogger {

    public FileLogger(Class clazz,int level) {
        this.level = level;
        this.clazz = clazz.getSimpleName();
    }

    @Override
    protected void write(String message) {
        System.out.println("File::"+clazz+"::Logger: " + message);
    }
}