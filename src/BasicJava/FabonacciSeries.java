package BasicJava;

public class FabonacciSeries {

	public static void main(String[] args) {
		int num = 10;
		int t1 = 0;
		int t2 = 1;
		int sum;
		////// 0 1 1 2 3 5 8...............

		for (int i = 1; i <= num; i++) {
			System.out.println(t1);
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;

		}

	}

}
