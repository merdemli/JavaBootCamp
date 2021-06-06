package io.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.northwind.business.abstracts.UserService;
import io.northwind.core.dataAccess.UserDao;
import io.northwind.core.entities.User;
import io.northwind.core.utilities.results.DataResult;
import io.northwind.core.utilities.results.Result;
import io.northwind.core.utilities.results.SuccessDataResult;
import io.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new  SuccessResult("kullanıcı db'ye  eklendi");
		
	}

	@Override
	public DataResult<User> findByemail(String email) {
		
		return new SuccessDataResult<User>(this.userDao.findByemail(email), "kullanıcı bulundu");
	}

}
