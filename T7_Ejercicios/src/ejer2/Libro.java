package ejer2;

public class Libro {
	/**
	 * creamos los atributos y el enum
	 */
	
	enum Genero {Narrativo, Lírico, Dramático, Didáctico , Poético}
	String titulo;
	String autor;
	int numEjemplares;
	int prestados;
	Genero genero;
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
	public Libro(String titulo, String autor, int numEjemplares, int prestados,String genero) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.prestados = prestados;
		this.genero = Genero.valueOf(genero);
	}
	public Genero getGenero() {	
		return genero;
	}
	/**
	 * setter del atrib sexo
	 * @param sexo
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
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
			numEjemplares--;
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
			numEjemplares++;
		}
		return estado;
	}
	/**
	 * el tostring te va a devolver la cadena
	 */
	public String toString() {
		return "Libro: "+"\n"+ titulo + "\n"+ autor +"\n"+"Emjem: " + numEjemplares +"\n"+"Prestados: "+ prestados + "\n" + genero + ".";
	}
	
}
