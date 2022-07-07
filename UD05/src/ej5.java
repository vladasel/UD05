import java.util.Scanner;
public class ej5 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("introduce un numero entero: ");
	     int num = sc.nextInt();
	     sc.close();
	     if(num%2==0) {
	    	 System.out.println("tu numero es divisible entre 2");
	     }else {
	    	 System.out.println("tu numero NO es divisible entre 2");
	     }
	}

}
