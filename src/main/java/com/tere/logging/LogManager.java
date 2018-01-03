package com.tere.logging;

import java.util.LinkedHashMap;
import java.util.Map;

import com.tere.logging.log4j.Log4jCreator;


public class LogManager
{
	private static LogCreator logCreator = new Log4jCreator();
	private static Map<String, Logger> loggersMap = new LinkedHashMap<String, Logger>();
	
	public static LogCreator getLogCreator()
	{
		return logCreator;
	}

	public static void setLogCreator(LogCreator logCreator)
	{
		LogManager.logCreator = logCreator;
	}

	public static Logger getLogger(String className)
	{
		
		Logger logger = loggersMap.get(className);
		
		if (null == logger)
		{
			logger = logCreator.getlogger(className);
		}
		loggersMap.put(className, logger);
		
		return logger;
	}

	public static Logger getLogger(Class clazz)
	{
		
		Logger logger = loggersMap.get(clazz.getName());
		
		if (null == logger)
		{
			logger = logCreator.getlogger(clazz.getName());
		}
		loggersMap.put(clazz.getName(), logger);
		
		return logger;
	}

}
