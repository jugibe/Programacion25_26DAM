package EjerciciosClase;

/*
 * Autor: Abderrahman Labiod
 * Fecha: 05/11/2025 
 *  Pedir un correo electrónico por pantalla. Comprobar que contiene el carácter ‘@’. 
 *  Sino lo tiene, volver a pedirlo
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		String inputCorreo = "";
		do {
			inputCorreo = Leer.leerString("Introduce tu correo electrónico: ");
		} while(!isCorreo(inputCorreo));
		
		System.out.println("Tu correo es: " + inputCorreo);
	}

	public static boolean isCorreo(String correo) {
		int indexArroba = correo.indexOf('@'); // correo.indexOf('@') devuelve -1 si el el correo no tiene @
		return indexArroba > 0 && indexArroba < correo.lastIndexOf('.');
	}
}
