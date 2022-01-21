package BasicJava;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Two Number: ");
		double firstNumber = scan.nextDouble();
		double secondNumber = scan.nextDouble();
		System.out.println("Please Enter the Operators (+,-,/-*)");
		char operator = scan.next().charAt(0);
		double result = 0;
		switch (operator) {
		case '+':
			result = firstNumber + secondNumber;
			break;
		case '-':
			result = firstNumber - secondNumber;
			break;
		case '/':
			if (secondNumber != 0) {
				result = firstNumber / secondNumber;
			}
			break;
		case '*':
			result = firstNumber * secondNumber;
			break;

		default:
			System.out.println("Please Enter the Correct Operator");
			break;
		}

		System.out.println(result);

	}

}
