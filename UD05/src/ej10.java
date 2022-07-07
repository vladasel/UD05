import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		System.out.println("introduce numero de ventas: ");
		Scanner sc = new Scanner(System.in);
		int ventas = sc.nextInt();
		double precio = 0;
		for (int i = 1; i <= ventas; i++) {
			System.out.println("introduce precio");
			precio = precio + sc.nextDouble();
		}
		System.out.println("total ventas: " + precio);
	}

}
