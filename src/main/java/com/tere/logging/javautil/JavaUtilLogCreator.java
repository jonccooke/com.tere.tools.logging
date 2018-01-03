package com.tere.logging.javautil;

import com.tere.logging.LogCreator;
import com.tere.logging.Logger;

public class JavaUtilLogCreator implements LogCreator
{

	@Override
	public Logger getlogger(String className)
	{
		JavaUtilLogger logger = new JavaUtilLogger();
		
		java.util.logging.Logger loggingObject = java.util.logging.Logger.getLogger(className);
		
		logger.setLoggingObject(loggingObject);
		
		return logger;
	}

}
