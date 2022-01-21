package BasicJava;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 4;
		getfactorial(num);

	}

	public static void getfactorial(int num) {

		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}
		System.out.println("The factorial of the given Number " + num + " is " + fact);
	}

}
