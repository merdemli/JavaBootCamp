package nLayeredRegisterationSytemSimulation;

import nLayeredRegisterationSytemSimulation.bussiness.abstracts.LoginService;
import nLayeredRegisterationSytemSimulation.bussiness.concrete.LoginManager;
import nLayeredRegisterationSytemSimulation.bussiness.concrete.UserManager;
import nLayeredRegisterationSytemSimulation.core.concrete.EmailTransferManagerAdapter;
import nLayeredRegisterationSytemSimulation.core.concrete.GoogleAccountMailManagerAdapter;
import nLayeredRegisterationSytemSimulation.core.concrete.JLoggerAdapter;
import nLayeredRegisterationSytemSimulation.core.concrete.JValidationManagerAdapter;
import nLayeredRegisterationSytemSimulation.dataAccess.concrete.InMemoryUserDao;


public class Main {

	public static void main(String[] args) 
	
	{

		
		LoginService manager = new LoginManager(
				new UserManager(new InMemoryUserDao(), new JLoggerAdapter(), new JValidationManagerAdapter()),
				new EmailTransferManagerAdapter(), new GoogleAccountMailManagerAdapter());

//		manager.login("merveerdemli6@gmail.com", "123456");
//
//		manager.register("ayse", "fatma", "aysefatma@gmail.com", "856478");
//
//		manager.registerWithGoogle("merveerdemli6@gmail.com", "123456");
//		manager.login("aylin@gmail.com", "859746");
//		// The user is not registred to the system
//
//		manager.register("ahmet", "aslan", "ahmetaysefatma", "897895");
//		// Your eMail adress is not valid, please check your adress
//		// Register failed! Please Check your information
//
//		manager.register("ahmet", "aslan", "ahmetaysefatma@gmail.com", "89");
//		// Your password must be at least 6 characters
//		// Register failed! Please Check your information
//
//		manager.register("merve", "erdemli", "merveerdemli6@gmail.com", "123456");
//		// This e-mail address is used by another user
//		// Register failed! Please Check your information
//		
//		Scanner oku = new Scanner(System.in);
//		System.out.println("isim: ");
//		String name = oku.nextLine();
//
//		System.out.println("Soyisim: ");
//		String lastName = oku.nextLine();
////		
//		System.out.println("Mail: ");
//		String email = oku.nextLine();
//		
//		System.out.println("Þifre: ");
//		String password = oku.nextLine();
//		 
			
		
		manager.registerWithGoogle("ipekaslann@gmail.com", "48597456");
	

	}

}
