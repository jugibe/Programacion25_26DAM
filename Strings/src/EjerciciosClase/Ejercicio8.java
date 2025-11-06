package EjerciciosClase;

/*
 * Autor: Abderrahman Labiod
 * Fecha: 06/11/2025 
 * Pedir una palabra por teclado y mostrar cuántas vocales tiene
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		String palabra = Leer.leerString("Introduce una palabra: ");
		int vocales = contarVocales(palabra);
		System.out.println("La palabra '" + palabra + "' tiene " + vocales + " vocales!");
	}
	
	public static int contarVocales(String palabra) {
		String pal = palabra.toLowerCase();
		int contadorVocales = 0;
		for (int i = 0; i < pal.length(); i++) {
			char letra = pal.charAt(i);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
				contadorVocales++;
			}
		}
		return contadorVocales;
	}

}
