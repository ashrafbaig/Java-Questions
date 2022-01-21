package BasicJava;

public class PrimeNumberTwoIntervals {

	public static void main(String[] args) {
		// 50 -100

		int low = 50;
		int high = 100;
		
		while (low < high) {
			boolean flag = false;
			for (int i = 2; i <= low / 2; i++) {

				if (low % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.println(low);
			}
			low++;
		}

	}

}
