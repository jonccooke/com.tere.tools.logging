package com.tere.logging;

public abstract class Logger<T>
{
	private T loggingObject;
	private String keyValueDelimer = ":";
	private String endDelimer = ",";
//	// Log a MAX_DEBUG message.
//	abstract public void getLogger(String msg);

	protected String structuredString(String key, Object value)
	{
		StringBuffer buf = new StringBuffer();
		buf.append(key);
		buf.append(keyValueDelimer);
		buf.append(value.toString());
		//buf.append(endDelimer);
		return buf.toString().trim();
	}

	protected String formatString(String fmt, Object... args)
	{
		return String.format(fmt, args);
	}

	// Log a MAX_DEBUG message.
	abstract public  void trace(String msg);

	public  void trace(String fmt, Object... args)
	{
		trace(formatString(fmt, args));
	}

	public  void traceS(String key, Object value)
	{
		trace(structuredString(key, value));
	}

	// Log a DEBUG message.
	public abstract  void debug(String msg);

	public  void debug(String fmt, Object... args)
	{
		debug(formatString(fmt, args));
	}

	public  void debugS(String key, Object value)
	{
		debug(structuredString(key, value));
	}

	// Log throwing an exception.
	abstract public  void throwing(String sourceClass, String sourceMethod, Throwable thrown);

	// Log an INFO message.
	abstract public  void info(String msg);

	public  void info(String fmt, Object... args)
	{
		info(formatString(fmt, args));
	}

	public  void infoS(String key, Object value)
	{
		info(structuredString(key, value));
	}

	// Log a WARNING message.}
	abstract public  void warning(String msg);

	public  void warning(String fmt, Object... args)
	{
		warning(formatString(fmt, args));
	}


	public  void warningS(String key, Object value)
	{
		warning(structuredString(key, value));
	}

	// Log a ERROR message.
	abstract public  void error(String msg);

	public  void error(String fmt, Object... args)
	{
		error(formatString(fmt, args));
	}


	public  void errorS(String key, Object value)
	{
		error(structuredString(key, value));
	}

	public  void error(Throwable throwable)
	{
		StackTraceElement elements[] = throwable.getStackTrace();
		StringBuffer buffer = new StringBuffer(throwable.getClass().getCanonicalName());
		buffer.append(" : ");
		buffer.append(throwable.getMessage());
		buffer.append("\n");
		for (StackTraceElement element : elements)
		{
			buffer.append("\t at ");
			buffer.append(element.toString());
			buffer.append("\n");
		}
		error(buffer.toString());
	}

	// Log a CRITICAL message.
	abstract public  void critical(String msg);

	public  void critical(String fmt, Object... args)
	{
		trace(formatString(fmt, args));
	}

	public  void criticalS(String key, Object value)
	{
		error(structuredString(key, value));
	}


	protected T getLoggingObject()
	{
		return loggingObject;
	}

	public void setLoggingObject(T loggingObject)
	{
		this.loggingObject = loggingObject;
	}

}
// Add a log Handler to receive logging messages.
// void addHandler(Handler handler);
// static Logger getAnonymousLogger()
// Create an anonymous Logger.
// static Logger getAnonymousLogger(String resourceBundleName)
// Create an anonymous Logger.
// Filter getFilter()
// Get the current filter for this Logger.
// Handler[] getHandlers()
// Get the Handlers associated with this logger.
// Level getLevel()
// Get the log Level that has been specified for this Logger.
// static Logger getLogger(String name)
// Find or create a logger for a named subsystem.
// static Logger getLogger(String name, String resourceBundleName)
// Find or create a logger for a named subsystem.
// String getName()
// Get the name for this logger.
// Logger getParent()
// Return the parent for this Logger.
// ResourceBundle getResourceBundle()
// Retrieve the localization resource bundle for this logger for the current
// default locale.
// String getResourceBundleName()
// Retrieve the localization resource bundle name for this logger.
// boolean getUseParentHandlers()
// Discover whether or not this logger is sending its output to its parent
// logger.
// void info(String msg)
// Log an INFO message.
// boolean isLoggable(Level level)
// Check if a message of the given level would actually be logged by this
// logger.
// void log(Level level, String msg)
// Log a message, with no arguments.
// void log(Level level, String msg, Object param1)
// Log a message, with one object parameter.
// void log(Level level, String msg, Object[] params)
// Log a message, with an array of object arguments.
// void log(Level level, String msg, Throwable thrown)
// Log a message, with associated Throwable information.
// void log(LogRecord record)
// Log a LogRecord.
// void logp(Level level, String sourceClass, String sourceMethod, String msg)
// Log a message, specifying source class and method, with no arguments.
// void logp(Level level, String sourceClass, String sourceMethod, String msg,
// Object param1)
// Log a message, specifying source class and method, with a single object
// parameter to the log message.
// void logp(Level level, String sourceClass, String sourceMethod, String msg,
// Object[] params)
// Log a message, specifying source class and method, with an array of object
// arguments.
// void logp(Level level, String sourceClass, String sourceMethod, String msg,
// Throwable thrown)
// Log a message, specifying source class and method, with associated Throwable
// information.
// void logrb(Level level, String sourceClass, String sourceMethod, String
// bundleName, String msg)
// Log a message, specifying source class, method, and resource bundle name with
// no arguments.
// void logrb(Level level, String sourceClass, String sourceMethod, String
// bundleName, String msg, Object param1)
// Log a message, specifying source class, method, and resource bundle name,
// with a single object parameter to the log message.
// void logrb(Level level, String sourceClass, String sourceMethod, String
// bundleName, String msg, Object[] params)
// Log a message, specifying source class, method, and resource bundle name,
// with an array of object arguments.
// void logrb(Level level, String sourceClass, String sourceMethod, String
// bundleName, String msg, Throwable thrown)
// Log a message, specifying source class, method, and resource bundle name,
// with associated Throwable information.
// void removeHandler(Handler handler)
// Remove a log Handler.
// void setFilter(Filter newFilter)
// Set a filter to control output on this Logger.
// void setLevel(Level newLevel)
// Set the log level specifying which message levels will be logged by this
// logger.
// void setParent(Logger parent)
// Set the parent for this Logger.
// void setUseParentHandlers(boolean useParentHandlers)
// Specify whether or not this logger should send its output to it's parent
// Logger.
// void severe(String msg)
// Log a SEVERE message.
// void throwing(String sourceClass, String sourceMethod, Throwable thrown)
// Log throwing an exception.
// void warning(String msg)
// Log a WARNING message.}
