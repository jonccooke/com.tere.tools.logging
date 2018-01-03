package com.tere.logging.log4j;


import org.apache.log4j.LogManager;

import com.tere.logging.Logger;

public class Log4JLogger extends Logger<org.apache.log4j.Logger>
{

	public Log4JLogger(Class clazz)
	{
		setLoggingObject(LogManager.getLogger(clazz));
	}
	@Override
	public void critical(String msg)
	{
		getLoggingObject().fatal(msg);
		
	}

	@Override
	public void debug(String msg)
	{
		getLoggingObject().debug(msg);
		
	}

	@Override
	public void error(String msg)
	{
		getLoggingObject().error(msg);
	}

	@Override
	public void info(String msg)
	{
		getLoggingObject().info(msg);
	}

	@Override
	public void throwing(String sourceClass, String sourceMethod,
			Throwable thrown)
	{
		//getLoggingObject().(msg);

		
	}

	@Override
	public void trace(String msg)
	{
		//getLoggingObject().trace(msg);
		
	}

	@Override
	public void warning(String msg)
	{
		getLoggingObject().warn(msg);
		
	}

}
