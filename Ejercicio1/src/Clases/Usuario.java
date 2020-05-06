package Clases;

import Exceptions.ContraseñaInvalidaException;
import Exceptions.NombreInvalidoException;

public class Usuario {
	private String nombre;
	private String contraseña;
	public Usuario(String nombre, String contraseña) throws NombreInvalidoException, ContraseñaInvalidaException {
		super();
		if(verificarNombre(nombre)) {
			throw new NombreInvalidoException("No ingreso un nombre");
		}else if(!verificarContraseña(contraseña).isEmpty()) {
			throw new ContraseñaInvalidaException(verificarContraseña(contraseña));
		}else {
			this.nombre = nombre;
			this.contraseña = contraseña;
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) throws NombreInvalidoException {
		if(verificarNombre(nombre)) {
			throw new NombreInvalidoException("No ingreso un nombre");
		}else {
			this.nombre = nombre;
		}
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) throws ContraseñaInvalidaException {
		String motivoError=null;
		if(verificarContraseña(contraseña)==null) {
			throw new ContraseñaInvalidaException(motivoError);
		}else {
			this.contraseña = contraseña;
		}
	}
	private boolean verificarNombre(String nombre) {
		boolean aux=false;
		if(nombre==null) {
			aux=true;
		}
		return aux;
	}	
	private String verificarContraseña(String contraseña) {
		boolean aux=false;
		String motivoError=new String();
		int errorTipo=0;
		if(contraseña==null){
			aux=true;
			errorTipo=1;
		} else if(contraseña.length()<6 ) {
			aux=true;
			errorTipo=2;
		}else if(contraseña.toUpperCase().charAt(0)>90 || contraseña.toUpperCase().charAt(0)<65) {
			aux=true;
			errorTipo=3;
		}
		if(aux==true) {
			if(errorTipo==1) {
				motivoError="No hay contraseña.";
			}else if(errorTipo==2) {
				motivoError="La contraseña tiene menos de 6 caracteres.";
			}else if(errorTipo==3) {
				motivoError="La contraseña no inicia con una letra.";
			}
		}
		return motivoError;
	}	
}
