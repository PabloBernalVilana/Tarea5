package tarea5Apartado11;
import javax.swing.JOptionPane;
/* @Author Pablo Bernal Vilana
 * Lee un dia de la semana introducido mediante JOptionPane
 * segun el dia que sea, nos dira si nos toca trabajar o no
 * Mediante switch-case
  */
public class MainApp {

	public static void main(String[] args) {
		
		// Introducir dia de la semana
		String diaSemana = JOptionPane.showInputDialog(null, "Introduce un dia de la semana");
		// Cambia la primera letra de minuscula a mayuscula
		// asi podremos introducir los dias de la semana
		// en minuscula tambien sin que nos salte la opcion por defecto
		String diaMayuscula = diaSemana.toUpperCase().charAt(0) + diaSemana	.substring(1, diaSemana.length()).toLowerCase();
		// obtenemos el valor con la primera letra en minuscula
		// en la variable que se utilizara para seleccionar el caso
		diaSemana = diaMayuscula;	
		// se evalua si el valor de diaSemana corresponde a un dia de la semana
		// y muestra un mensaje en funcion de si el dia es laboral o no
		switch (diaSemana) {
		case "Lunes":
			JOptionPane.showMessageDialog(null,"Hoy es " + diaSemana + " y toca trabajar.");
			break;
		case "Martes":
			JOptionPane.showMessageDialog(null,"Hoy es " + diaSemana + " y toca trabajar.");
			break;
		case "Miercoles":
			JOptionPane.showMessageDialog(null,"Hoy es " + diaSemana + " y toca trabajar.");
			break;
		case "Jueves":
			JOptionPane.showMessageDialog(null,"Hoy es " + diaSemana + " y toca trabajar.");
			break;
		case "Viernes":
			JOptionPane.showMessageDialog(null,"Hoy es " + diaSemana + " y toca trabajar.");
			break;
		case "Sabado":
			JOptionPane.showMessageDialog(null,"Hoy es " + diaSemana + " y no toca trabajar.");
			break;
		case "Domingo":
			JOptionPane.showMessageDialog(null,"Hoy es " + diaSemana + " y no toca trabajar.");
			break;	
		default:
			// si introducimos una palabra diferente a los dias de la semana
			// nos saltara un mensaje diciendo que no se corresponde
			JOptionPane.showMessageDialog(null, diaSemana + " no corresponde a ningun dia de la semana");
		}

	}

}
