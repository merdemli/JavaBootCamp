package nLayeredRegisterationSytemSimulation.outSourceServices.GoogleAccountManager;

import java.util.ArrayList;
import java.util.List;



public class GoogleManager {
	
	static List<UserForGoogleAccount> usersGoogle;
	
	public GoogleManager() {
		usersGoogle = new ArrayList<UserForGoogleAccount>();
		
		usersGoogle.add(new UserForGoogleAccount("merve", "erdemli", "merveerdemli6@gmail.com", "123456"));
		usersGoogle.add(new UserForGoogleAccount("evrim", "erdemli", "evrimerdemli@gmail.com", "1234567"));
		usersGoogle.add(new UserForGoogleAccount("test3", "test3", "test3@test2.com", "123456"));
		usersGoogle.add(new UserForGoogleAccount("test4", "test4", "test4@test2.com", "1234567"));
	}
	
	public UserForGoogleAccount register(String mail, String password) 
	{
		
		UserForGoogleAccount userForGoogleAccount = this.usersGoogle.stream()
				                                    .filter((u)->u.getEmail()
				                                    .equals(mail)&& u.getPassword()
				                                    .equals(password))
												     .findFirst().orElse(null);
		
		return userForGoogleAccount;
	};

	
}
				
				