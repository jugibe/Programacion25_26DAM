package EjerciciosClase;
/*
 * Pedir el nombre y los apellidos de una persona y mostrar por pantalla sus iniciales
 	con el formato M.C.V.
 * 5/11/2025
 * Luis Lopez Jurado
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		//Declarar variables y leer datos
		String nombre = Leer.leerString("Introduce el nombre");
		String apellido1 = Leer.leerString("Introduce tu primer apellido");
		String apellido2 = Leer.leerString("Introduce tu segundo apellido");
		
		String iniciales = nombre.toUpperCase().charAt(0)+"."+apellido1.toUpperCase().charAt(0)+"." +apellido2.toUpperCase().charAt(0)+".";
		System.out.println("Tus iniciales son " + iniciales);
		

	}

}
