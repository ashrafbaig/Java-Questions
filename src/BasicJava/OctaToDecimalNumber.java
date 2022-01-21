package BasicJava;

public class OctaToDecimalNumber {

	public static void main(String[] args) {
		long Octa = 65;
		System.out.println(isDecimal(Octa));

	}

	public static long isDecimal(long num) {
		long Decimal = 0, i = 0, remainder;
		while (num != 0) {
			remainder = num % 10;
			Decimal += remainder * Math.pow(8, i);
			num = num / 10;
			i++;

		}
		return Decimal;
	}
}
