package com.tere.logging.javautil;

import com.tere.logging.Logger;

public class JavaUtilLogger extends Logger<java.util.logging.Logger>
{

	@Override
	public void critical(String msg)
	{
		getLoggingObject().severe(msg);
	}

	@Override
	public void debug(String msg)
	{
		getLoggingObject().fine(msg);

	}

	@Override
	public void error(String msg)
	{
		getLoggingObject().severe(msg);

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
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String msg)
	{
		getLoggingObject().finer(msg);


	}

	@Override
	public void warning(String msg)
	{
		getLoggingObject().warning(msg);

	}

}
