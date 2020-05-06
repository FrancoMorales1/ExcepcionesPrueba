package Prueba;

import Clases.Usuario;
import Exceptions.ContraseñaInvalidaException;
import Exceptions.NombreInvalidoException;

public class Prueba {

	public static void main(String[] args) {
		int i=0;
		String nombres[]=new String[5];
		String contraseñas[]=new String[5];
		nombres[0]=null;
		nombres[1]="Franco";
		nombres[2]="Franco";
		nombres[3]="Franco";
		nombres[4]="Franco";
		contraseñas[0]="Morales";
		contraseñas[1]=null;
		contraseñas[2]="6orales";
		contraseñas[3]="Mora";
		contraseñas[4]="Morales";
		while(i<=4) {
			try {
				Usuario user1=new Usuario(nombres[i],contraseñas[i]);
				System.out.println("Nombre: "+user1.getNombre()+" Contraseña: "+user1.getContraseña());
			} catch (NombreInvalidoException e) {
				System.out.println(e.getMotivoError());
			} catch (ContraseñaInvalidaException e) {
				System.out.println(e.getMotivoError());
			}
			i++;
		}
	}

}
