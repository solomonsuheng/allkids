package log4j;

import org.apache.log4j.Logger;

/**
 * Created by Suheng on 8/8/15.
 */
public class Bar {
    static Logger logger = Logger.getLogger(Bar.class);

    public void doIt() {
        logger.debug("Did it again!");
    }
}
