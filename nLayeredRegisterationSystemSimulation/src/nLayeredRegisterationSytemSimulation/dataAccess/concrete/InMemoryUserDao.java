package nLayeredRegisterationSytemSimulation.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import nLayeredRegisterationSytemSimulation.dataAccess.abstracts.UserDao;
import nLayeredRegisterationSytemSimulation.entity.concrete.User;
import nLayeredRegisterationSytemSimulation.outSourceServices.GoogleAccountManager.UserForGoogleAccount;

public class InMemoryUserDao implements UserDao  

{
	public List<User> users;
	
	public InMemoryUserDao() 
	{
		users= new ArrayList<User>();	
		users.add(new User("merve", "erdemli", "merveerdemli6@gmail.com", "123456"));
		users.add(new User("evrim", "aslý", "evrim@gmail.com", "test3456"));
	}
	
	
	
	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Saved to DB : "+user.getFirstName()+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		User userToUpdate = users.stream()
							.filter(u->u.getId()==user.getId())
							.findFirst().orElse(null);
		
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		
		
	}

	@Override
	public void delete(int userId) {
		User userToDelete = users.stream()
				.filter(u->u.getId()==userId)
				.findFirst().orElse(null);
		
		this.users.remove(userToDelete);
		
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	@Override
	public User getByid(int userId) {
		User user =users.stream().filter(u->u.getId()==userId).findFirst().orElse(null);
		return user;
		
	}

	@Override
	public User getByMail(String email) {
		User user =users.stream().filter(u->u.getEmail()==email).findFirst().orElse(null);
		return user;
	}



	@Override
	public boolean emailIsAlreadyExist(User user)
	{
		
		for(User person:users) 
		{
			if(getByMail(person.getEmail())==user) 
				System.out.println("Bu eMail adresi baþka bir kullanýcý tarafýndan kullanýlmaktadýr");
				break; //döngüyü kýrar
		} return false;
		
	}

}
