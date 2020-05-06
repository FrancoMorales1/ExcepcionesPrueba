package Clases;

import Exceptions.Contrase�aInvalidaException;
import Exceptions.NombreInvalidoException;

public class Usuario {
	private String nombre;
	private String contrase�a;
	public Usuario(String nombre, String contrase�a) throws NombreInvalidoException, Contrase�aInvalidaException {
		super();
		if(verificarNombre(nombre)) {
			throw new NombreInvalidoException("No ingreso un nombre");
		}else if(!verificarContrase�a(contrase�a).isEmpty()) {
			throw new Contrase�aInvalidaException(verificarContrase�a(contrase�a));
		}else {
			this.nombre = nombre;
			this.contrase�a = contrase�a;
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
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) throws Contrase�aInvalidaException {
		String motivoError=null;
		if(verificarContrase�a(contrase�a)==null) {
			throw new Contrase�aInvalidaException(motivoError);
		}else {
			this.contrase�a = contrase�a;
		}
	}
	private boolean verificarNombre(String nombre) {
		boolean aux=false;
		if(nombre==null) {
			aux=true;
		}
		return aux;
	}	
	private String verificarContrase�a(String contrase�a) {
		boolean aux=false;
		String motivoError=new String();
		int errorTipo=0;
		if(contrase�a==null){
			aux=true;
			errorTipo=1;
		} else if(contrase�a.length()<6 ) {
			aux=true;
			errorTipo=2;
		}else if(contrase�a.toUpperCase().charAt(0)>90 || contrase�a.toUpperCase().charAt(0)<65) {
			aux=true;
			errorTipo=3;
		}
		if(aux==true) {
			if(errorTipo==1) {
				motivoError="No hay contrase�a.";
			}else if(errorTipo==2) {
				motivoError="La contrase�a tiene menos de 6 caracteres.";
			}else if(errorTipo==3) {
				motivoError="La contrase�a no inicia con una letra.";
			}
		}
		return motivoError;
	}	
}
