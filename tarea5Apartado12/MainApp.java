package tarea5Apartado12;

import javax.swing.JOptionPane;

/* @Author Pablo Bernal Vilana
 * La aplicacion evalua si la contraseña que introducimos
 * mediante la entrada con JOptionPane corresponde a la 
 * contraseña que tenemos guardada en la variable correctPassowrd
 *   
 */
public class MainApp {

	public static void main(String[] args) {
		// introduccion de la contraseña a comparar
		String inputPassword = JOptionPane.showInputDialog(null, "Contraseña: ");
		// definicion de la constante que sera nuestra contraseña
		final String correctPassword = "pepe";
		// boolean para la condicion de salida
		boolean correcto = false;
		// contador
		int i = 1;
		// si la contraseña entrada es igual a la correcta
		if (inputPassword.equals(correctPassword)) {
			// mostrar mensaje
			JOptionPane.showMessageDialog(null, "Enhorabuena!");
			// cambio de estado de la variable correcto
			// para evitar que entre en el bucle while
			correcto = true;
		} else {
			// Mientras llevemos menos de 3 intentos
			// y no hayamos acertado la contraseña en el intento anterior
			// tendremos que introducir nuevamente la contraseña
			while (i != 3 && correcto != true) {
				JOptionPane.showMessageDialog(null, "La contraseña introducida es incorrecta");
				inputPassword = JOptionPane.showInputDialog(null, "Contraseña: ");
				i++;
				// si la contraseña que hemos introducido coincide
				// con la contraseña que hemos definido en inputPassword
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
