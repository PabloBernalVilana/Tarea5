package tarea5Apartado13;

import javax.swing.JOptionPane;
/* @Author Pablo Bernal Vilana
 * Realiza operaciones en base a dos numeros 
 * y el signo aritmetico que introducimos mendiante 
 * JOptionPane 
 */

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		// entrada operador1 tipo string
		String operadorUno = JOptionPane.showInputDialog(null, "Introduce el valor de Operador 1: ");
		// transformar a tipo int
		int operadorUnoInt = Integer.parseInt(operadorUno);
		// entrada operador2 tipo string
		String operadorDos = JOptionPane.showInputDialog(null, "Introduce el valor de Operador 2: ");
		// transformar a tipo int
		int operadorDosInt = Integer.parseInt(operadorDos);
		// entrada signoAritmetico tipo string
		String signoAritmetico = JOptionPane.showInputDialog(null, "Introduce un signo aritmetico: ");

		switch (signoAritmetico) {
		case "+":
			// suma los dos operadores
			JOptionPane.showMessageDialog(null,
					operadorUnoInt + " + " + operadorDosInt + " = " + (operadorUnoInt + operadorDosInt));
			break;
		case "-":
			// resta los dos operadores
			JOptionPane.showMessageDialog(null,
					operadorUnoInt + " - " + operadorDosInt + " = " + (operadorUnoInt - operadorDosInt));
			break;
		case "*":
			// multiplica los dos operadores
			JOptionPane.showMessageDialog(null,
					operadorUnoInt + " * " + operadorDosInt + " = " + (operadorUnoInt * operadorDosInt));
			break;
		case "/":
			// divide los dos operadores
			JOptionPane.showMessageDialog(null,
					operadorUnoInt + " / " + operadorDosInt + " = " + (operadorUnoInt / operadorDosInt));
			break;
		case "^":
			// 1� operando como base y 2� como exponente
			JOptionPane.showMessageDialog(null,
					operadorUnoInt + " ^ " + operadorDosInt + " = " + (Math.pow(operadorUnoInt, operadorDosInt)));
			break;
		case "%":
			// m�dulo, resto de la divisi�n entre operando1 y operando2
			JOptionPane.showMessageDialog(null,
					operadorUnoInt + " % " + operadorDosInt + " = " + (operadorUnoInt % operadorDosInt));
			break;
		default:
			// Si no se introduce un signo de los anteriores
			// aparecera un mensaje de error y fin de la aplicacion
			JOptionPane.showMessageDialog(null, "Signo aritmetico incorrecto!");
			break;
		}
	}
}
