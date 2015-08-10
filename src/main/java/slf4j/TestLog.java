package slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Suheng on 8/8/15.
 */
public class TestLog {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(TestLog.class);
        logger.info("Hello World");
    }

}
