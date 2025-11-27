package ejemplosDeClase;
/**
 * @author Manuel Loren Ferrer
 * @version 1.0_27-11-2025
 * En esta clase utilizaremos como 
 * ejemplo para explicar atributos
 */
public class Producto {
	/**
	 * nombre almacena el nombre 
	 * del producto
	 */
	private String nombre; 
	/**
	 * almacena el precio en euros
	 */
	private double precioEuros;
	/**
	 * almacena el cambio de euro a dolar
	 */
	private static double cambioEuroDolar = 1.16;
	/**
	 * atributo que cuenta numero de productos creados
	 */
	private static int numeroInstancias = 0;
	/**
	 * atributo que identifica el producto
	 */
	private int idProducto;
	/**
	 * 
	 * @param nombre-> nombre del producto
	 * @param precioEuros-> precio del producto
	 */
	
	public Producto(String nombre, double precioEuros) {
		this.nombre = nombre;
		this.precioEuros = precioEuros;
		numeroInstancias++;//aumentamos en uno el numero de instancias
		this.idProducto = numeroInstancias;
	}
	/**
	 * @return the precioEuros
	 */
	public double getPrecioEuros() {
		return precioEuros;
	}
	/**
	 * @param precioEuros the precioEuros to set
	 */
	public void setPrecioEuros(double precioEuros) {
		this.precioEuros = precioEuros;
	}
	/**
	 * @return the cambioEuroDolar
	 */
	public static double getCambioEuroDolar() {
		return cambioEuroDolar;
	}
	/**
	 * @param cambioEuroDolar the cambioEuroDolar to set
	 */
	public static void setCambioEuroDolar(double cambioEuroDolar) {
		Producto.cambioEuroDolar = cambioEuroDolar;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @return el precio del producto en dolares
	 */
	public double getPrecioDolares() {
		return precioEuros*cambioEuroDolar;
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + ", precio en euros=" + precioEuros + ", precio en dolares="
				+ getPrecioDolares() + "id del producto= "+idProducto+" numero de instancias= "+numeroInstancias;
	}
}
