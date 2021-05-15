package nLayeredRegisterationSytemSimulation.core.concrete;

import nLayeredRegisterationSytemSimulation.core.abstracts.JLoggerService;
import nLayeredRegisterationSytemSimulation.outSourceServices.jLogger.concrete.JEmailLogger;
import nLayeredRegisterationSytemSimulation.outSourceServices.jLogger.concrete.JSMSLogger;

public class JLoggerAdapter implements JLoggerService {

	@Override
	public void logEmail(String logMessage) 
	{
		 JEmailLogger emailLogger = new JEmailLogger();
		 emailLogger.log(logMessage);
		
	}

	@Override
	public void logSms(String logMessage) {
		new JSMSLogger().log(logMessage);
		
	}

}
