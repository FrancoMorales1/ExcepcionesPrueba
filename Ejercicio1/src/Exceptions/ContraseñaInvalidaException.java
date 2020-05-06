package Exceptions;

public class Contrase�aInvalidaException extends Exception{
	private String motivoError;

	public Contrase�aInvalidaException(String motivoError) {
		super();
		this.motivoError = motivoError;
	}

	public String getMotivoError() {
		return motivoError;
	}
	
}
