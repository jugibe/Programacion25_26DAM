package ejemplosdeclase;

/*
 * Fecha: 30/10/2025
 * Autor: Abderrahman Labiod
 * Ejemplos de uso Strings (Métodos, cadenas, ...)
 */
public class EjemplosUsoClase {

	public static void main(String[] args) {
		// Definición de Strings
		String s1 = "casa";
		String s2 = new String("casa");
		System.out.println(s1 == s2); // FALSE
		System.out.println(s1.equals(s2)); // TRUE
		System.out.println("");
		
		// Métodos de acceso
		// ATENCIÓN: Se empieza a contar desde el 0. Si nos pasamos del índice
		// Ejemplo: Tiene una longitud de 4 (sin incluir) y accedemos al carácter 4
		// se produce una excepción (StringIndexOutOfBoundsException)
		System.out.println("Carácter 0 de " + s1 + ": " + s1.charAt(0));
		System.out.println("Carácter 1 de " + s1 + ": " + s1.charAt(1));
		System.out.println("Carácter 2 de " + s1 + ": " + s1.charAt(2));
		System.out.println("Carácter 3 de " + s1 + ": " + s1.charAt(3));
		System.out.println("");
		
		// Ejemplo (Quitar comentario para probar):
		// System.out.println("Carácter 4 de " + s1 + ": " + s1.charAt(4));
		
		// Conocer longitud de una cadena (String)
		System.out.println("Longitud de " + s1 + ": " + s1.length());
		// Recorrer una cadena (loop for)
		// ATENCIÓN: Menor estricto. Si incluimos la longitud entera nos dará error (IndexOutOfBounds)
		for (int c = 0; c < s1.length(); c++) {
			System.out.println(s1.charAt(c));
		}
		System.out.println("");
		
		// Substring
		/*
		 * public String substring(int beginIndex) Returns a string that is a substring of this string. 
		 * 
		 * The substring begins with the character at the specified index 
		 * and extends to the end of this string.
		 */
		System.out.println(s1.substring(3));
		
		/*
		 * public String substring(int beginIndex, int endIndex) Returns a string that is a substring of this string. 
		 * The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. 
		 * Thus the length of the substring is endIndex-beginIndex.
		 */
		s1 = "cartón mojado";
		System.out.println(s1.substring(5, 10));
		System.out.println("");
		
		// indexOf
		/* public int indexOf(char character)
		 * public int indexOf(String s)
		 * 
		 * Devuelve la primera posición en la que aparece un determinado texto en la cadena. En el caso de que la cadena 
		 * buscada no se encuentre, devuelve -1. El texto a buscar puede ser char o String. Ejemplo:
		 */
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf("moja"));
		System.err.println(s1.indexOf('u'));
		System.out.println("");
		//startsWith()
		/*Devuelve true si la cadena empieza con un determinado texto. */
		System.out.println(s1.startsWith("c"));
		//replaceFirst y replaceAll
		//No modifican el objeto original, te devuelven otra nueva
		System.out.println(s1.replaceFirst("a", "u"));
		System.out.println(s1.replaceAll("a", "u"));
		System.out.println(s1);
		//toUpperCase y toLowerCase
		//Transforma de mayusculas a minusculas y viceversa
		s1 = "ManUel";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
	}
	
	

}
