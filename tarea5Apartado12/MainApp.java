package tarea5Apartado12;

import javax.swing.JOptionPane;

/* @Author Pablo Bernal Vilana
 * La aplicacion evalua si la contraseņa que introducimos
 * mediante la entrada con JOptionPane corresponde a la 
 * contraseņa que tenemos guardada en la variable correctPassowrd
 *   
 */
public class MainApp {

	public static void main(String[] args) {
		// introduccion de la contraseņa a comparar
		String inputPassword = JOptionPane.showInputDialog(null, "Contraseņa: ");
		// definicion de la constante que sera nuestra contraseņa
		final String correctPassword = "pepe";
		// boolean para la condicion de salida
		boolean correcto = false;
		// contador
		int i = 1;
		// si la contraseņa entrada es igual a la correcta
		if (inputPassword.equals(correctPassword)) {
			// mostrar mensaje
			JOptionPane.showMessageDialog(null, "Enhorabuena!");
			// cambio de estado de la variable correcto
			// para evitar que entre en el bucle while
			correcto = true;
		} else {
			// Mientras llevemos menos de 3 intentos
			// y no hayamos acertado la contraseņa en el intento anterior
			// tendremos que introducir nuevamente la contraseņa
			while (i != 3 && correcto != true) {
				JOptionPane.showMessageDialog(null, "La contraseņa introducida es incorrecta");
				inputPassword = JOptionPane.showInputDialog(null, "Contraseņa: ");
				i++;
				// si la contraseņa que hemos introducido coincide
				// con la contraseņa que hemos definido en inputPassword
				// Muestra mensaje y cambia el estado de correcto a true
				// para asegurar la salida del bucle independientemente
				// de que lleve menos de 3 aciertos
				if (inputPassword.equals(correctPassword)) {
					JOptionPane.showMessageDialog(null, "Enhorabuena!");
					correcto = true;
					// i = 3;
				}
			}
		}
	}
}
