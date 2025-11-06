package EjerciciosClase;
/*
 *  Miguel Chaves
 *  05/11/2025
 *  Pedir a la persona que escriba su nombre y género por pantalla. Añadir Sr o Sra al
 principio del nombre y mostrarlo por pantalla.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// Declarar variables
		String nombre=Leer.leerString("Introduce tu nombre");
		String sufijo= generarSufijo();
		System.out.println("Bienvenido " + sufijo + nombre);


	}
	private static String generarSufijo() {
		String sufijo="";
		//Imprimo el menu
		System.out.println("Introduce tu genero");
		System.out.println("1.Masculino");
		System.out.println("2.Femenino");
		System.out.println("3.Otro");
		//Pido la opción
		int opcion;
		//Segun la respuesta genero el Sufijo
		do {
			//Imprimo el menu
			System.out.println("Introduce tu genero");
			System.out.println("1.Masculino");
			System.out.println("2.Femenino");
			System.out.println("3.Otro");
			opcion=Leer.leerEntero();
			switch (opcion) {
			case 1:
				sufijo="Sr.";
				break;
			case 2:
				sufijo="Sra.";
				break;
			case 3:
				sufijo="";
				break;
			default: 
				System.out.println("Erronea");
			}
		}while (!(opcion==1||opcion == 2||opcion ==3));
		return sufijo;
	}

}
