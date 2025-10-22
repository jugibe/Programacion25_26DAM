package ejemplosClase;
/*
 * Evis Amponsah 
 * 22/10/25
 * Ejemplos creacion de metodos
 */
public class Ejemplo1 {

	public static void main(String[] args) {
		saludar();
		saludar("Juan");
		saludar("evis",4);
		dibujarCuadrado(10);
	}
	//metodo que salude
	public static void saludar() {
		System.out.println("Hola soy Evis bienvenido a clase");
	}
	//metodo saludar al que le paso como argumento el nombre persona
	public static void saludar(String s) {
		System.out.println("Hola soy "+ s + " bienvenido a clase");
	}
	//metodo saludar al que le paso como argumento el nombre y el numero de veces que quiero que salude
	public static void saludar(String s,int v) {
		for(int i=1;i<=v;i++) {
			System.out.println("Hola soy "+ s + " bienvenido a clase");
		}
	
	}
	//metodo que dibuja un cuadrado de * al que le pasamos como argumento el lado
	public static void dibujarCuadrado(int n) {
		for(int f=1;f<=n;f++) {
			for(int c=1;c<=n;c++) {
				System.out.print(" * ");
				
			}
			System.out.println();
		}
	}
}
