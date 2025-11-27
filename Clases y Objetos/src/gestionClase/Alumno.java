package gestionClase;

import java.util.Arrays;

/**@author Carlos Abraham Chavarri Valera
 * @version 1.0_27-11-2025
 * Clase para representar la entidad alumno*/
public class Alumno {
	/** nombre y appellido del alumno*/
	private String nombreApellidos;
	/** numero de expendiente del alumno*/
	private int numeroExpediente;
	/** vector de calificaciones*/
	private Calificacion[] calificaciones;
	/**
	 * @param nombreApellidos
	 * @param numeroExpediente
	 * @param calificaciones
	 */
	public Alumno(String nombreApellidos, int numeroExpediente) {
		this.nombreApellidos = nombreApellidos;
		this.numeroExpediente = numeroExpediente;
		this.calificaciones = new Calificacion[6];// He creado un array de 6 calificaciones que son nulas
	}
	/**
	 * 
	 * @param c-> Calificacion a insertar
	 * @return Es booleano si la calificacion ha sido insertada correctamente
	 */
	public boolean insertar(Calificacion c) {
		for (int i = 0; i < calificaciones.length; i++) {
			// si al recorrer los modulos de calificaciones ya hay un modulo
			// entonces haqy un modulo con el mismo nombre
			if(calificaciones[i]==null) {
				calificaciones[i]=c;
				return true;
			}else if(calificaciones[i].getModulo().equals(c.getModulo())) {
				return false;
			}
		}
		return false;
	}
	
	/**
	 * @return the nombreApellidos
	 */
	public String getNombreApellidos() {
		return nombreApellidos;
	}
	/**
	 * @param nombreApellidos the nombreApellidos to set
	 */
	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}
	/**
	 * @return the numeroExpediente
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}
	/**
	 * @param numeroExpediente the numeroExpediente to set
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
	/**
	 * @return the calificaciones
	 */
	public Calificacion[] getCalificaciones() {
		return calificaciones;
	}
	/**
	 * @param calificaciones the calificaciones to set
	 */
	public void setCalificaciones(Calificacion[] calificaciones) {
		this.calificaciones = calificaciones;
	}
	@Override
	public String toString() {
		return "Alumno [nombreApellidos=" + nombreApellidos + ", numeroExpediente=" + numeroExpediente
				+ ", calificaciones=" + Arrays.toString(calificaciones) + "]";
	}
	
	
}
