package BasicJava;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int a[][] = { { 1, 0, 0 }, { 2, 3, 4 }, { 1, 2, 4 } };

		int b[][] = { { 2, 1, 0 }, { 4, 1, 5 }, { 1, 0, 5 } };

		int rows = a.length;
		int cols = a[0].length;

		int rows1 = b.length;
		int cols1 = b[0].length;

		int sum = 0;
		int[][] mResult = new int[rows][cols1];
		if (cols != rows1) {
			System.out.println("Matrix multiplication is not possible");
		} else {

			for (int i = 0; i < rows; i++) { // rows from m1
				for (int j = 0; j < cols1; j++) { // columns from m2
					for (int k = 0; k < cols; k++) { // columns from m1
						sum += a[i][k] * b[k][j];

					}
					mResult[i][j] = sum;
					sum = 0;
				}

			}
		}

		for (int i = 0; i < rows; i++) { // rows from m1
			for (int j = 0; j < cols1; j++) {
				System.out.print(mResult[i][j] + " ");
			}
			System.out.println();
		}
	}

}
