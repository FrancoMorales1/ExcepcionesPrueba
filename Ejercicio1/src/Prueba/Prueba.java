package Prueba;

import Clases.Usuario;
import Exceptions.Contrase�aInvalidaException;
import Exceptions.NombreInvalidoException;

public class Prueba {

	public static void main(String[] args) {
		int i=0;
		String nombres[]=new String[5];
		String contrase�as[]=new String[5];
		nombres[0]=null;
		nombres[1]="Franco";
		nombres[2]="Franco";
		nombres[3]="Franco";
		nombres[4]="Franco";
		contrase�as[0]="Morales";
		contrase�as[1]=null;
		contrase�as[2]="6orales";
		contrase�as[3]="Mora";
		contrase�as[4]="Morales";
		while(i<=4) {
			try {
				Usuario user1=new Usuario(nombres[i],contrase�as[i]);
				System.out.println("Nombre: "+user1.getNombre()+" Contrase�a: "+user1.getContrase�a());
			} catch (NombreInvalidoException e) {
				System.out.println(e.getMotivoError());
			} catch (Contrase�aInvalidaException e) {
				System.out.println(e.getMotivoError());
			}
			i++;
		}
	}

}
