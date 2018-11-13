package main;

import constans.Constants;
// import log.AbstractLogger;
import log.NovaLog;

/**
 * Created by romelldominguez on 6/6/17.
 */
public class Main {

    // static AbstractLogger LOG = NovaLog.getChainOfLoggers(Main.class);

    static NovaLog Log = NovaLog.generateLog(Main.class);

    public static void main(String[] arg) {
        // LOG.logMessage(AbstractLogger.INFO, "This is an information.");

        // LOG.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

        // LOG.logMessage(AbstractLogger.ERROR, "This is an error information.");

        Constants.MODE_DEBUG = false;
        Log.error("This is an error information.");
        Log.debug("This is an debug level information.");
        Log.info("This is an information.");
        Constants.MODE_DEBUG = true;
        Log.error("This is an error information.");
        Log.debug("This is an debug level information.");
        Log.info("This is an information.");
    }
}
