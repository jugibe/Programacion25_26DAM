package EjerciciosClase;
/*
 * pedir una palabra por teclado y comprobar si es un verbo infinitivo (acabado en-ar,-er o-ir).
 * 5/11/2025
 * Carlos Abraham Chavarri Valera
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// Declarar variables
		String s;
		//Entrada de datos
		s=Leer.leerString("Introduce un verbo en infinitivo ");
		// Salida de datos
		if (esInfinitivo(s.toLowerCase())) {
			System.out.println("Es infinitivo");
		}else {
			System.out.println("No es infinitivo");
		}
	}
	// Metodo que devuelove un boolean si la palabra introducida acaba en ar, er o ir
	private static boolean esInfinitivo(String s) {
		
		return s.endsWith("ar")||s.endsWith("ir")||s.endsWith("er");
	}
	

}
