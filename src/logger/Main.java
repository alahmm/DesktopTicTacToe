package logger;

import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.log(Level.WARNING, "Hello " + logger.getName());
    }
}

/**
 * more methods
 */
class Main1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger( Main.class.getName());
        logger.severe("Severe Log");
        logger.warning("Warning Log");
        logger.info("Info Log");
    }
}
/**
 * handlers and formatters
 */
class Main2 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Main.class.getName());
        Handler fileHandler = new FileHandler("default.log");
        logger.addHandler(fileHandler);
        fileHandler.setFormatter(new XMLFormatter());
        logger.info("Info log message");
    }
}
/**
 * filter
 */
class FilterExample implements Filter {
    public boolean isLoggable(LogRecord record) {
        if (record.getLevel() != Level.INFO) {
            return false;
        }
        return true;
    }
}
// to test it
class Main4 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger( Main.class.getName());
        Filter filter = new FilterExample();
        logger.setFilter(filter);
        logger.severe("Severe Log");
        logger.info("Info Log");
        logger.warning("Warning Log");
    }
}