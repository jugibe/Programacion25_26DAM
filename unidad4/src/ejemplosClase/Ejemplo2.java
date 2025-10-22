package ejemplosClase;

/*Manuel Loren Ferrer
 * 22/10/2025
 * Ejemplos de clase de creacion de metodos*/
public class Ejemplo2 {

	public static void main(String[] args) {
		System.out.println(numeroMayor(60, 15));
		System.out.println(cantidadDivisores(29));
		System.out.println(esPrimo(1123));
		for(int i = 1;i<=100;i++) {
			if (esPrimo(i)) {
				System.out.println("El numero "+i+" es primo");
			}
		}
	}

	// metodo al que le pasamos dos enteros y me devuelve el mayor
	public static int numeroMayor(int n1, int n2) {
		/*
		 * if (n1>=n2) { return n1; }else { return n2; }
		 */
		int mayor = (n1 >= n2) ? n1 : n2;
		return mayor;
	}

	// metodo que devuelve numero de divisores de un numero
	public static int cantidadDivisores(int n) {
		int contador = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				contador++;
			}
		}
		return contador;

	}

//metodo para que te diga si un numero es primo o no
	public static boolean esPrimo(int n) {
		/*
		 * if(cantidadDivisores(n) == 2) { return true; }else { return false; }
		 */
		return cantidadDivisores(n) == 2;
	}
}
