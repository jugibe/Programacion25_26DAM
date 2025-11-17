package ejerciciosHoja2;

import java.util.Arrays;
import java.util.Iterator;

import EjerciciosClase.Leer;

/*
 * Evis Amponsah Omane
 * Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas letras 
distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras 
debemos trabajar solo con mayúsculas. 
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		String frase="";
		String alfabeto="ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		int[] frecuencias= new int [alfabeto.length()];
		do {
			frase=Leer.leerString("Introduce una frase");
		}while(frase.length()>60);
		frase=frase.toUpperCase();
		for( int i=0;i<frase.length();i++) {
			//busco en alfabeto la posicion del caracter ide frase
			//en el vector frecuencias le sumo una a esa componente.
			frecuencias[alfabeto.indexOf(frase.charAt(i))]++;
		}
		//imprimir resultados:
		for(int i=0;i<alfabeto.length()-1;i++) {//quito unio para no mostrar la frecuencia del espacio
			if(frecuencias[i]!=0)System.out.println(alfabeto.charAt(i)+"---->"+frecuencias[i]);
		}
		//Busco lamayor frecuencia
		int mayor=frecuencias[0];
		for (int i = 0; i < frecuencias.length; i++) {
			if(frecuencias[i]>mayor)mayor=frecuencias[i];			
		}
		//Imprimo  las letras que se repiten esas veces
		System.out.println("Las letras que se repiten con mas frecuencia son ");
		for (int i = 0; i < frecuencias.length; i++) {
			if(frecuencias[i]>=mayor) {System.out.printf("%3s",alfabeto.charAt(i));}		
			
		}
		System.out.println();
		System.out.println("se repiten "+ mayor + " veces");
		
		
	}

}
