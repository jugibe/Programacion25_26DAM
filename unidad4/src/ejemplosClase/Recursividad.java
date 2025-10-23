package ejemplosClase;
/*
 * Luis Lopez Jurado
 * 23/10/2025
 * Ejemplo de recursividad
 */
public class Recursividad {

	public static void main(String[] args) {
		//pruebaRecursividad();
		//cuentaAtras(10);
		System.out.println(factorial(120));
	}
	public static void pruebaRecursividad() {
		System.out.println("Hola, q tal");
		pruebaRecursividad();
		System.out.println("Adios");
		
	}
	public static void cuentaAtras(int n) {
		System.out.println(n);
		if (n > -3)cuentaAtras(n-1);
		System.out.println(n);
	}
	public static long factorial(int n) {
		if (n ==0 || n ==1) {
			return 1;
		}else {
			return n* factorial(n-1);
		}
				
	}
}
