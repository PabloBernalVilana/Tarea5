package tarea5Apartado7;

/* @Author Pablo Bernal Vilana
 * Muestra los numeros del 1 al 100
 * ambos incluidos mediante un bucle While */
 
public class MainApp {
	
		public static void main(String[] args) {
		// declaracion de la variable
		// y asignacion del valor inicial
		int numero = 1;
		// mientras que numero sea menor o igual a 100
		while (numero <= 100) { // asi nos mostrara hasta el valor 100
			// muestra por pantalla el valor de numero
			System.out.println("Numero = " + numero);
			// incrementa en 1 el valor de numero
			numero++;
		}
	}
}
