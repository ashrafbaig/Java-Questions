package BasicJava;

public class BinaryToDecimal {

	public static void main(String[] args) {
		long Binary=1011;
		System.out.println(isDecimal(Binary	));

	}

	public static long isDecimal(long num) {
		long decimal = 0, i = 0;
		long remainder;
		while (num != 0) {
			remainder = num % 10;
			decimal = (long) (decimal + remainder * Math.pow(2, i));
			num = num / 10;
			i++;

		}
return decimal;
	}
}
