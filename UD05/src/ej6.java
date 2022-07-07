import java.util.Scanner;

public class ej6 {
	public static void main(String[] args) {
		final double IVA = 0.21;
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un precio: ");
		double precio = sc.nextDouble();
		sc.close();
		double precio_final = precio + (precio * IVA);
		System.out.println("el precio final será: "+precio_final);
	}
}
