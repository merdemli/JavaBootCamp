package nLayeredRegisterationSytemSimulation.core.concrete;

import nLayeredRegisterationSytemSimulation.core.abstracts.JValidationService;
import nLayeredRegisterationSytemSimulation.outSourceServices.jValidation.concrete.JValidationRules;

public class JValidationManagerAdapter implements JValidationService{

	
	private JValidationRules jValidationRules;                 //global de�i�ken
	
	public JValidationManagerAdapter()   
	{
		jValidationRules = new JValidationRules();           
	}
	
	
	@Override
	public boolean isValidName(String name)
	{
		boolean result = false;
		if(!jValidationRules.isContainDigit(name))             //g�nderilen string de�er n�merik karekter i�eriyor mu?										
		{	
			if(jValidationRules.isValidLength(name, 2)) 
			{
				return true;
				
			}
			else 
				System.out.println("�sim iki karekterden fazla olmal�!");
			
		}
		
		else 
		{
			System.out.println("�sminiz sadace harflerden olu�mal�!");
		}
		
		return result;
	}

	
	
	@Override
	public boolean isValidSurName(String surName) {
		
		boolean result = false;
		
		if(!jValidationRules.isContainDigit(surName))             //g�nderilen string de�er n�merik karekter i�eriyor mu?										
		{	
			if(jValidationRules.isValidLength(surName, 2)) 
			{
				return true;
				
			}
			else 
				System.out.println("Soyisminiz iki karekterden fazla olmal�!");
			
		}
		
		else 
		{
			System.out.println("Soyisminiz sadace harflerden olu�mal�!");
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
			System.out.println("Email adresiniz ge�erli de�ildir");
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
			System.out.println("�ifreniz en az 6 karakterden olu�mal�d�r");
			return false;
		}
		
	}

}









