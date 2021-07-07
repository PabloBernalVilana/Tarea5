package tarea5Apartado6;

import javax.swing.JOptionPane;
/* @Author Pablo Bernal Vilana
 * Lee la entrada desde teclado mediante JOptionPane
 * Transforma el tipo de dato de String a double porque puede contener decimales
 * muestra por ventana emergente la operacion y el resultado
 */
public class MainApp {
	
	public static void main(String[] args) {
		// declaracion de la constante del tipo double IVA 
		// y asignacion del valor
		final double IVA = 0.21;
		// entrada mediante JOptionPane
		String numeroString = JOptionPane.showInputDialog(null, "Introduce el precio de un producto: ");
		// transformacion a tipo double del tipo String
		double numeroDouble = Double.parseDouble(numeroString);
		// muestra en ventana emergente la operacion y su resultado
		// mediante JOptionPane
		JOptionPane.showMessageDialog(null, numeroDouble + " * " + IVA + " = " + (numeroDouble+(IVA * numeroDouble)) + " € ");
	}
}
