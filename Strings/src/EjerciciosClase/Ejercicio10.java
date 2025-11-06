package EjerciciosClase;
/*
 * Carlos Vicente
 * 06/11/2025
 * Leer una cadena de caracteres. Mostrar por pantalla la cadena de caracteres en su
 “versión inglesa”, es decir, sustituyendo las ñ por n.
 
 Leer una cadena de caracteres. Mostrar por pantalla la cadena de caracteres en su
 “versión inglesa”, es decir, sustituyendo las ñ por n y las vocales con tilde (á, é, í, ó,
 ú) por las vocales sin tilde (a, e, i, o, u).
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		String s= Leer.leerString("Introduce una palabra");
		System.out.println("La palabra en versión inglesa es "+pasaIngles(s));
		System.out.println(s);

	}
	//Metodo que cambia las letras y por acortar solo cambia minúsculas.
	
	private static String pasaIngles(String s) {
		
		s = s.replaceAll("ñ", "n");
		s = s.replaceAll("á", "a");
		s = s.replaceAll("é", "e");
		s = s.replaceAll("í", "i");
		s = s.replaceAll("ó", "o");
		s = s.replaceAll("ú", "u");
		return s;
		
		
	}

}
