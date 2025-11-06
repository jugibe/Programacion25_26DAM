/*
 * Pedir por teclado el código postal. Mostrar por pantalla la provincia (2 primeras cifras
 del código postal) y la zona postal (3 últimas cifras del código postal). Además, si las
 cifras de la provincia son 50 (Zaragoza), 22(Huesca) o 44(Teruel) mostrar por
 pantalla un mensaje tipo: “Eres de Zaragoza”
 */

package EjerciciosClase;

public class Ejercicio5 {

	public static void main(String[] args) {
		String cp;
		do{
		cp=Leer.leerString("Introduce tu codigo postal: ");
		
		}while(!cp.matches("[0-9]{5}"));
		System.out.println("Tu provincia es: "+cp.substring(0,2)+" y tu zona postal es: "+cp.substring(2));
		
		if(cp.substring(0,2).equals("50")) {
			System.out.println("Eres de Zaragoza");
		}
		
		else if(cp.substring(0,2).equals("22")) {
			System.out.println("Eres de Huesca");
		}
		
		else if(cp.substring(0,2).equals("44")) {
			System.out.println("Eres de Teruel");
		}
		
		else {
			System.out.println("No tienes la suerte de ser de Aragón");
		}
		
		
   }
}
