package ejer04;

public class CuentaCorriente {
public enum Sexo {Masculino,Femenino}
	
	String DNI;
	String nombre;
	int saldo;
	Sexo sexo;
	
	
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
	public CuentaCorriente(String DNI,String nombre, int saldo,String sexo) {
		this.DNI=DNI;
		this.nombre=nombre;
		this.saldo=saldo;
		this.sexo = Sexo.valueOf(sexo);
	}
	/**
	 * getter del atributo sexo
	 * @return
	 */
	public Sexo getSexo() {
		return sexo;
	}
	/**
	 * setter del atrib sexo
	 * @param sexo
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
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
		
		cad=DNI+"\n"+nombre+"\n"+saldo+"\n"+sexo;
		return cad;
	}
}
