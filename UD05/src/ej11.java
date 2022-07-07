import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un dia de la semana: ");
		String dia = sc.nextLine();
		sc.close();
		switch (dia.toLowerCase()) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("dia laborable");
			break;
		case "sabado":
		case "domingo":
			System.out.println("dia no laborable");
			break;
		default:
			break;

		}
	}

}
