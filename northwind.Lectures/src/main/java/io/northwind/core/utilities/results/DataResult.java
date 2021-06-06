package io.northwind.core.utilities.results;

public class DataResult<T> extends Result { // Generic veri tipi söylenir,dataResulta

	private T data;

	public DataResult(T data, boolean success, String message) { // resultın parametreli constr. vardır
		super(success, message);//result için, 2 parametreli constructor
		this.data = data;

		// super; base sınıfın constructorlarını çalıştırmaya yarar;Resulttan gelen base
		// sınıf
		// this : o sınıftır
	}

	public DataResult(T data, boolean success) { // resultın tek  parametreli constr. vardır
		super(success);
		this.data = data;

	}
	
	public T getData() {
		return this.data;
	}

}
