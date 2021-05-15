package nLayeredRegisterationSytemSimulation.outSourceServices.jValidation.concrete;

import java.util.regex.Pattern;

import nLayeredRegisterationSytemSimulation.outSourceServices.jValidation.abstracts.BaseValidationRules;

public class JValidationRules implements BaseValidationRules
{

	@Override
	public boolean isValidLength(String s, int requiredCount) 
	{ 
		if(s.length()< requiredCount) return false;            
		else return true;	
	}
	

	@Override
	public boolean isValidForm(String s, String requiredForm) 
	
	{					    //regex,  input
		if(Pattern.matches(requiredForm, s)) return true;
		else return false;										      //regular expressions
		
	}
	

	@Override
	public boolean isContainCharacter(String s) 
	{
		if(Pattern.matches("[a-zA-ZðÐçÇþÞüÜöÖýÝ]",s))         //verilen string ifade içinde belirtilen karekterler var mý
        {
            return true;
        }
        else
        {											
            return  false;
        }
		
	}

	
	
	@Override
	public boolean isContainDigit(String s) {
		
		boolean result = false;
		
		for(int i=0; i<s.length(); i++)                              
		{
			if(Character.isDigit(s.charAt(i)))               //Verilen string ifade içinde nümerik bir deðer var mý
			{
				 result = true;
				 break;
			
		    }
			
		}return result;                                   
	
		
	
}
	
}
