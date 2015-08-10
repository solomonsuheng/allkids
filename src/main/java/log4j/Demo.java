package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by Suheng on 8/7/15.
 */
public class Demo {
    static Logger logger = Logger.getLogger(Demo.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        logger.error("Enter application");
        Bar b = new Bar();
        b.doIt();
        logger.info("Exiting application");
    }
}
