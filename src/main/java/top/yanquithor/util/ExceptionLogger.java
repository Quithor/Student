package top.yanquithor.util;

import org.slf4j.Logger;

public final class ExceptionLogger {
    
    private ExceptionLogger() {}
    
    public static void toLogger(Exception exception, Logger logger) {
        StringBuilder sb = new StringBuilder("\n");
        logger.error(exception.getMessage());
        for (StackTraceElement element : exception.getStackTrace()) {
            sb.append(element.toString()).append('\n');
        }
        logger.error(sb.toString());
    }
    
}
