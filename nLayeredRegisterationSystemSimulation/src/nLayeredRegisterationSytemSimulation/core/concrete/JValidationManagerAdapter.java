package nLayeredRegisterationSytemSimulation.core.concrete;

import nLayeredRegisterationSytemSimulation.core.abstracts.JValidationService;
import nLayeredRegisterationSytemSimulation.outSourceServices.jValidation.concrete.JValidationRules;

public class JValidationManagerAdapter implements JValidationService{

	
	private JValidationRules jValidationRules;                 //global deðiþken
	
	public JValidationManagerAdapter()   
	{
		jValidationRules = new JValidationRules();           
	}
	
	
	@Override
	public boolean isValidName(String name)
	{
		boolean result = false;
		if(!jValidationRules.isContainDigit(name))             //gönderilen string deðer nümerik karekter içeriyor mu?										
		{	
			if(jValidationRules.isValidLength(name, 2)) 
			{
				return true;
				
			}
			else 
				System.out.println("Ýsim iki karekterden fazla olmalý!");
			
		}
		
		else 
		{
			System.out.println("Ýsminiz sadace harflerden oluþmalý!");
		}
		
		return result;
	}

	
	
	@Override
	public boolean isValidSurName(String surName) {
		
		boolean result = false;
		
		if(!jValidationRules.isContainDigit(surName))             //gönderilen string deðer nümerik karekter içeriyor mu?										
		{	
			if(jValidationRules.isValidLength(surName, 2)) 
			{
				return true;
				
			}
			else 
				System.out.println("Soyisminiz iki karekterden fazla olmalý!");
			
		}
		
		else 
		{
			System.out.println("Soyisminiz sadace harflerden oluþmalý!");
		}
		return result;
	}

	
	@Override
	public boolean isValidEmailFormat(String email) 
	{										
		if(jValidationRules.isValidForm(email, "([a-zA-Z0-9])+\\@([a-zA-Z0-9])+\\.[a-zA-Z]{2,}"))
		{                                           //regex control
		return true;
		}
		else
		{
			System.out.println("Email adresiniz geçerli deðildir");
		}
		
		return false;
	}
	
	
	@Override
	public boolean isValidPassword(String password) 
	{
		if(jValidationRules.isValidLength(password, 6)) 
		{
			return true;
		}
		else 
		{
			System.out.println("Þifreniz en az 6 karakterden oluþmalýdýr");
			return false;
		}
		
	}

}









