package BasicJava;

public class ArmstrongNumberTwoIntervals {

	public static void main(String[] args) {
		////// 20-30

		int low = 0;
		int high = 200;

		while (low < high) {
			double result = 0;
			int value = low;
			while (value != 0) {
				int n = value % 10;
				result = result + Math.pow(n, 3);
				value = value / 10;
			}
			if (low == result) {
				System.out.println("The Given Number is an Armstrong Number: " + low);
			} else {
				System.out.println("The Given Number is not an Armstrong Number: " + low);

			}

			low++;

		}

	}

}
