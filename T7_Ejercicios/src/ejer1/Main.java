package ejer1;

public class Main {

	public static void main(String[] args) {
		// provamos con  un dni especifico para ver si la clase cuenta corriente funciona correctamente 
		//creamos un objeto y llamamos a la funcion con los valores concretos 
		CuentaCorriente objeto=new CuentaCorriente("20347357L","miguel",7,"Masculino");
		//mostramos el resultado
		System.out.println(objeto);
	}

}
