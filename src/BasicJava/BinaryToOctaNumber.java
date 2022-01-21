package BasicJava;

public class BinaryToOctaNumber {

	public static void main(String[] args) {
		long BinaryNumber = 1011;
		long DecimalNumber = isDecimal(BinaryNumber);
		System.out.println(isOcta(DecimalNumber));

	}

	public static long isDecimal(long num) {
		long remainder;
		long decimal = 0, i = 0;
		while (num != 0) {
			remainder = num % 10;
			decimal += remainder * Math.pow(2, i);
			num = num / 10;
			i++;
		}
		return decimal;

	}

	public static long isOcta(long num) {
		long Octa = 0, i = 1, remainder = 1;
		while (num != 0) {
			remainder = num % 8;
			Octa += remainder * i;
			num = num / 8;
			i *= 10;

		}
		return Octa;
	}
}
