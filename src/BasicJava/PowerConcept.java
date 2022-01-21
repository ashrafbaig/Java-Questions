package BasicJava;

public class PowerConcept {

	public static void main(String[] args) {

		int exponent = 4;
		int base = 3;
		long result = 1;
		while (exponent != 0) {
			result *= base;
			--exponent;
		}
		System.out.println(result);
		System.out.println(Math.pow(base, exponent));
	}
	
}
