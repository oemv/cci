package com.oemv.cci.ch1;

public class Q7 {

	public static int[][] rotate(int[][] m) {
		int length = m[0].length;
		for (int i = 0; i < length / 2; i++) {
			int size = length - i - 1;
			for (int j = 0; j <= size / 2; j++) {
				int temp = m[i][size - j];
				m[i][size - j] = m[j][i];
				m[j][i] = m[size][j];
				m[size][j] = m[size - j][size];
				m[size - j][size] = temp;
			}
		}
		return m;
	}

	public static void main(String[] args) {
		print(rotate(new int[][] { { 1, 2 }, { 3, 4 } }));
		print(rotate(rotate(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } })));
	}

	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
