package ejerciciosHoja2;

import EjerciciosClase.Leer;

/*
 * Christian Lazaro Manzueta
 * 06/11/2025
 * Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y
dado un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del
modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera que cada
carácter se transforme en 3 códigos ASCII mas es decir :
Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
Desarrollar los programas de codificar y descodificar mediante dos funciones.
 */

public class Ejercicio8CESAR {

	public static void main(String[] args) {
		final int NUMEROCESAR = 1;
		String fraseOriginal = Leer.leerString("Introduce una frase");
		String fraseCodificada = codificaCesar(fraseOriginal, NUMEROCESAR);
		System.out.println("La frase codificada es " + fraseCodificada);
		System.out.println("La frase decodificada es " + decodificarCesar(fraseCodificada, NUMEROCESAR));
	}

	private static String codificaCesar(String fraseOriginal, int n) {
		String resultado = "";
		for (int i = 0; i < fraseOriginal.length(); i++) {
			resultado = resultado + (char)(fraseOriginal.charAt(i) + n);
		}
		return resultado;
	}
	
	private static String decodificarCesar(String frase, int n) {
		String resultado = "";
		for (int i = 0; i < frase.length(); i++) {
			resultado = resultado + (char)(frase.charAt(i) - n);
		}
		return resultado;
	}
	

}
