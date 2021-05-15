package nLayeredRegisterationSytemSimulation.bussiness.concrete;

import java.util.List;

import nLayeredRegisterationSytemSimulation.bussiness.abstracts.UserService;
import nLayeredRegisterationSytemSimulation.core.abstracts.JLoggerService;
import nLayeredRegisterationSytemSimulation.core.abstracts.JValidationService;
import nLayeredRegisterationSytemSimulation.dataAccess.abstracts.UserDao;
import nLayeredRegisterationSytemSimulation.entity.concrete.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private JLoggerService loggerService;
	private JValidationService validationService;;
	
	public UserManager(UserDao userDao, JLoggerService loggerService, JValidationService validationService) {
		super();
		this.userDao = userDao;
		this.loggerService = loggerService;
		this.validationService = validationService;
	}

	

	@Override
	public boolean add(User user) {
		
		boolean result= false;
		
		if (this.userDao.emailIsAlreadyExist(user))
		{
			if (validationService.isValidEmailFormat(user.getEmail())) 
			{
				if (validationService.isValidName(user.getFirstName())
						&& validationService.isValidSurName(user.getLastName())) {
					if (validationService.isValidPassword(user.getPassword())) {
						this.userDao.add(user); // InMemory Çalýþýlýyor
						System.out.println("Your registration has been successfully completed");
						this.loggerService.logEmail("Sisteme yeni kullanýcý eklendi");
						this.loggerService.logSms("Sisteme yeni kullanýcý eklendi");
						result = true;
						return result;
					} else {

						System.out.println("Your password must be at least 6 characters");
					}
				} else {

					System.out.println("Your name and lastname must consist of at least two letters ");
				}

			} else {
				System.out.println("Your eMail adress is not valid, please check your adress");
			}
		
		}else System.out.println("This e-mail address is used by another user");
		
		return result;
	}
	
	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user.getId());
		
	}

	@Override
	public User getById(int id) {
		
		return userDao.getByid(id);
	}

	@Override
	public List<User> getAll() {
	
		return userDao.getAll();
	}

	@Override
	public User getByMail(String mail) {
		
		return userDao.getByMail(mail);
	}

}
