package bucles;

import java.util.Scanner;

/*
 * Gonzalo Lazareo
 * Programa que este pidiendo numeros hasta que introduzcamos el valor 0
 */
public class EjemploWhile2 {

	public static void main(String[] args) {
		// variables
		int numero,contador = 0;
		int suma= 0;
		String numerosIntroducidos = "";
		Scanner teclado= new Scanner(System.in);
		//proceso
		System.out.println("Introduce el primer valor");
		numero= teclado.nextInt();
		while (numero != 0) {
			contador++;
			suma=suma+numero;
			numerosIntroducidos=numerosIntroducidos + " " + numero;
			System.out.println("Has introducido el" + numero);
			System.out.println("Introduce otro ");
			numero= teclado.nextInt();
		}
		System.out.println("Has introducido" + contador + "numeros");
		System.out.println("Y la suma de todos los numeros vale " + suma);
		System.out.println("Los numeros que has introducido son" + numerosIntroducidos);
		teclado.close();

	}

}
