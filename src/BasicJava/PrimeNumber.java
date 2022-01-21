package BasicJava;

public class PrimeNumber {

	public static void main(String[] args) {

		///// Prime Number is a number which is divisible by 1 and itself also Smallest
		///// prime number is 2 not 1 , 1 is not a prime number

		int Num = 17;

		boolean flag = false;
		if (Num != 0 && Num != 1) {
			for (int i = 2; i <= Num / 2; i++) {

				if (Num % 2 == 0) {
					flag = true;
					break;
				}
			}
		}else {
			flag=true;
		}
		if (!flag) {
			System.out.println(Num + " Number is a Prime Number");
		} else {
			System.out.println(Num + " Number is not a Prime Number");
		}
	}

}
