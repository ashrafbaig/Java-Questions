package BasicJava;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num = 56555;
		int rev = 0;
		int ActualNum = num;
		while (num != 0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}
		if (ActualNum == rev) {
			System.out.println("Number is a Plaindrome");
		} else {
			System.out.println("Number is not a Plaindrome");
		}
	}

}
