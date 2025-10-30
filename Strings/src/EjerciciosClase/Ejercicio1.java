package EjerciciosClase;

/*Manuel Loren Ferrer 
 * 30/10/2025
 *  Hacer un captcha en el que la persona tenga que demostrar que no es un robot
 escribiendo una cadena compleja. Por ejemplo: “A5-jk7Y”.*/
public class Ejercicio1 {

	public static void main(String[] args) {

		do {
			
		} while (!validar());
		System.out.println("Validado");
	}

	// Metodo que me devuelve una letra mayuscula
	public static char generaMayus() {
		String s = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		return s.charAt((int) (Math.random() * s.length()));
	}

	// Metodo que me devuelve una letra minuscula
	public static char generaMin() {
		String s = "abcdefghijklmnñopqrstuvwxyz";
		return s.charAt((int) (Math.random() * s.length()));
	}

	// Metodo que me devuelve un numero
	public static char generaNum() {
		String s = "0123456789";
		return s.charAt((int) (Math.random() * s.length()));
	}

	// Metodo que me devuelve un simbolo
	public static char generaSimb() {
		String s = "´-`+*^Ç¨'¡?¿º!/=$%&()";
		return s.charAt((int) (Math.random() * s.length()));
	}

	// Metodo que genera un Captcha
	public static String captcha() {
		return "" + generaMayus() + generaMin() + generaNum() + generaSimb() + generaMayus() + generaMin();
	}

	public static boolean validar() {
		String c = captcha();
		System.out.println(c);
		return c.equals(Leer.leerString("Introduce el captcha"));
	}
}
