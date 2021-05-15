package nLayeredRegisterationSytemSimulation.bussiness.concrete;

import nLayeredRegisterationSytemSimulation.bussiness.abstracts.LoginService;
import nLayeredRegisterationSytemSimulation.bussiness.abstracts.UserService;
import nLayeredRegisterationSytemSimulation.core.abstracts.EmailTransferService;
import nLayeredRegisterationSytemSimulation.core.abstracts.RegisterService;
import nLayeredRegisterationSytemSimulation.entity.concrete.User;

public class LoginManager implements LoginService

{
	private UserService userService;
	private EmailTransferService transferService;
	private RegisterService registerService;
	

	public LoginManager(UserService userService, EmailTransferService transferService,
			RegisterService registerService)
	
	{
		this.userService = userService;
		this.transferService = transferService;
		this.registerService = registerService;
	}
	

	@Override
	public void register(String firstName, String lastName, String email, String password)
	{
		
		if(userService.add(new User(firstName,lastName,email,password))){
			System.out.println("Register successful! Please verify your e-mail address with the link sent.");
			this.transferService.sendMail(email, email);
		}
		else
			
		{
			System.out.println(" Register failed! Please Check your information");
		}
		
			
	}

	@Override
	public void registerWithGoogle(String gMail, String password) {
		if(registerService.register(gMail, password)!=null) //user döner
		{
			
			userService.add(registerService.register(gMail, password));
			this.transferService.sendMail(gMail, gMail);
			System.out.println(" You have successfully registered to the system with Google Account ");
		}
		else System.out.println("There is no such user registered with Google.");
		
	}

	@Override
	public void login(String email, String password) 
	{
		
		if(this.userService.getByMail(email)!=null)
		{
			if(userService.getByMail(email).getEmail()==email && userService
					.getByMail(email).getPassword()==password)
			
			{
				
				System.out.println("Login successful");
			}else System.out.println("Your mail adress or password is not correct.Please check your informations");
			
		}
		else System.out.println("The user is not registred to the system");
		
	}

	@Override
	public void logOut() {
		System.out.println("Exit done !");
		
	}

}
