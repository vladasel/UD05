import java.util.Scanner;

import javax.swing.JOptionPane;

public class ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = "hola";
		
		int i = 1;
		do{
			System.out.println("introduce la contraseña: ");
			String intento = sc.nextLine();
			if (intento.equals(password)) {
				System.out.println("enhorabuena!!");
				//JOptionPane.showMessageDialog(null, "Enhorabuena! ");
				break;
			} else {
				i++;
			}
			
		}while (i <= 3);
		sc.close();
	}

}
