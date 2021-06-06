package io.northwind.api.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import io.northwind.business.abstracts.UserService;
import io.northwind.core.entities.User;
import io.northwind.core.utilities.results.ErrorDataResult;
import io.northwind.core.utilities.results.Result;

@RestController
@RequestMapping(value = "/api/users")
public class UsersController {
	
	@Autowired
	private UserService userService;

	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@PostMapping(value = "/api/add")
	public ResponseEntity<?> add(@Valid @RequestBody User user) {//user kullanıcıdan alınır ve datayı body'den oku diyoruz
		return ResponseEntity.ok(this.userService.add(user));
	}
	
	
	//AOP: global exception handler 
	
	                                                   //typeOf
	@ExceptionHandler(MethodArgumentNotValidException.class) //springValidation'dan gelir 
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors = new  HashMap<String, String>();
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
			
		}
		ErrorDataResult<Object>errors = new ErrorDataResult<Object>(validationErrors,"Doğrulama Hataları" );
		return errors;
	}  
	 
	
	//tüm metotlar buradan geçer
	
	//döneceği nesnenin türü her şey olabilir ; object;tüm class'ların temelidir
	
	//.ok 200 döndürür,ne döneceğine işlem sonucuna göre ekleriz, error veya susccess döner ona göre
	//?: unkonown : ne verirsen onu döner
	
	 //200
	//300
   //400
  //500
	

}
