package exercicios;
import java.util.Scanner;

public class ext_base {
	public static void main(String[] args) throws Exception {
		//declaring a variable
		int number = 10; //assignment
		
		//reading a variable from keyboard
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		scanner.close();
		
		//printing a variable
		System.out.printf("The number is %d", number);
	}
}