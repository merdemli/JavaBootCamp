package nLayeredRegisterationSytemSimulation.core.abstracts;

public interface JValidationService
{
	boolean isValidName(String name);
	boolean isValidSurName(String surName);
	boolean isValidEmailFormat(String email);
	boolean isValidPassword(String password);

}
