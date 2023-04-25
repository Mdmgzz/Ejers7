package ejer2;

import ejer2.Libro.Genero;

public class main {

	public static void main(String[] args) {
		//Creamos un objeto de tipo libro
		Libro furbo = new Libro("la historia de la decima", "Florentino Perez", 20, 10, "Narrativo");
		Libro chistesito = new Libro("el libro de los 3000 chistes", "Napoleon", 32, 3, "Dramático");
				
		//mostramos el tostring de furbo y le cambiamos el genero por otro que esta en el enum
		System.out.println(furbo.toString());
		furbo.setGenero(Genero.Didáctico);
		System.out.println(furbo.toString());
		
		// mostramos un espacio
		System.out.println();
		
		// mostramos el tostring de chistesito y le cambiamos el genero como antes		
		System.out.println(chistesito.toString());
		chistesito.setGenero(Genero.Lírico);
		System.out.println(chistesito.toString());

	}

}
