package BasicJava;

public class GreatestNumberAmongThreeNumber {

	public static void main(String[] args) {
		int x = 34;
		int y = 446;
		int z = 67;

		if (x > y && x > z) {
			System.out.println(x + " is the greatest number");

		} else if (y > z) {
			System.out.println(y + " is the greatest number");
		} else {
			System.out.println(z + " is the greatest number");
		}

	}

}
