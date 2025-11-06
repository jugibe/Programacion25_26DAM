package EjerciciosClase;
/*
 * David Gil
 * 6/11/2025
 *  Leer por teclado una cadena de caracteres. Convertir cada carácter en su número
 correspondiente en la tabla ASCII y mostrarlo.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		String s = Leer.leerString("Introduce una palabra");
		
		for (int i = 0; i < s.length();i++) {
			System.out.println("Caracter " + i + " " + s.charAt(i) + " Codigo ASCI " + (int) s.charAt(i));
		}

	}

}
