package BasicJava;

public class ReverseTheSentenceNoSplit {

	public static void main(String[] args) {
		String name = "Hello World";
		int string_lenght = name.length() - 1;
		String reverse = "", temp = "";

		for (int i = 0; i <= string_lenght; i++) {
			temp += name.charAt(i);
			if ((name.charAt(i) == ' ') || (i == string_lenght)) {
				for (int j = temp.length() - 1; j >= 0; j--) {
					reverse += temp.charAt(j);
					if ((j == 0) && (i != string_lenght))
						reverse += " ";

					
				}
				temp = "";
			}

		}

		System.out.println(reverse);

	}

}
