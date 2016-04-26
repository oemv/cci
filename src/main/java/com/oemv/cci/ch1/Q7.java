package com.oemv.cci.ch1;

public class Q7 {

	// O(N^2)
	public static int[][] rotate(int[][] m) {
		int length = m[0].length;
		for (int i = 0; i < length / 2; i++) {
			int max = length - i - 1;
			for (int j = 0; j < max - i; j++) {
				int temp = m[i][i + j];
				m[i][i + j] = m[max - j][i];
				m[max - j][i] = m[max][max - j];
				m[max][max - j] = m[i + j][max];
				m[i + j][max] = temp;
			}
		}
		return m;
	}

	// Book's solution
	public static boolean rotate2(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length)
			return false; // Not a square
		int n = matrix.length;

		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last - offset][first];

				// bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
		return true;
	}

	
}
