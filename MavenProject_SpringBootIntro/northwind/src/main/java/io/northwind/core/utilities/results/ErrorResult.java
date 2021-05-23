package io.northwind.core.utilities.results;

public class ErrorResult extends Result {

	public ErrorResult() { // işlem sonucu başarısız, mesaj vermek istemiyorz
		super(false);
	}

	public ErrorResult(String message) {
		super(true, message);

	}
}
