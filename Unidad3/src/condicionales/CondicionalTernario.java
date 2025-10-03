package condicionales;
/*
 * 29/09/2025
 * Mauro Civitani
 * Programa para aprender a utilizar el operador ternario ?
 * programa que me dice si un numero es par o impar,positivo, negativo o 0
 */

public class CondicionalTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaracion de variables
		int numero=0;
		String resultadoFinal="";
		//proceso
		resultadoFinal=(numero%2==0)? "es par": "es impar";
		resultadoFinal+=(numero>0)? " y es positivo": ((numero==0)? " y es 0": " y es negativo" ); 
		//salida de datos
		System.out.println("el numero es "+resultadoFinal);
			
			
	}

}
