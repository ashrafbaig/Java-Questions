package BasicJava;

public class FactorialbyRecursive {

	public static void main(String[] args) {
		int num=3;
		
		int Factorial = isFactorial(num);
		
		System.out.println(Factorial);

	}

	public static int isFactorial(int num) {

		if (num >= 1) {
			return num * isFactorial(num - 1);

		} else {
			return 1;
		}
	}
}
