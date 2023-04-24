package ejer1;

public class CuentaCorriente {
	String DNI;
	String nombre;
	int saldo;
	/**
	 * constructor de CuentaCorriente
	 */
	public CuentaCorriente() {
		super();
	}
	/**
	 * le da los valores de entrada a los atributos
	 * 
	 * @param DNItitular  como parametro entra el dni del titular
	 * @param saldo		  entra como parametro el saldo del titular
	 */
	public CuentaCorriente(String DNItitular, int saldo) {
		this.DNI=DNItitular;
		this.saldo=saldo;
	}
	/**
	 * le da los valores de entrada a los atributos pero esta vez entra como parametro el nombre
	 * @param DNI
	 * @param nombre
	 * @param saldo
	 */
	public CuentaCorriente(String DNI,String nombre, int saldo) {
		this.DNI=DNI;
		this.nombre=nombre;
		this.saldo=saldo;
	}
	
	/**
	 * sirve para realizar la operacion para sacar dinero
	 * @param cantidad de dinero que quieres sacar 
	 * @return  devuelve la operacion realizada al sacar dinero
	 */
	boolean sacarDinero(double cantidad) {
		boolean operacion=false;
		if (saldo>cantidad) {
			operacion=true;
			saldo-=cantidad;
		}
		return operacion;
	}
	/**
	 * metodo que se utiliza al ingresar dinero
	 * @param cantidad la cantidad de dinero a ingresar
	 * @return devuelve la cantidada que queda tras ingresar el dinero
	 */
	int ingreso(double cantidad) {
		saldo+=cantidad;
		return saldo;
	}
	/**
	 * esto muestra la informacion del usuario 
	 */
	void MostrarInformacion() {
		System.out.println(DNI+"\n"+nombre+"\n"+saldo);
	}
	/**
	 * devuelve la informacion despues de guardarla en una variable
	 */
	public String toString() {
		String cad;
		
		cad=DNI+"\n"+nombre+"\n"+saldo;
		return cad;
	}
}
