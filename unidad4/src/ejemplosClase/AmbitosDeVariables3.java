package ejemplosClase;
/*
 * Luis Lopez Jurado
 * 23/10/2025
 * Ambito de variables, una variable es accesible dentro del bloque en el que esta definida 
 */
public class AmbitosDeVariables3 {

	public static void main(String[] args) {
		int x=28;
		prueba(x);
		System.out.println(x);

	}
	public static void prueba(int x) { //El paso de argumentos en java es por valor se pasa una copia del valor de la variable
		x++;
		System.out.println(x + " Dentro del metodo");
	}
}
