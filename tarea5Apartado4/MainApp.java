package tarea5Apartado4;

/* @Author Pablo Bernal Vilana
 * Calcula el area de un circulo 
 * area = (Pi * Radio^2)
 * el radio se introduce por teclado
 */
import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		// Definicion de la constante PI
		// Definicion de la constante exponente del radio
		final double pi = 3.141592;
		final int exponenteCuadrado = 2;
		// introduccion por teclado mediante JOptionPane
		String radioString = JOptionPane.showInputDialog(null, "Introduce el radio: ");
		// se pasa la variable de String a Double
		double radioDouble = Double.parseDouble(radioString);
		// muestra por pantalla la formula del area del circulo
		System.out.println("Formula del area de un circulo: area = (Pi * Radio^2)");
		// muestra por consola los valores de la operacion y el resultado final
		// elevar el cuadrado mediante Math.pow
		// Math.pow (base, exponente)
		System.out.println(pi + " * " + (Math.pow(radioDouble, exponenteCuadrado)) + " = " + (pi * Math.pow(radioDouble, exponenteCuadrado)));
		// muestra por ventana emergente la operacion y el resultado
		JOptionPane.showMessageDialog(null, (pi + " * " + Math.pow(radioDouble, exponenteCuadrado) + " = " + (pi * Math.pow(radioDouble, exponenteCuadrado))));
	}
}
