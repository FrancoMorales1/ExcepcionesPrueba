package Exceptions;

public class ContraseñaInvalidaException extends Exception{
	private String motivoError;

	public ContraseñaInvalidaException(String motivoError) {
		super();
		this.motivoError = motivoError;
	}

	public String getMotivoError() {
		return motivoError;
	}
	
}
