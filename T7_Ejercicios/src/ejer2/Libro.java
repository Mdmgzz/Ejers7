package ejer2;

public class Libro {
	/**
	 * creamos los atributos
	 */
	String titulo;
	String autor;
	int numEjemplares;
	int prestados;
	/**
	 * constructor
	 */
	public Libro() {
		super();
	}
	/**
	 * da los valores que entran como parametros a los atribs
	 * @param titulo  el titulo del libro
	 * @param autor	  autor del libro
	 * @param numEjemplares	 ejemplares que tiene
	 * @param prestados		cantidad de ejemplares prestados
	 */
	public Libro(String titulo, String autor, int numEjemplares, int prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.prestados = prestados;
	}
	/**
	 * este metodo se utiliza cuando vas a prestar un libro para 
	 * comprobar que hay libros disponibles para prestar 
	 * @return  devuelve true si existen ejemplares para prestar 
	 */
	boolean prestamo(){
		boolean estado=false;
		if(prestados<numEjemplares) {
			estado = true;
			prestados++;
		}
		return estado;
	}
	/**
	 * cuando vas a devilver un libro se quita de los ejemplares prestados
	 * @return  devuelve true cuando se devuelve un libro 
	 */
	boolean devolucion() {
		boolean estado = false;
		if(prestados>0) {
			estado = true;
			prestados--;
		}
		return estado;
	}
}
