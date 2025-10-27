package ejerciciosClase;
/*
 * Nombre: Luis Lopez Jurado
 * Fecha: 27/10/2025
 * Crea un método contarDigitos(int n) que te devuelva el numero de cifras de n.
 */
public class Ejercicio11 {
	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if (esPrimo(i)) {
				System.out.println("El numero " + i + " es primo");
			}
		}
		

	}
	//metodo que me calcula la cantidad de divisores de un numero 
	public static int numeroDivisores(int num) {
		
		int contador=0;
		for(int i=1; i<=num;i++) {
			if(num %i ==0) {
				contador++;
			}
		}
		return contador;
	}
	//metodo que comprueba si un numero es primo 
	public static boolean esPrimo(int num) {
		return numeroDivisores(num)==2;
	}
}
