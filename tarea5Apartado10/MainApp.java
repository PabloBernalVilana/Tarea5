package tarea5Apartado10;
import javax.swing.JOptionPane;
/*
 * Realiza una aplicación que nos pida un número de ventas a introducir, después nos
 * pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final
 * mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 * 
 * 
 */
public class MainApp {

	public static void main(String[] args) {
		
		String ventasString = JOptionPane.showInputDialog(null, "Introduce el numero de ventas: ");
		int ventasInt = Integer.parseInt(ventasString);
		// variable a nivel de clase, para poder acceder desde
		// el interior del for para recoger el valor total
		// pero solo mostrarlo una vez
		double precioTotal = 0;
		// bucle for, se repite tantas veces como numero de 
		// ventas hayamos introducido
		for (int i = 1; i <= ventasInt; i++) {
			// entrada por teclado del precio de los articulos
			String precioString = JOptionPane.showInputDialog(null, "Introduce el precio de los articulos: ");
			// transformacion de String a Double
			double precioDouble = Double.parseDouble(precioString);
			// sumamos a la variable precioTotal la cantidad del articulo
			// partiendo de que el valor inicial de precioTotal es 0
			precioTotal = precioTotal + precioDouble;
		}
		//Muestra en una ventana emergente le valor total de los articulos introducidos
		JOptionPane.showMessageDialog(null, " Precio total de los artículos: " + precioTotal + "   €. ");
	}
}
