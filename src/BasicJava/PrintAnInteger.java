package BasicJava;

import java.util.Scanner;

public class PrintAnInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of your Choice");

		int num = scan.nextInt();
		System.out.println("The Number you have entered is :" + num);
	}

}
