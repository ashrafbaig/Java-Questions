package BasicJava;

public class SumofNaturalNumberUsingRecurssion {

	public static void main(String[] args) {
		// Recursion function calling itself

		int num = 10; /// 1+2+3+4+5+6...10

		int result = isNatural(num);
		System.out.println(result);

	}

	public static int isNatural(int num) {

		if (num != 0) {

			return num + isNatural(num - 1);
		} else {
			return num;
		}
	}

}
