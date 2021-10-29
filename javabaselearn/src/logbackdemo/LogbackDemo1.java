
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;



public class LogbackDemo1 {
    private static Logger log = LoggerFactory.getLogger(LogbackDemo1.class);
    public static void main(String[] args) {
       log.trace("============跟踪");
       log.debug("============调试");
       log.info("msg");
       log.warn("msg");
       log.error("============错误");

       // print intenal state
       LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
       StatusPrinter.print(lc);
    }
}
