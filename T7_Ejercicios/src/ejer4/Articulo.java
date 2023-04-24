package ejer4;
/**
 * programa que debe mostrar el nombre precio y cantidad de articulos
 *  que quedan en el almacen 
 * @author Migue
 *
 */
public class Articulo {
	/**
	 * 
	 */
	private String nombre;
	private double precio;
	private int cantidad;
	public final static double IVA = 0.21;
	/**
	 * 
	 * da a los atributos privados los valores
	 * que le entran por los parametros
	 * @param nombre		el nombre del articulo
	 * @param precio		el precio del articulo
	 * @param cantidad		la cantidad de articulos
	 */
	public Articulo(String nombre, double precio, int cantidad) {
		if(!nombre.isEmpty() && nombre != null) {
			this.nombre = nombre;
		} else {
			System.out.println("El nombre introducido no es válido");
		}
		
		if(precio>0) {
			this.precio = precio;
		} else {
			System.out.println("El precio introducido no es válido");
		}
		
		if(cantidad>=0) {
			this.cantidad = cantidad;
		} else {
			System.out.println("La cantidad introducida no es válida");
		}
	}
/**
 * 
 * @param a
 */
	public Articulo (Articulo a) {
		this.nombre = a.nombre;
		this.precio = a.precio;
		this.cantidad = a.cantidad;
	}
	/**
	 * el getter para sacar el nombre
	 * @return		devuelve el nombre que tiene en la variable 
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * setteamos el nombre en funcion a lo que entra por el parametro
	 * @param nombre    nombre que introduce 
	 */
	public void setNombre(String nombre) {
		if(!nombre.isEmpty() && nombre != null) {
			this.nombre = nombre;
		}
	}
	/**
	 * obtiene el precio de la variable privada
	 * @return devuelve el valor de precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * sette el precio que entra por parametro 
	 * @param precio
	 */
	public void setPrecio(double precio) {
		if(precio>0) {
			this.precio = precio;
		}
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		if(cantidad >= 0) {
			this.cantidad = cantidad;
		}
	} 
	/**
	 * al llamarla muestra el  nombre, precio y cantida del articulo
	 */
	public String toString() {
		String cadena = "";
		
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Precio: " + this.precio + "\n";
		cadena += "Cantidad: " + this.cantidad + "\n";
		cadena += "IVA: " + IVA + "\n";
		
		return cadena;
	}
	/**
	 * obitene el precio + iva
	 * @return
	 */
	public double getPVP() {
		double precioIVA = (this.precio*IVA) + this.precio;
		return precioIVA;
	}
	/**
	 *  al precio + iva le aplica e descuento 
	 * @param descuento  el numero de descuento que va a tener
	 * @return		devuelve el preccio final
	 */
	public double getPVPDescuento(double descuento) {
		double precioIVA = getPVP();
		double precioFinal = precioIVA - (precioIVA*descuento);
		return precioFinal;
	}
	/**
	 * al vender un articulo se llama a esta funcion para 
	 * @param cantidad
	 * @return
	 */
	public boolean vender (int cantidad) {
		boolean venta = false;
		if(this.cantidad>=cantidad) {
			venta = true;
			this.cantidad -= cantidad;
		}
		return venta;
	}
	/**
	 * suma a la cantidad de articulos que quedan, la cantdad que quieres almacenar
	 * @param cantidad   cantidad de articulos que quieres almacenar 
	 */
	public void almacenar(int cantidad) {
		this.cantidad += cantidad;
	}
}
