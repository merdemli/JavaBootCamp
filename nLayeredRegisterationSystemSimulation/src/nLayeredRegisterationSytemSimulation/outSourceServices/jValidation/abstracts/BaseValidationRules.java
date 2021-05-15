package nLayeredRegisterationSytemSimulation.outSourceServices.jValidation.abstracts;

public interface BaseValidationRules
{
	boolean isValidLength(String s, int requiredCount);
	boolean isValidForm(String s, String requiredForm );
	boolean isContainCharacter(String s);
	boolean isContainDigit(String s); 
	
}
