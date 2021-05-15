package nLayeredRegisterationSytemSimulation.dataAccess.abstracts;



import java.util.List;

import nLayeredRegisterationSytemSimulation.entity.concrete.User;

public interface UserDao
{
	void add(User user);
	void update(User user);
	void delete(int id);
	List<User>getAll();
	User getByid(int userId);
	User getByMail(String email);
	boolean emailIsAlreadyExist(User user);
	
}
