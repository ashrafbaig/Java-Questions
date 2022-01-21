package BasicJava;

public class CalculateNumberofDigit {

	public static void main(String[] args) {

		long num = 345545;
		int count = 0;

		while (num != 0) {
			num = num / 10;
			++count;
		}
		System.out.println("Number of Digits in a given Number is : " + count);
	}

}
