package BasicJava;

import java.util.Arrays;

public class TraverseaMatrix {
	//
	// public static void main(String[] args) {// creating a matrix
	// int original[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
	//
	// // creating another matrix to store transpose of a matrix
	// int transpose[][] = new int[3][3]; // 3 rows and 3 columns
	//
	// // Code to transpose a matrix
	// for (int i = 0; i < 3; i++) {
	// for (int j = 0; j < 3; j++) {
	// transpose[i][j] = original[j][i];
	// }
	// }
	//
	// System.out.println("Printing Matrix without transpose:");
	// for (int i = 0; i < 3; i++) {
	// for (int j = 0; j < 3; j++) {
	// System.out.print(original[i][j] + " ");
	// }
	// System.out.println();// new line
	// }
	// System.out.println("Printing Matrix After Transpose:");
	// for (int i = 0; i < 3; i++) {
	// for (int j = 0; j < 3; j++) {
	// System.out.print(transpose[i][j] + " ");
	// }
	// System.out.println();// new line
	// }
	// }
	//
	// }

	static int SIZE = 10;

	// function to sort the given matrix
	static void sortMat(int mat[][], int n) {
		// temporary matrix of size n^2
		int temp[] = new int[n * n];
		int k = 0;

		// copy the elements of matrix
		// one by one into temp[]
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				temp[k++] = mat[i][j];

		// sort temp[]
		Arrays.sort(temp);

		// copy the elements of temp[]
		// one by one in mat[][]
		k = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				mat[i][j] = temp[k++];
	}

	// function to print the given matrix
	static void printMat(int mat[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}

	// Driver program to test above
	public static void main(String args[]) {
		int mat[][] = { { 1, 2, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int n = 3;

		System.out.println("Original Matrix:");
		printMat(mat, n);

		sortMat(mat, n);

		System.out.println("Matrix After Sorting:");
		printMat(mat, n);

	}
}
