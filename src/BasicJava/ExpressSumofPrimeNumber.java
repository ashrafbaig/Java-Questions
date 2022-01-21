package BasicJava;

public class ExpressSumofPrimeNumber {

	public static void main(String[] args) {

		int Number = 50;
		boolean flag = false;

		for (int i = 2; i <= Number / 2; i++) {

			if (isPrimeNumber(i)) {

				if (isPrimeNumber(Number - i)) {
					System.out.println(Number + " = " + i + " + " + (Number - i));
					flag = true;
				}
			}
		}

		if (!flag) {
			System.out.println(Number + " Cannot be Express as Sum of Prime Number ");
		}

	}

	public static boolean isPrimeNumber(int num) {
		boolean flag = true;

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
