import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo numero: "));
		String operador = JOptionPane.showInputDialog("introduce el operador: ");

		switch (operador) {
		case "+":
			JOptionPane.showMessageDialog(null, "suma: " + (num1 + num2));
			break;
			
		case "-":
			JOptionPane.showMessageDialog(null, "resta: " + (num1 - num2));
			break;
			
		case "*":
			JOptionPane.showMessageDialog(null, "multiplicación: " + (num1 * num2));
			break;
			
		case "/":
			JOptionPane.showMessageDialog(null, "división: " + (num1 / num2));
			break;
			
		case "^":
			JOptionPane.showMessageDialog(null, "ponderación: " + Math.pow(num1, num2));
			break;
			
		case "%":
			JOptionPane.showMessageDialog(null, "modulo: " + (num1 % num2));
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "no es un operador válido");
			break;

		}

	}

}
