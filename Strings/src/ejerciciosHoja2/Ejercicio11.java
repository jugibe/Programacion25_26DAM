package ejerciciosHoja2;

import EjerciciosClase.Leer;

/*
 * Christian Lázaro Manzueta
 * 06/11/2025
 *  Hacer un programa para que pida una palabra de no más de 20 caracteres y efectúe todas
las rotaciones posibles de dicha palabra de forma que el último carácter pase al primero y
los demás corran un espacio, es decir si la palabra fuera “HOLA” el resultado debe ser :
HOLA
AHOL
LAHO
OLAH
Observar que una palabra de n caracteres tiene n rotaciones.
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		String palabra = Leer.leerString("Introduce una palabra");
		String auxiliar = palabra;
		int contador = palabra.length();
		System.out.println(auxiliar);
		for (int i = 1; i < contador; i++) {
			auxiliar = auxiliar.charAt(palabra.length() - 1) + auxiliar.substring(0, palabra.length() - 1);
			System.out.println(auxiliar);
		}
		
	}
	

}
