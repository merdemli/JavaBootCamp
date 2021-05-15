package nLayeredRegisterationSytemSimulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import nLayeredRegisterationSytemSimulation.bussiness.abstracts.LoginService;
import nLayeredRegisterationSytemSimulation.bussiness.abstracts.UserService;
import nLayeredRegisterationSytemSimulation.bussiness.concrete.LoginManager;
import nLayeredRegisterationSytemSimulation.bussiness.concrete.UserManager;
import nLayeredRegisterationSytemSimulation.core.concrete.EmailTransferManagerAdapter;
import nLayeredRegisterationSytemSimulation.core.concrete.GoogleAccountMailManagerAdapter;
import nLayeredRegisterationSytemSimulation.core.concrete.JLoggerAdapter;
import nLayeredRegisterationSytemSimulation.core.concrete.JValidationManagerAdapter;
import nLayeredRegisterationSytemSimulation.dataAccess.concrete.InMemoryUserDao;
import nLayeredRegisterationSytemSimulation.entity.concrete.User;

public class Main {

	public static void main(String[] args) 
	
	{
		
		
		
		UserManager managerr =new UserManager(new InMemoryUserDao(),new JLoggerAdapter(),new JValidationManagerAdapter());
		
		
		(managerr.getByMail("merveerdemli6@gmail.com")).getFirstName();
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
