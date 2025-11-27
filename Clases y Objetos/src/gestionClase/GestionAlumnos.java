package gestionClase;
/*
 * Carlos Abraham Chavarri Valera
 * 27/11/2025
 * Prueba de la clase calificacion*/
public class GestionAlumnos {

	public static void main(String[] args) {
		//Creamos objetos de la clase calificacion
		Calificacion c1=new Calificacion("programacion",9.0);
		System.out.println(c1);
		Calificacion c2=new Calificacion("Base de Datos",4.33);
		System.out.println(c2);
		System.out.println(c1.getCalificacion()+c2.getCalificacion());
		// Crear un alumno
		Alumno a1=new Alumno("David",1);
		System.out.println(a1);
		a1.insertar(new Calificacion("programacion",9.0));
		System.out.println(a1);
	}

}
