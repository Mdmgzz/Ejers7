package ejer01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//bloque de variables 
		// Creamos el objeto de hora
				Hora objeto = new Hora();
				
				// Abrimos el escaner
				Scanner sc = new Scanner(System.in);
				
				// preguntamos por la hora
				System.out.print("Hora: ");
				objeto.setHora(sc.nextInt());
				
				System.out.print("Minutos: ");
				objeto.setMinuto(sc.nextInt());
				
				System.out.print("Segundos: ");
				objeto.setSegundo(sc.nextInt());
				
				// Pedimos cuantos segundos quiere aumentar
				System.out.print("Cantidad de seg a aumentar: ");
				objeto.incrementarSegundos(sc.nextInt());
				
				// Mostramos la hora despues del incremento
				System.out.println("Son las "+objeto.getHora()+":"+objeto.getMinuto()+":"+objeto.getSegundo());
				
				// Cerramos el escaner
				sc.close();
		}

}
