package nLayeredRegisterationSytemSimulation.bussiness.abstracts;


import java.util.List;

import nLayeredRegisterationSytemSimulation.entity.concrete.User;

public interface UserService {

	boolean add(User user); //Login manager'da if içinde kullanacaðýz
	void update(User user);
	void delete(User user);
	User getById(int id);
	List<User>getAll();
	User getByMail(String mail);//Login manager' da if içinde kullanacaðýz
	
}
