package com.tere.logging.log4j;

import com.tere.logging.LogCreator;
import com.tere.logging.Logger;

public class Log4jCreator implements LogCreator
{

	@Override
	public Logger getlogger(String className)
	{
		Log4JLogger log4JLogger = null;
		try {
			log4JLogger = new Log4JLogger(Class.forName(className));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log4JLogger.setLoggingObject(org.apache.log4j.Logger.getLogger(className));
		
		return log4JLogger;
	}

}
