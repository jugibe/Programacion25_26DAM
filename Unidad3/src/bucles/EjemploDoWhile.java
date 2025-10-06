package bucles;

/*
 * Autor: Abderrahman Labiod
 * Fecha: 06-10-2025
 * Ejercicio: Ejemplo de clase para explicar el uso de do-while
 */
public class EjemploDoWhile {

	public static void main(String[] args) {
		int num = 1;
		do {
			System.out.println(num);
			num++;
		} while(num != 10);
		System.out.println("fuera del bucle");
	}
}
