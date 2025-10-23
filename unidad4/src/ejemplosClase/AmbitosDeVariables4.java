package ejemplosClase;
/*
 * Luis Lopez Jurado
 * 23/10/2025
 * Ambito de variables, una variable es accesible dentro del bloque en el que esta definida 
 */
public class AmbitosDeVariables4 {
	public static int x=28;
	
	public static void main(String[] args) {
		/*prueba();
		prueba2();
		System.out.println(x);
		prueba3();
		System.out.println(x);*/
		prueba4(x);
		System.out.println(x);
	}
	public static void prueba() {
		x++;
	}
	public static void prueba2() {
		System.out.println(x);
	}
	public static void prueba3() {
		int x=5;
		System.out.println(x + " Dentro de prueba 3");
	}
	public static void prueba4(int j) {
		x++;
		System.out.println(x + "Dentro ");
	}
}
