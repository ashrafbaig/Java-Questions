package BasicJava;

public class DecimalToOctaNumber {

	public static void main(String[] args) {
		long Decimal = 109;
		System.out.println(isOcta(Decimal));

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
