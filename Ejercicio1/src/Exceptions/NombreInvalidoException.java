package Exceptions;

public class NombreInvalidoException extends Exception{
	private String motivoError;

	public NombreInvalidoException(String motivoError) {
		super();
		this.motivoError = motivoError;
	}

	public String getMotivoError() {
		return motivoError;
	}
	
}
