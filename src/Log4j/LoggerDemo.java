package Log4j;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoggerDemo 

{

	public Logger log = Logger.getLogger(LoggerDemo.class);
	@BeforeMethod
	public void loggerDebug()
	{
		log.debug("This is the debug log");
	}
	public void loggerError()
	{
		log.error("This is the log error message");
	}
	public void loggerFatal()
	{
		log.fatal("This is the fatal error occured during execution");
	}
	public void loggerWarn()
	{
		log.warn("This is the warning  message");
	}
	
	@Test
	public void loggerdemo()
	{
		loggerDebug();
		loggerError();
		loggerFatal();
		loggerWarn();
		
		
	}
}
