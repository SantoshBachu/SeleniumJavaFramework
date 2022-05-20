package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
	
		System.out.println("\n    Hello World....!    \n");
		logger.trace("This is an trace message");
		logger.info("This is info message");
		logger.error("This is an error message" );
		logger.warn("This is warrning message");
		logger.fatal("This is fatal message");
		
		System.out.println("\n   Completed   ");
		

	}

}
