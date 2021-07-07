package tarea5Apartado3;
/* @Author Pablo Bernal Vilana
 * Pide la entrada de un nombre por teclado
 * asigna el nombre a una variable y lo muestra
 * por consola y por ventana emergente
 */
import javax.swing.JOptionPane;
public class MainApp {

	public static void main(String[] args) {
		// introducir el nombre por teclado usando JOptionPane
		// asignacion del nombre a la variable
		String nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre");
		// muestra por consola un mennsaje de bienvenida 
		// concatenando el nombre
		System.out.println("Bienvenido " + nombre);
		// muestra el mismo mensaje por ventana emergente
		// usando JOptionape
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
	}

}
