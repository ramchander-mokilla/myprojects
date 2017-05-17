import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j_Class_1 {
	
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("Log4j_Class_1");
		PropertyConfigurator.configure("C:\\Users\\Mokilla-Win7\\workspace\\Log4j\\log4j.properties");
		logger.debug("This is Debug message");
		logger.info("This is Info message");
		logger.warn("This is warning message");
		logger.error("This is error message");
		logger.fatal("This is Fatal message");
	}

}
