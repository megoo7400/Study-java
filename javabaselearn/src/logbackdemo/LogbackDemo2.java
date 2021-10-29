

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo2 {
    public static final Logger LOGGER = LoggerFactory.getLogger(LogbackDemo2.class);
    public static void main(String[] args) {
        try{
            LOGGER.debug("main方法开始执行了----");
            LOGGER.info("我开始记录第二行日志,要开始最除法");
            int a = 10;
            int b = 0;
            LOGGER.trace("a=", +a);     
            LOGGER.trace("a=", +b);     

            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("功能异常" + e);
        }

    }
}
