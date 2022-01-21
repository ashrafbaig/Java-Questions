package BasicJava;

public class DecimalToBinary {

	public static void main(String[] args) {
		long Decimal=156;
		System.out.println(isBinary(Decimal));

	}
	
	public static long isBinary(long num) {
		long binary = 0, i = 1,remainder=1;
		while (num != 0) {
			remainder = num %2;
			binary += remainder *i;
			num = num / 2;
		i*=10;

		}
return binary;
	}

}
