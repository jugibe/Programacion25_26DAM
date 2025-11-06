package ExpresionesRegulares;
/*05/11/2025
 * Manuel Loren Ferrer
 *Las expresiones regulares en Java permiten crear patrones para validar, buscar o manipular texto*/

public class Ejemplo1 {

	public static void main(String[] args) {
		// Vamos a utilizar el metodo matches
		// cadena.matches("expresion regular")-> devuelve boolean si cadena cumple con
		// expresion
		String s = "";
		String expReg = "";
		// Ejemplo 1 Un . en la expresion regular equivale a cualquier caracter
		expReg = ".mor";
		s = "clamor";
		System.out.println(s.matches(expReg));
		// Ejemplo 2 [aeiou] seria valido cualquiera de los valores entre corchetes
		expReg = "[aeiou]mor";
		s = "emor";
		System.out.println(s.matches(expReg));
		// Ejemplo 3 [^aeiou] cualquier caracter menos los de []
		expReg = "[^aeiou]mor";
		s = "amor";
		System.out.println(s.matches(expReg));
		// Ejemplo 4 [a-zA-z] se pueden agrupar los caracteres en rangos
		expReg = "[0-9]mor";
		s = "9mor";
		System.out.println(s.matches(expReg));
		// Cuantificadores Permiten establecer numero de veces q aparece caracter o
		// grupo de estos
		/*
		 * Símbolo Significado Ejemplo Coincide con Cero o más a* ``, a, aa + Una o más
		 * a+ a, aa ? Cero o una colou?rcolor, colour {n} Exactamente na{3} aaa {n,} Al
		 * menos n a{2,} aa, aaa {n,m} Entre n y m a{2,4} aa, aaa, aaaa
		 */
		// Ejemplo 5 Palabra que empiece por vocal
		expReg = "[aeiouAEIOU]+.*";
		s = "A";
		System.out.println(s.matches(expReg));
		// Expresion que valida un numero de tfno
		expReg = "[1-9][0-9]{8}";
		s = "612897391";
		System.out.println(s.matches(expReg));
		expReg = "[0-9]{8}[A-Z]{1}";
		s = "21378321G";
		System.out.println(s.matches(expReg));
		//Contraseña con mas de 8 caracteres
		expReg = ".{8,}";
		s = "hiwf";
		System.out.println(s.matches(expReg));
	}

}
