package io.northwind.core.utilities.results;

public class Result { //super Type
	
	private Boolean success; // işlem başarılı mı
	private String message; // işlem başarılı ürün eklendi gibi

	public Result(boolean success) {
		this.success = success;
	}

	public Result(boolean success, String message) {

		this(success);  //this.success = success; //tek parametreli constructor'ı çağırmış olursun.Aynı kodu iki kere yazmamak için
		this.message = message;
	}

	
	public boolean isSuccess() //getSuccess
	{   
		return this.success; 
	}
	
	public String getMessage() {
		return this.message;
	}
}
