package tarea5Apartado5;

import javax.swing.JOptionPane;

/* @Author Pablo Bernal Vilana
 * Lee un número por teclado e indica 
 * si es divisible entre 2 (resto = 0).
 * Si no lo es, también debemos indicarlo.
 */
public class MainApp {

	public static void main(String[] args) {
		// declaramos una constante con valor 2
		final double DIVISOR = 2;
		// solicitamos la entrada de un numero a traves de JOptionPane
		String dividendoString = JOptionPane.showInputDialog(null, "Introduce un numero: ");
		// transformamos el valor de tipo String a tipo int
		int dividendoInt = Integer.parseInt(dividendoString);
		// comprovacion si el numero entrado es divisible entre 2, modulo = 0
		if (dividendoInt % DIVISOR == 0) { // modulo = 0
			// muestra por ventana emergente que el numero si es divisible entre 2
			JOptionPane.showMessageDialog(null, dividendoString + " Es divisible entre " + DIVISOR);
		} else { // modulo != 0
			// muestra por ventana emergente que el numero no es divisible entre 2
			JOptionPane.showMessageDialog(null, dividendoString + " No es divisible entre " + DIVISOR);
		}
	}
}
