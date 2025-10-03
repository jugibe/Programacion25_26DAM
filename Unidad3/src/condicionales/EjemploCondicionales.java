package condicionales;

import java.util.Scanner;

/*Miguel Chaves
 * 29/09/2025
 * Realizar programa que me pida por teclado el numero
 * de dia y me indique si el dia es lectivo (del 1 al 5)
 * Festivo (6,7) o desconocido (otros casos)
 * Utilizando if, else, switch y ternarios
 */
public class EjemploCondicionales {
	
	public static void main(String[] args) {
		//declaracion de variables
		Scanner teclado=new Scanner(System.in);
		int numeroDia;
		String resultadoFinal;
		//entrada datos
		System.out.println("introduce un dia");
		numeroDia=teclado.nextInt();
		//proceso
		/*usando condicionales if y else if
		 * if (numeroDia>=1&& numeroDia<=5) { resultadoFinal="Lectivo"; }else if
		 * (numeroDia==6||numeroDia==7) { resultadoFinal="Festivo"; }else {
		 * resultadoFinal="Desconocido"; }
		 */
		/*switch (numeroDia) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			resultadoFinal="lectivo";
			break;
		case 6: 
		case 7:
			resultadoFinal="festivo";
			break;
		default: resultadoFinal="desconocido";
		}*/
		
		
		 //Utilizando el operador interrogante (?)
		resultadoFinal=(numeroDia>=1&& numeroDia<=5)? "Lectivo": (numeroDia==6||numeroDia==7)? "Festivo" : "Desconocido";
		//Salida de resultados
		System.out.println("El dia que has introducido es "+resultadoFinal);
		teclado.close();
		

	}

}
