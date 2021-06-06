package io.northwind.core.utilities.results;

public class SuccessResult extends Result 
{
	public SuccessResult() { //işlem sonucu başarılı, mesaj vermek istemiyorz
	super(true);
}
	public SuccessResult(String message) { 
		super(true,message);
		
	}
}
//hata yoksa success result dönecek
//hata varsa error result dönecek