package nLayeredRegisterationSytemSimulation.core.concrete;

import nLayeredRegisterationSytemSimulation.core.abstracts.RegisterService;
import nLayeredRegisterationSytemSimulation.entity.concrete.User;
import nLayeredRegisterationSytemSimulation.outSourceServices.GoogleAccountManager.GoogleManager;
import nLayeredRegisterationSytemSimulation.outSourceServices.GoogleAccountManager.UserForGoogleAccount;

public class GoogleAccountMailManagerAdapter implements RegisterService {

	@Override
	public User register(String mail, String password) 
	{
		
		GoogleManager googleManager = new GoogleManager();
		
		UserForGoogleAccount userForGoogle = googleManager.register(mail, password);
		
		User user = new User(userForGoogle.getFirstName(),userForGoogle.getLastName(),
				   userForGoogle.getEmail(),userForGoogle.getPassword());
		

		return user;
		
	}

	
	

}
