package nLayeredRegisterationSytemSimulation.outSourceServices.jLogger.abstracts;

public abstract class BaseJLogger 
{
	protected String loggerName;
	
	public void log(String logMessage) 
	{
		System.out.println(loggerName+ " loglandý " +logMessage);
	}

}
