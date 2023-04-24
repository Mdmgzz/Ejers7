package ejer4;

public class Main {

	public static void main(String[] args) {
		Articulo art = new Articulo("Radio", 10, 50);
		
		System.out.println(art);
		System.out.println(art.getPVP());
		System.out.println(art.getPVPDescuento(0.30));
		art.almacenar(10);
		art.vender(20);
		
		System.out.println("Cantidad: " + art.getCantidad());
		System.out.println(art);
	}
}
