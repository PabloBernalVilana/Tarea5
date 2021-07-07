package tarea5Apartado9;
/* @Author Pablo Bernal Vilana
 * Muestra los números del 1 al 100 (ambos incluidos) 
 * solo los divisibles entre 2 y 3
 * utilizando el bucle que deseemos
 */

public class MainApp {

	public static void main(String[] args) {
		// declaracion de la variable
		// asignacion del valor inicial
		int num1 = 1;
		// bucle for
		for (num1 = 1; num1 <=100; num1++) {
			if (num1 % 2 == 0) {// si es divisible entre dos
				// muestra cuanto vale num por consola
				System.out.println(num1);
			} else if (num1 % 3 == 0) { // si es divisible entre tres
				// muestra numero por pantalla
				System.out.println(num1);
			}
		}
	}
}
