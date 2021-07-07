package tarea5Apartado4;

/* @Author Pablo Bernal Vilana
 * Calcula el area de un circulo 
 * area = (Pi * Radio^2)
 * el radio se introduce por teclado
 */
import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		// Definicion constante PI
		final double pi = 3.141592;
		// introduccion por teclado mediante JOptionPane
		String radioString = JOptionPane.showInputDialog(null, "Introduce el radio: ");
		// se pasa la variable de String a Double
		double radioDouble = Double.parseDouble(radioString);
		// muestra por pantalla la formula del area del circulo
		System.out.println("Formula del area de un circulo: area = (Pi * Radio^2)");
		// muestra por consola los valores de la operacion y el resultado final
		// elevar el cuadrado mediante Math.pow
		System.out.println(pi + " * " + Math.pow(radioDouble, radioDouble) + " = " + (pi * Math.pow(radioDouble, radioDouble)));
		// muestra por ventana emergente la operacion y el resultado
		JOptionPane.showMessageDialog(null, (pi + " * " + Math.pow(radioDouble, radioDouble) + " = " + (pi * Math.pow(radioDouble, radioDouble))));
	}
}
