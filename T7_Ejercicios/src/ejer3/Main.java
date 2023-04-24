package ejer3;

public class Main {

	public static void main(String[] args) {
		//Creamos dos objetos para comprobar que todo funciona
				Punto original = new Punto(0,1);
				Punto p = new Punto(7, 5);
				
				System.out.println(original.toString());
				original.setXY(4, 7);
				System.out.println(original.toString());
				original.desplaza(1, -4);
				System.out.println(original.toString());
				System.out.println("La distancia entre los dos puntos es de " + original.distancia(p) + " unidades.");
	}

}
