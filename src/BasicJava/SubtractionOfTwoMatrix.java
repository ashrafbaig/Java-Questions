package BasicJava;

public class SubtractionOfTwoMatrix {

	public static void main(String[] args) {
		int a[][] = { { 4, 5, 6 }, { 3, 4, 1 }, { 1, 2, 3 } };

		int b[][] = { { 2, 0, 3 }, { 2, 3, 1 }, { 1, 1, 1 } };
		/////// Addition Matrix
		int rows = a.length;
		int cols = a[0].length;

		int sub[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				sub[i][j] = a[i][j] - b[i][j];

			}

		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				System.out.print(sub[i][j] + " ");

			}
			System.out.println();

		}

	}

}
