package log;

import constans.Constants;

/**
 * Created by romelldominguez on 6/6/17.
 */
public class NovaLog {

    private static AbstractLogger getChainOfLoggers(Class clazz) {

        AbstractLogger errorLogger = new ErrorLogger(clazz, AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(clazz, AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(clazz, AbstractLogger.INFO);

        // if (Constants.MODE_DEBUG == true) {
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        // }

        return errorLogger;
    }

    public void error(String meessage) {
        abstractLogger.logMessage(AbstractLogger.ERROR, meessage);
    }

    public void debug(String meessage) {
        abstractLogger.logMessage(AbstractLogger.DEBUG, meessage);
    }

    public void info(String meessage) {
        abstractLogger.logMessage(AbstractLogger.INFO, meessage);
    }

    private NovaLog(Class clazz) {
        abstractLogger = getChainOfLoggers(clazz);
    }

    static AbstractLogger abstractLogger;

    public static NovaLog generateLog(Class mainClass) {
        return new NovaLog(mainClass);
    }
}
