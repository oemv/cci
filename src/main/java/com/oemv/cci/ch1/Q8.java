package com.oemv.cci.ch1;

public class Q8 {
	public static int[][] zerofy(int[][] m) {
		int M = m.length;
		int N = m[0].length;
		int[][] registry = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (0 == m[i][j]) {
					registry[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (1 == registry[i][j]) {
					_zerofy(m, i, j);
				}
			}
		}

		return m;
	}

	private static void _zerofy(int[][] m, int row, int column) {
		// zerofy row
		for (int i = 0; i < m[0].length; i++) {
			m[row][i] = 0;
		}
		// zerofy column
		for (int i = 0; i < m.length; i++) {
			m[i][column] = 0;
		}
	}

	/**
	 * Zerofy marking rows and columns
	 * 
	 * @param m
	 * @return
	 */
	public static int[][] zerofy2(int[][] m) {
		int M = m.length;
		int N = m[0].length;

		int rows[] = new int[M];
		int columns[] = new int[N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (0 == m[i][j]) {
					rows[i] = 1;
					columns[j] = 1;
				}
			}
		}

		for (int i = 0; i < M; i++) {
			if (1 == rows[i]) {
				zerofyRow(m, i);
			}
		}

		for (int i = 0; i < N; i++) {
			if (1 == columns[i]) {
				zerofyColumn(m, i);
			}
		}
		return m;
	}

	private static void zerofyColumn(int[][] m, int column) {
		for (int i = 0; i < m.length; i++) {
			m[i][column] = 0;
		}
	}

	private static void zerofyRow(int[][] m, int row) {
		for (int i = 0; i < m[0].length; i++) {
			m[row][i] = 0;
		}
	}	
	
	/**
	 * From Book: First row and column are traversed to check if they need to be nullified,
	 *  then the rest of the matrix is traversed and indications to either nullify or not the row/column are stored 
	 *  in the first row/column itself.
	 * @param matrix
	 */
	public static int[][] setZeros(int[][] matrix) {
		boolean rowHasZero = false;
		boolean colHasZero = false;		
		
		// Check if first row has a zero
		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				rowHasZero = true;
				break;
			}
		}		
		
		// Check if first column has a zero
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				colHasZero = true;
				break;
			}
		}		
		
		// Check for zeros in the rest of the array
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length;j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
		 		}
			}
		}		
		
		// Nullify rows based on values in first column
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				zerofyRow(matrix, i);
			}
		}		
		
		// Nullify columns based on values in first row
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				zerofyColumn(matrix, j);
			}
		}	
		
		// Nullify first row
		if (rowHasZero) {
			zerofyRow(matrix, 0);
		}
		
		// Nullify first column
		if (colHasZero) {
			zerofyColumn(matrix, 0);
		}
		
		return matrix;
	}	
}
