package BasicJava;

public class CheckMatrixAreEqualsOrNot {

	public static void main(String[] args) {
		int a[][] = { { 4, 5, 6 }, { 3, 4, 1 }, { 1, 2, 3 } };

		int b[][] = { { 4, 5, 6 }, { 3, 4, 1 }, { 1, 2, 3 } };

		int rows = a.length;
		int cols = a[0].length;

		int rows1 = b.length;
		int cols1 = b[0].length;

		boolean flag = true;

		if (rows != rows1 || cols != cols1) {

			System.out.println("Matrix are not matching in lenght");
		} else {

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {

					if (a[i][j] != b[i][j]) {

						flag = false;
						break;
					}

				}

			}
			if (flag) {
				System.out.println("Matrix is equal");

			} else {
				System.out.println("Matrix is not equal");
			}
		}

	}

}
