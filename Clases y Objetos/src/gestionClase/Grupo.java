package gestionClase;

import java.util.Arrays;

/**
 * @author Manuel Loren Ferrer
 * @version 1.0_28-11-2025
 */
public class Grupo {
	private String nombre;
	Alumno[] alumnos;
/**
 * 
 * @param nombre del grupo
 * @param max maximo numero de alumnos del grupo
 */
	public Grupo(String nombre, int max) {
		this.nombre = nombre;
		alumnos = new Alumno[max];
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the alumnos
	 */
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	/**
	 * @param alumnos the alumnos to set
	 */
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "Clase [nombre=" + nombre + ", alumnos=" + Arrays.toString(alumnos) + "]";
	}

	public boolean insertar(Alumno alumno) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alumno;
				return true;
			}
		}
		return false;
	}
/**
 * 
 * @param numExpediente numero de expediente de alumno
 * @return calificaciones del alumno con ese numero de expediente
 */
	public Calificacion[] consultarCalificacionesAlumno(int numExpediente) {
		for (Alumno a : alumnos) {
			if (a != null) {
				if (a.getNumeroExpediente() == numExpediente) {
					return a.getCalificaciones();
				}
			}
		}
		return null;
	}
	/**
	 * 
	 * @return alumno 
	 */
	public Grupo consultarAlumnosConTodoAprobado() {
		return null;
	}
}
