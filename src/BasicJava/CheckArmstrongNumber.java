package BasicJava;

public class CheckArmstrongNumber {

	public static void main(String[] args) {

		// 153 -> 1*1*1 + 5*5*5 + 3*3*3 = 153

		int num = 150;
		int ActualNum = num;
		double result = 0;

		while (num != 0) {

			int n = num % 10;
			result = result + Math.pow(n, 3);
			num = num / 10;

		}

		if (ActualNum == result) {
			System.out.println("The Given Number is an Armstrong Number: " + ActualNum);
		} else {
			System.out.println("The Given Number is not an Armstrong Number: " + ActualNum);

		}

	}

}
