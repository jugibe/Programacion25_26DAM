package numerosAleatorios;

/*Programa para explicar la formacion de numeros aleatorios*/
public class NumerosAleatorios {

	public static void main(String[] args) {
		double n = Math.random();
		System.out.println(n);
		// math random devuelve un numero double entre 0.0000... y 0.999999...
		System.out.println((int)(n * 6)+1);
	
	
	}

}
