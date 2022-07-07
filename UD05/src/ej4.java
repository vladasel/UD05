import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		final double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un radio: ");
		String r = sc.nextLine();
		System.out.println("el area del circulo es: "+(PI*Math.pow(Double.parseDouble(r), 2)));
	}

}
