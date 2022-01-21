package BasicJava;

public class SwapTheNumbers {

	public static void main(String[] args) {
		// int num1 = 34;
		// int num2 = 65;
		// int temp;
		// System.out.println(" Num1 Value before swapping :" + num1);
		// System.out.println(" Num2 Value before swapping :" + num2);
		// temp = num1;
		// num1 = num2;
		// num2 = temp;
		//
		// System.out.println(" Num1 Value after swapping :" + num1);
		// System.out.println(" Num2 Value after swapping :" + num2);

		////////////// Without using Temp variable///////////////////////
		int num1 = 34;
		int num2 = 65;
		System.out.println(" Num1 Value before swapping :" + num1);
		System.out.println(" Num2 Value before swapping :" + num2);

		num1 = num1 -num2;
		num2 = num1+ num2;
		num1 = num2 - num1;
		System.out.println(" Num1 Value after swapping :" + num1);
		System.out.println(" Num2 Value after swapping :" + num2);

	}

}
