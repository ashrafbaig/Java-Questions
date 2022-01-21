package BasicJava;

public class AlphabetCheck {

	public static void main(String[] args) {
		char ch = 'b';

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " The Given Alphabate is a Character");
		} else {
			System.out.println(ch + " The Given Alphabate is not a Character");
		}
	}

}
