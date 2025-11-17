package ejercicios;
/*
 * Christian Lazaro Manzueta
 * 17/11/2005
 * Desarrollar un programa en Java que utilice una clase que se llame Indicador que sea la
representación de un indicador de la vida real (indicadores de nivel, de velocidad,
tacómetros, etc).
La clase deberá tener los atributos valorMinimo, valorMaximo, valorActual,
unidades y nombre del indicador. En el momento de la creación de cada objeto se
asignarán todos los elementos salvo el valorActual. Entre los métodos que se
programarán deberán estar el de asignación del valorActual, imprimir el valor, imprimir el
indicador e incrementar y disminuir el valorActual con el que cuentan.
En ese programa (el principal), crearás un vector de elementos de tipo Indicador y se podrá
escoger el indicador a tratar. 
 */

public class Indicador {

	//Definir atributos
	private double valorMinimo;
	private double valorMaximo;
	private double valorActual;
	private String unidades;
	private String nombre;
	
	//Constructor
	//no pasamos el valorActual porque no lo pide el enunciado
	//por defecto al ser un double tendria valor = 0
	public Indicador(String nombre, double valorMinimo, double valorMaximo, String unidades) {
		this.nombre = nombre;
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
		this.unidades = unidades;
		//podemos dar por defecto un valor a valorActual
		this.valorActual = valorMinimo;
	}
	
	//metodo setter para asignar el valorActual
	public void asignarValorActual(double valorActual) {
		this.valorActual = valorActual;
	}
	
	//metodo que incrementa o disminuye el valorActual
	public void aumentaDisminuye(double valorActual) {
		if (valorActual < valorMaximo) {
			valorActual++;
		}
	}
	
}
