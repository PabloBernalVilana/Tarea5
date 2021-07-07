package tarea5Apartado1;
// @Author Pablo Bernal Vilana
// compara el valor asignado a dos variables enteras
// y muestra por consola si es mayor, menor o igual
public class MainApp {

	public static void main(String[] args) {
		// declaracion de variables y asignacion de un valor
		int num1 = 50;
		int num2 = 100;
		// condicional if - esle if - else
		if (num1 > num2) { // si es mayor que 
			System.out.println(num1 + " Es mayor que " + num2);
		} else if (num1 < num2) { // si es menor que
			System.out.println(num1 + " Es menor que " + num2);
		} else { // si no es mayor ni menor, es igual
			System.out.println(num1 + " Es igual que " + num2);
		}
	}
}
