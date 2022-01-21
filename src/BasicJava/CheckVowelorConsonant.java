package BasicJava;

public class CheckVowelorConsonant {

	public static void main(String[] args) {

		char ch = 'j';

//		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//			System.out.println("The Given Character is a vowel :" + ch);
//		} else {
//			System.out.println("The Given Character is a consonant :" + ch);
//		}
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("The Given Character is a vowel :" + ch);
			break;

		default:
			System.out.println("The Given Character is a consonant :" + ch);
			break;
		}

	}
}
