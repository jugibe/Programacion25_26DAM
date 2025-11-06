package EjerciciosClase;
/*
 * Miguel Chaves
 * 06/11/2025
 * Pedir una palabra por teclado y mostrar dicha palabra invertida (respetando
 mayúsculas y minúsculas).
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		//Pedir la palabra
		String palabra= Leer.leerString("Introduce palabra");
		System.out.println(palabra + " al reves es " + inviertePalabra(palabra));
	}
	
	//Metodo que invierte la palabra
	
	private static String inviertePalabra(String p) {
		String resultado= "";
		for(int i=p.length()-1;i>=0;i--) {
			resultado=resultado+p.charAt(i);
		}
		return resultado;
	}

}
