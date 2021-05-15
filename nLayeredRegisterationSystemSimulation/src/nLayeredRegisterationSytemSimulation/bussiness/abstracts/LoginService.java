package nLayeredRegisterationSytemSimulation.bussiness.abstracts;

public interface LoginService {
	void register(String firtName,String lastName,String email,String password);
	void registerWithGoogle(String gMail, String password);
	void login(String email, String password);
	void logOut();
	
	
	

}
