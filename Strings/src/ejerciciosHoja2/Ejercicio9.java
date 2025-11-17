package ejerciciosHoja2;

import EjerciciosClase.Leer;

/*
 * Luis Lopez Jurado
 * 13/11/2025
 * Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro 
   primeros sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo 
   (H ó M) sexo, el sexto un numero que representa el curso 1 ó 2 y los caracteres séptimo y 
   octavo pueden tener cualquier valor. Deben rechazarse los códigos que no cumplan estas condiciones,
   la finalización de entrada de códigos se produce cuando se introduce el código 
   “00000000”. Al final el programa debe sacar un informe indicando cuántos hombres y 
   mujeres hay matriculados en primero y segundo y cuántos códigos correctos han sido 
   leídos.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		
		String codigo  ="";
		int codigosValidos= 0;
		int contadorH= 0;
		int contadorM= 0;
		int contadorDe1= 0;
		int contadorDe2=0;
		do {
			codigo = pedirCodigo(); 
			//Ya sabemos que el codigo es valido 
			if (!codigo.equals("00000000")) {
				codigosValidos++;
			}
			if (codigo.charAt(4)=='H') {
				contadorH++;
			}
			if (codigo.charAt(4)=='M') {
				contadorM++;
			}
			if (codigo.charAt(5)=='1') {
				contadorDe1++;
			}
			if (codigo.charAt(5)=='2') {
				contadorDe2++;
			}
			System.out.println("Codigo valido");
		}while (!codigo.equals("00000000"));
		System.out.println("Fin de programa");
		System.out.println("Has introducido " + codigosValidos + " codigos validos");
		System.out.println("Has introducido " + contadorH + " Hombres ");
		System.out.println("Has introducido " + contadorM + " Mujeres");
		System.out.println("Has introducido " + contadorDe1 + " unos");
		System.out.println("Has introducido " + contadorDe2 + " doses ");
		
	}
	private static String pedirCodigo() {
		String resultado="";
		do {
			resultado =Leer.leerString("Introduce un codigo");
			if (resultado.equals("00000000")) {
				return resultado;
			}
		}while (resultado.length()!=8 ||
				!resultado.substring(0,4).matches("199[0-5]") ||
				!resultado.substring(4,5).matches("[HM]") ||
				!resultado.substring(5,6).matches("[12]"));

			return resultado;
	}
}
