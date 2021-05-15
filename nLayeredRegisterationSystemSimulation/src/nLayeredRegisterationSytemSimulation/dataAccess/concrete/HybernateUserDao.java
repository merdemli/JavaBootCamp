package nLayeredRegisterationSytemSimulation.dataAccess.concrete;

import java.util.List;

import nLayeredRegisterationSytemSimulation.dataAccess.abstracts.UserDao;
import nLayeredRegisterationSytemSimulation.entity.concrete.User;

public class HybernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByid(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByMail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean emailIsAlreadyExist(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
