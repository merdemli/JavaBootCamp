package io.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import io.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	User findByemail(String email); //kontrol sağlanır 

}
